package org.pods.util;

import java.util.List;

public class PodcastResponse extends BaseResponse {
		
	public PodcastResponse() {
		super();
	}
	
	public PodcastResponse(List<BaseResponseObject> responseObjects) {
		super(responseObjects);
		// TODO Auto-generated constructor stub
	}
	
	public void addPodcast(PodcastResponseObject podcastResponseObject) {
		this.responseObjects.add(podcastResponseObject);
	}

}
