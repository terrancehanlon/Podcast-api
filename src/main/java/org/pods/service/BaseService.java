package org.pods.service;

import org.pods.util.PodcastRequest;
import org.pods.util.PodcastResponse;

//An Interface that can be used for services
//The functions i defined here would probably be shared in each different request
//for example if we expanded on this project to include functionality for a podcast-playlist, that service would need these two functions.
public interface BaseService {
		
	public void incrementClicks();
	
	public PodcastRequest formRequest(String genre, String region);
	public PodcastResponse getResponse(PodcastRequest request);

}
