package org.pods.service;

import org.pods.util.PodcastRequest;
import org.pods.util.PodcastResponse;

public interface BaseService {
		
	public void incrementClicks();
	
	public PodcastRequest formRequest(String genre, String region);
	public PodcastResponse getResponse(PodcastRequest request);

}
