package resources.testdata.domain;

import java.util.HashMap;

import lombok.Getter;

@Getter
public class PostWelcomeMessageData {
	
	private String name;
	private String messageData;
	private String text;
	
	public PostWelcomeMessageData(HashMap<String, String> datamap)
	{
		this.name = datamap.get("name");
		this.messageData = datamap.get("messageData");
		this.text = datamap.get("text");
	}

}
