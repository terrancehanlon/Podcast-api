package org.pods.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="podcast")
public class Podcast {
	/*
		Part of the data layer, this object is directly related to the database table `podcast`
	*/
	@Id
	@GeneratedValue
	private int Id;
	
	@Column
	private String name;
	
	@Column
	private String image;
	
	@Column
	private String link;
	
	@Column
	private String descrip;
	
	@Column
	private String genre;
	
	@Column String region;
	
	
	public Podcast() {}
	
	public Podcast(int id, String name, String image, String link, String descrip, String genre, String region) {
		Id = id;
		this.name = name;
		this.image = image;
		this.link = link;
		this.descrip = descrip;
		this.genre = genre;
		this.region = region;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	
	

}
