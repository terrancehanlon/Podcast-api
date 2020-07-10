package org.pods.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="podcasttobestpodcast")
public class PodcastToBestPodcast {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private int bestpodcastid;
	
	@Column
	private int podcastid;

	public PodcastToBestPodcast(int id, int bestpodcastid, int podcastid) {
		super();
		this.id = id;
		this.bestpodcastid = bestpodcastid;
		this.podcastid = podcastid;
	}
	
	public PodcastToBestPodcast() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBestpodcastid() {
		return bestpodcastid;
	}

	public void setBestpodcastid(int bestpodcastid) {
		this.bestpodcastid = bestpodcastid;
	}

	public int getPodcastid() {
		return podcastid;
	}

	public void setPodcastid(int podcastid) {
		this.podcastid = podcastid;
	}
	
	 

}
