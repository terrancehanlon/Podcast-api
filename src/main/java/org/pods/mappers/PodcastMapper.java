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
	
	
	//these functions would be in another service or could be retireved from the data layer and eventually mapped. I decided to put the logic in here rather than create another service/pull from the data layer
	public static String getLanguageByRegion(String region) {
		return "English";
	}
	
	public long getEariestDate(int id) {
		return 100005;
	}
	
	public long getLatestDate(int id) {
		return 900005;
	}
	
	public int getEpCount(int id) {
		return 8;
	}
	
	public String findCountryById(int id) {
		return "USA";
	}

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
	public PodcastResponse finalizeResponse(List<Podcast> _podcasts) {
		
		PodcastResponse response = new PodcastResponse();
		
		for(Podcast podcast : _podcasts) {
			PodcastResponseObject  responseObj = new PodcastResponseObject(	podcast.getname(), podcast.getGenre(), 
																				podcast.getLink(), podcast.getImage(), podcast.getDescrip(),
																			getEpCount(podcast.getId()), getLatestDate(podcast.getId()), getEariestDate(podcast.getId()));
			responseObj.setLangauge(getLanguageByRegion(podcast.getRegion()));
			responseObj.setCountry(findCountryById(podcast.getId()));
			
			response.addPodcast(responseObj);
		}
		
		return response;
	}
	
}
