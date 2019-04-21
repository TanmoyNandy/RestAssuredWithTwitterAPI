package reusableMethods;

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

}
