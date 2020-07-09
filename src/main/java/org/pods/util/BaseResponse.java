package org.pods.util;

import java.util.ArrayList;
import java.util.List;

public class BaseResponse {
	
	List<BaseResponseObject> responseObjects;
	
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
	
	
	
}
