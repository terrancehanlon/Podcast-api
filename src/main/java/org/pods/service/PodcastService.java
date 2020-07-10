package org.pods.service;

import org.pods.data.Podcast;
import org.pods.data.PodcastRepository;
import org.pods.mappers.PodcastMapper;
import org.pods.util.PodcastRequest;
import org.pods.util.PodcastResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class PodcastService implements BaseService{
	
	//Example of some other business logic that would be performed here
	private int clicks = 0;
	
	@Autowired
	private PodcastRepository podcastRepository;
	
	@Autowired
	private PodcastMapper podcastMapper;

	
	public PodcastService() {
	}
	
	public void incrementClicks() {
		this.clicks++;
	}
	
	//A service method example, if the region comes in as a string i.e 'us' this can be mapped to a number value, which 
	//might make it easier for searching in a data layer.
	public static String getIdForRegion(String region) {
		if(region.equals("us")) {
			return "1";
		}
		else {
			return "5";
		}
	}
	public static int findCountById(int id) {
		//in a real scenario I would traverse another many to many table to get the count, or make a call to another API
		Random rand = new Random();
		return rand.nextInt(99) + 1;
	}
	public static String findPublisherByTitle(String title) {
		//would use another many to many table relationship
		if(title.contains("Web")) {
			return "Web Avengers";
		}
		else {
			return "UX avengers";
		}
	}
	
	//Another example of a method that would consist in a service. Maps out the passed in genre to an id value that could make it 
	//faster and easier to search for on the data layer
	public static String getGenreIdByName(String genreName) {
		if(genreName.contains("web")) {
			return "5";
		}
		else {
			return "5";
		}
	}

	//Used when the response is from the data layer, data layer would store these values as numbers, but if we want
	//to display them as strings we can map them back.
	public static String getGenreByGenreId(String genreId){
		if(genreId.contains("5")){
			return "Web Dev";
		}else if(genreId.contains("6")){
			return "UX";
		}
		else{
			return "Server";
		}
	}
	

	//Forms the request from the data passed into it from the client.
	//Having this service method is safer because it allows us to manipulate the data before reaching the data layer.
	public PodcastRequest formRequest(String genreName, String region) {
		return podcastMapper.finalizeRequest(getGenreIdByName(genreName), getIdForRegion(region));
	}
	
	//Takes a PodcastRequest object (which contains the data we want from the data layer) and feeds it into the CrudRepository 
	//Then maps the values back into what we want the client to see.
	public PodcastResponse getResponse(PodcastRequest request) {
		List<Podcast> podcasts = podcastRepository.findByGenreInAndRegionIn(request.getGenre(), request.getRegion());
		for(Podcast podcast : podcasts){
			podcast.setGenre(getGenreByGenreId(podcast.getGenre()));
		}
		return podcastMapper.finalizeResponse(podcasts);
	}	
	
	public Iterable<Podcast> getBestPodcastList(){
		return podcastRepository.findAll();
	}
}
