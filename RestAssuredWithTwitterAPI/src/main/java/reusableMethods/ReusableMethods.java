package reusableMethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class ReusableMethods {
	
	public static JsonPath rawToJson(Response response)
	{
		return new JsonPath(response.asString());
	}
	
	public static XmlPath rawToXML(Response response)
	{
		return new XmlPath(response.asString());
	}
	
	public static String generateStringFromJson(String pathOfJsonFile) throws IOException
	{
		return new String(Files.readAllBytes(Paths.get(pathOfJsonFile)));
	}

}
