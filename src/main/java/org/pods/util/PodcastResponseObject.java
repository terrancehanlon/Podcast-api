package org.pods.util;

//Derived class of BaseResponseObject
//This is the object that would reside in the list that's on the main response object.
public class PodcastResponseObject extends BaseResponseObject {

	public PodcastResponseObject(String name, String genre, String link, String imageLink, String description, int totalEps, long latestPubDate, long earlPubDate) {
		super(name, genre, link, imageLink, description, totalEps, latestPubDate, earlPubDate);
		// TODO Auto-generated constructor stub
	}
	
}
