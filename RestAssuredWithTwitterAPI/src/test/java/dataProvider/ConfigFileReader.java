package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	private	Properties properties;
	private final String propertyFilePath = System.getProperty("user.dir")+"\\environment.properties"; 

	public ConfigFileReader()
	{
		try 
		{
			BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			properties.load(reader);
			reader.close();
			
		} catch (FileNotFoundException e) 
		{e.printStackTrace();}
		catch (IOException e) 
		{e.printStackTrace();}
	}
	
	
	public String getHost()
	{
		String host = properties.getProperty("HOST");
		if(host!=null)
			return host;
		else
			throw new RuntimeException("HOST not defined in Property file");
	}
	
	public String getConsumerAPIKey()
	{
		String consumerAPIKey = properties.getProperty("consumerAPIKey");
		if(consumerAPIKey!=null)
			return consumerAPIKey;
		else
			throw new RuntimeException("ConsumerAPIKey not defined in Properties file");
	}
	
	public String getConsumerSecretAPIKey()
	{
		String consumerSecretAPIKey = properties.getProperty("consumerAPIsecretKey");
		if(consumerSecretAPIKey!=null)
			return consumerSecretAPIKey;
		else
			throw new RuntimeException("ConsumerSecretAPIKey not defined in Properties file");
	}
	
	public String getAccessToken()
	{
		String accessToken = properties.getProperty("accessToken");
		if(accessToken!=null)
			return accessToken;
		else
			throw new RuntimeException("AccessToken not defined in Properties file");
	}
	
	public String getAccessTokenSecret()
	{
		String accessTokenSecret = properties.getProperty("accessTokenSecret");
		if(accessTokenSecret!=null)
			return accessTokenSecret;
		else
			throw new RuntimeException("AccessTokenSecret not defined in Properties file");
	}
}
