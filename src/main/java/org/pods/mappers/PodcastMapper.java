package org.pods.mappers;

import java.util.ArrayList;
import java.util.List;

import org.pods.data.Podcast;
import org.pods.util.PodcastRequest;
import org.pods.util.PodcastResponse;
import org.pods.util.PodcastResponseObject;
import org.springframework.stereotype.Service;

@Service
public class PodcastMapper {
	
	public PodcastRequest finalizeRequest(String genre, String region) {
		return new PodcastRequest(genre, region);
	}
	
	public PodcastResponse finalizeResponse(List<Podcast> podcasts) {
		
		PodcastResponse response = new PodcastResponse();
		
		for(Podcast podcast : podcasts) {
			PodcastResponseObject responseObject = new PodcastResponseObject(	podcast.getname(), podcast.getGenre(), 
																				podcast.getLink(), podcast.getImage(), podcast.getDescrip());
			response.addPodcast(responseObject);
		}
		
		return response;
	}
	
}
