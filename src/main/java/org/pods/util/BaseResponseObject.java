package org.pods.util;

//Since the get request is to getting a list of podcasts, I figured it would be best to have each object in the list
//be it's own `response object`, that way it would be neater and easier to follow if there were different types of responses.

public class BaseResponseObject {
	private String name;
	private String genre;
	private String link;
	private String imageLink;
	private String description;
	public BaseResponseObject(String name, String genre, String link, String imageLink, String description) {
		super();
		this.name = name;
		this.genre = genre;
		this.link = link;
		this.imageLink = imageLink;
		this.description = description;
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
	
	
	
}
