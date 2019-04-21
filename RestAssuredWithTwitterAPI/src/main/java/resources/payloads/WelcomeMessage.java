package resources.payloads;

import java.util.HashMap;

import org.testng.annotations.Test;

import resources.testdata.domain.PostWelcomeMessageData;

public class WelcomeMessage {
	
	public static String getSimpleWelcomePayload(HashMap<String, String> datamap)
	{
		PostWelcomeMessageData postWelcomeMessageData = new PostWelcomeMessageData(datamap);
		String name = postWelcomeMessageData.getName();
		String text = postWelcomeMessageData.getText();
		String b = "{"+
				"\"welcome_message\" : {"+
				"\"name\": \""+name+"\","+
				"\"message_data\": {"+
				"\"text\": \""+text+"\""+
				"}"+
				"}"+
			"}";
		return b;
	}
	
	@Test
	public static void getMediaWelcomePayload()
	{
		String b = "{"+
				"\"welcome_message\" : {"+
				"\"name\": \"simple_welcome-message 01\","+
				"\"message_data\": {"+
				"\"text\": \"Welcome!\","+
		      	"\"attachment\": {"+
		        "\"type\": \"media\","+
		        "\"media\": {"+
		          "\"id\": \"48909183894931\""+
		        "}"+
		        "}"+
		        "}"+
		        "}"+		
		"}";
		System.out.println(b);
		//return b;
	}

}
