package resources.pojoForResponsePayloads;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Description {
	ArrayList<Object> urls = new ArrayList<Object>();

}
