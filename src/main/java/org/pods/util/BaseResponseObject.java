package org.pods.util;

import com.fasterxml.jackson.annotation.JsonProperty;

//Since the get request is to getting a list of podcasts, I figured it would be best to have each object in the list
//be it's own `response object`, that way it would be neater and easier to follow if there were different types of responses.

public class BaseResponseObject {
	private String name;
	private String genre;
	
	@JsonProperty("website")
	private String link;
	
	@JsonProperty("image")
	private String imageLink;
	private String description;
	private int totalEps;
	private boolean explContent;
	private int tunesId;
	private String rss;
	private long latestPubDate;
	private long earlPubDate;
	private String langauge;
	private String country;
	
	@JsonProperty("extra")
	private ExtraObject ob;
	
	@JsonProperty("looking_for")
	private LookingFor lf;
	
	@JsonProperty("genre_ids")
	private int[] genreIds;
	
	public BaseResponseObject(
			String name, String genre, String link, String imageLink, String description,
			int totalEps, long latestPubDate, long earlPubDate) {
		super();
		this.name = name;
		this.genre = genre;
		this.link = link;
		this.imageLink = imageLink;
		this.description = description;
		this.totalEps = totalEps;
		this.explContent = false;
		this.tunesId = 1004;
		this.rss = "Upgrade to see this information";
		this.latestPubDate = latestPubDate;
		this.earlPubDate = earlPubDate;
		
		ob = new ExtraObject();
		lf = new LookingFor();
		
		genreIds = new int[2];
		genreIds[0] = 1;
		genreIds[1] = 2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getImageLink() {
		return imageLink;
	}
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getTotalEps() {
		return totalEps;
	}
	public void setTotalEps(int totalEps) {
		this.totalEps = totalEps;
	}
	public boolean isExplContent() {
		return explContent;
	}
	public void setExplContent(boolean explContent) {
		this.explContent = explContent;
	}
	public int getTunesId() {
		return tunesId;
	}
	public void setTunesId(int tunesId) {
		this.tunesId = tunesId;
	}
	public String getRss() {
		return rss;
	}
	public void setRss(String rss) {
		this.rss = rss;
	}
	public long getLatestPubDate() {
		return latestPubDate;
	}
	public void setLatestPubDate(long latestPubDate) {
		this.latestPubDate = latestPubDate;
	}
	public long getEarlPubDate() {
		return earlPubDate;
	}
	public void setEarlPubDate(long earlPubDate) {
		this.earlPubDate = earlPubDate;
	}
	public String getLangauge() {
		return langauge;
	}
	public void setLangauge(String langauge) {
		this.langauge = langauge;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	


	
	
}
