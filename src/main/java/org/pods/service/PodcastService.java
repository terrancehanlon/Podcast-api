package org.pods.service;

import org.pods.data.Podcast;
import org.pods.data.PodcastRepository;
import org.pods.mappers.PodcastMapper;
import org.pods.util.PodcastRequest;
import org.pods.util.PodcastResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PodcastService implements BaseService{
	
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
	
	public static String getIdForRegion(String region) {
		if(region.equals("us")) {
			return "1";
		}
		else {
			return "5";
		}
	}
	
	public static String getGenreIdByName(String genreName) {
		if(genreName.contains("web")) {
			return "5";
		}
		else {
			return "1";
		}
	}
	
	public PodcastRequest formRequest(String genreName, String region) {
		String gn = getGenreIdByName(genreName);
		String r = getIdForRegion(region);
		System.out.println("service: " + gn);
		System.out.println("Service: " + r);
		return podcastMapper.finalizeRequest(gn, r);
	}
	
	public PodcastResponse getResponse(PodcastRequest request) {
		System.out.println("service ressponse:  "+ request.getGenre());
		System.out.println("service response" + request.getRegion());
		List<Podcast> podcasts = podcastRepository.findByGenreInAndRegionIn(request.getGenre(), request.getRegion());
//		List<Podcast> podcasts = (List<Podcast>)podcastRepository.findAll();
		return podcastMapper.finalizeResponse(podcasts);
	}
	
	public Iterable<Podcast> getBestPodcastList(){
		return podcastRepository.findAll();
	}
}
