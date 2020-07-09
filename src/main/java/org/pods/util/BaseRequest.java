package org.pods.util;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class BaseRequest {
	
	private String genre;
	private String region;
	public BaseRequest(String genre, String region) {
		super();
		this.genre = genre;
		this.region = region;
	}
	
	public BaseRequest generateRequest(String genre, String region) {
		return new BaseRequest(genre, region);
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	

	
}
