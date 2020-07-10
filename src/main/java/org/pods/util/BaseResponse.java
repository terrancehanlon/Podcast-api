package org.pods.util;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

//Each response to the client would have the data associated with this class
public class BaseResponse {
	
	@JsonProperty("podcasts")
	List<BaseResponseObject> responseObjects;
	
	int id;
	
	public BaseResponse() {
		this.responseObjects = new ArrayList<BaseResponseObject>();
	}

	public BaseResponse(List<BaseResponseObject> responseObjects) {
		super();
		this.responseObjects = responseObjects;
	}

	public List<BaseResponseObject> getResponseObjects() {
		return responseObjects;
	}

	public void setResponseObjects(List<BaseResponseObject> responseObjects) {
		this.responseObjects = responseObjects;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	
	
}
