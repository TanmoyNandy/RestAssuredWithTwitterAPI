package testCases;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import dataProvider.ConfigFileReader;
import dataProvider.DataHub;
import resources.testdata.domain.GetStatusFromHomeTimelineData;
import resources.testdata.domain.PostATweetData;
import resources.testdata.domain.PostWelcomeMessageData;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import lombok.Data;
import reusableMethods.ReusableMethods;
import static resources.payloads.WelcomeMessage.getSimpleWelcomePayload;

import java.util.HashMap;
import java.util.List;

import resources.endpointResources.Resources;
import resources.pojoForResponsePayloads.DeleteATweetPOJO;
import resources.pojoForResponsePayloads.PostATweetPOJO;
import resources.pojoForResponsePayloads.StatusFromHomeTimelinePOJO;

public class Tests {	
	
	private static final String GETSTATUSFROMHOMETIMELINE = "GetStatusFromHomeTimeline";
	private static final String POSTATWEET = "PostATweet";
	private static final String POSTWELCOMEMESSAGE = "PostWelcomeMessage";
	
	ConfigFileReader configFileReader;
	String consumerAPIKey;
	String consumerAPIsecretKey;
	String accessToken;
	String accessTokenSecret;
	String id;
	String tweet;
	
	@BeforeTest(alwaysRun=true)
	public void setup()
	{
		configFileReader = new ConfigFileReader();
		consumerAPIKey = configFileReader.getConsumerAPIKey();
		consumerAPIsecretKey = configFileReader.getConsumerSecretAPIKey();
		accessToken = configFileReader.getAccessToken();
		accessTokenSecret = configFileReader.getAccessTokenSecret();
		tweet = "First Tweet from Rest assured automation framework";
		
	}
	
	@Test(priority=0, groups = "demo")
	public void getStatusFromHomeTimeline()
	{
		RestAssured.baseURI = configFileReader.getHost();
		HashMap<String, String> datamap = new HashMap<String, String>();
		datamap = DataHub.DataMap(GETSTATUSFROMHOMETIMELINE, 1);
		GetStatusFromHomeTimelineData getStatusFromHomeTimelineData = new GetStatusFromHomeTimelineData(datamap);
		List<StatusFromHomeTimelinePOJO> statuses =
				given().
					auth().oauth(consumerAPIKey, consumerAPIsecretKey, accessToken, accessTokenSecret).
					queryParam("count", getStatusFromHomeTimelineData.getCount()).
				when().
					get(Resources.getStatusFromHomeTimelineResource()).
				then().
					extract().response().jsonPath().getList("", StatusFromHomeTimelinePOJO.class);
		
		for(StatusFromHomeTimelinePOJO s : statuses)
		{
			Assert.assertNotNull(s.getId());	
			Assert.assertNotNull(s.getText());
			Assert.assertEquals(s.getUser().getFollowing(), true);
		}
			
	}
	
	
	@Test(priority=1)
	public void postATweet()
	{
		RestAssured.baseURI = configFileReader.getHost();
		HashMap<String, String> datamap = new HashMap<String, String>();
		datamap = DataHub.DataMap(POSTATWEET, 1);
		PostATweetData postATweetData = new PostATweetData(datamap);
		PostATweetPOJO postATweet = 
				given().
					auth().oauth(consumerAPIKey, consumerAPIsecretKey, accessToken, accessTokenSecret).
					queryParam("status", postATweetData.getStatus()).
				when().
					post(Resources.getPostATweetResource()).
				then().
					extract().response().as(PostATweetPOJO.class);
		if(postATweet==null)
			System.out.println("Null");
		else
			System.out.println("Not Null");
		
		System.out.println(postATweet.getCreated_at());
		
		Assert.assertNotNull(postATweet.getCreated_at());
		id = postATweet.getId();
		System.out.println(id);
		Assert.assertNotNull(postATweet.getId());
		Assert.assertEquals(postATweet.getText(), tweet);
		Assert.assertEquals(postATweet.getUser().getFriends_count(), 417f);
				
	}
	
	@Test(priority=2)
	public void deleteATweet()
	{
		RestAssured.baseURI = configFileReader.getHost();
		HashMap<String, String> datamap = new HashMap<String, String>();
		datamap = DataHub.DataMap(POSTATWEET, 1);
		PostATweetData postATweetData = new PostATweetData(datamap);
		Response response = 
				given().
					auth().oauth(consumerAPIKey, consumerAPIsecretKey, accessToken, accessTokenSecret).
				when().
					post(Resources.getDeleteTweetResource(id)).
				then().
					extract().response();		
		
		Gson gs = new Gson();
		DeleteATweetPOJO deleteATweet = gs.fromJson(response.asString(), DeleteATweetPOJO.class);
		System.out.println("The tweet that got deleted is as under:");
		System.out.println(deleteATweet.getText());
		System.out.println(deleteATweet.getId());
		Assert.assertEquals(deleteATweet.getText(), postATweetData.getStatus());
		Assert.assertEquals(deleteATweet.getId(), id);
		Assert.assertEquals(response.statusCode(), 200);
	}
	
	@Test(priority=3)
	public void postWelcomeMessage()
	{
		RestAssured.baseURI = configFileReader.getHost();
		HashMap<String, String> datamap = new HashMap<String, String>();
		datamap = DataHub.DataMap(POSTWELCOMEMESSAGE, 1);		
		PostWelcomeMessageData postWelcomeMessageData = new PostWelcomeMessageData(datamap);
		Response response = 
				given().
					auth().oauth(consumerAPIKey, consumerAPIsecretKey, accessToken, accessTokenSecret).
					header("Content-Type","application/json").
					body(getSimpleWelcomePayload(datamap)).
				when().
					post(Resources.getWelcomeMessagePostResource()).
				then().
					statusCode(200).extract().response();
		JsonPath js= ReusableMethods.rawToJson(response);
		Assert.assertEquals(js.get("welcome_message.message_data.text"), postWelcomeMessageData.getText());
		id = js.get("welcome_message.id").toString();
	}
	
	@Test(priority=4)
	public void deleteWelcomeMessage()
	{
		RestAssured.baseURI = configFileReader.getHost();
				given().
					auth().oauth(consumerAPIKey, consumerAPIsecretKey, accessToken, accessTokenSecret).
					queryParam("id", id).
				when().
					delete(Resources.getDeleteWelcomeMessageResource()).
				then().
					statusCode(204);
	}
}
