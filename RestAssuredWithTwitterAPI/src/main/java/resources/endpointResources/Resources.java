package resources.endpointResources;

public class Resources {
	
	public static String getStatusFromHomeTimelineResource()
	{
		String res = "/statuses/home_timeline.json";
		return res;
	}
	
	public static String getPostATweetResource()
	{
		String res = "/statuses/update.json";
		return res;
	}
	
	public static String getDeleteTweetResource(String id)
	{
		String res = "/statuses/destroy/"+id+".json";
		return res;
	}
	
	public static String getWelcomeMessagePostResource()
	{
		String res = "/direct_messages/welcome_messages/new.json";
		return res;
	}
	
	public static String getDeleteWelcomeMessageResource()
	{
		String res ="/direct_messages/welcome_messages/destroy.json";
		return res;
	}

}
