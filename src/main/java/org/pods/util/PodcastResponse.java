package org.pods.util;

import java.util.List;

//derived class of BaseResponse
public class PodcastResponse extends BaseResponse {
		
	public PodcastResponse() {
		super();
	}
	
	public PodcastResponse(List<BaseResponseObject> responseObjects) {
		super(responseObjects);
	}
	
	public void addPodcast(PodcastResponseObject podcastResponseObject) {
		this.responseObjects.add(podcastResponseObject);
	}

}
