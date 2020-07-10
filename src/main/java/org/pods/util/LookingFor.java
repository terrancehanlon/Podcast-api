package org.pods.util;

public class LookingFor {
	
	private boolean sponsors, guests, cohosts, cross_promotion;
	
	public LookingFor() {
		this.sponsors = false;
		this.guests = false;
		this.cohosts = false;
		this.cross_promotion = false;
	}

	public LookingFor(boolean sponsors, boolean guests, boolean cohosts, boolean cross_promotion) {
		super();
		this.sponsors = sponsors;
		this.guests = guests;
		this.cohosts = cohosts;
		this.cross_promotion = cross_promotion;
	}

	public boolean isSponsors() {
		return sponsors;
	}

	public void setSponsors(boolean sponsors) {
		this.sponsors = sponsors;
	}

	public boolean isGuests() {
		return guests;
	}

	public void setGuests(boolean guests) {
		this.guests = guests;
	}

	public boolean isCohosts() {
		return cohosts;
	}

	public void setCohosts(boolean cohosts) {
		this.cohosts = cohosts;
	}

	public boolean isCross_promotion() {
		return cross_promotion;
	}

	public void setCross_promotion(boolean cross_promotion) {
		this.cross_promotion = cross_promotion;
	}
	
	

}
