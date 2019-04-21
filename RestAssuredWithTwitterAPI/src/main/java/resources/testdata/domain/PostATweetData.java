package resources.testdata.domain;

import java.util.HashMap;

import lombok.Getter;

@Getter
public class PostATweetData {
	
	private String status;
	
	public PostATweetData(HashMap<String, String> datamap)
	{
		this.status = datamap.get("status");
	}

}
