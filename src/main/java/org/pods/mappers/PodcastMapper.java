package org.pods.mappers;

import java.util.ArrayList;
import java.util.List;

import org.pods.data.Podcast;
import org.pods.util.PodcastRequest;
import org.pods.util.PodcastResponse;
import org.pods.util.PodcastResponseObject;
import org.springframework.stereotype.Service;

@Service
public class PodcastMapper implements BaseMapper{

	/* 
		implementation of the basemapper interface. 
		After the raw request is passed into the service, the service methods are applied to it and passed to the mapper. 
		Here is where it forms the request that will be retrieved from the data layer.
	*/

	public PodcastRequest finalizeRequest(String genre, String region) {
		return new PodcastRequest(genre, region);
	}
	
	//The data layer will return the entity type, in this case it's of type Podcast.
	//So this function maps those Podcast objects to a PodcastResponse object, showing the values we want to the client.
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
