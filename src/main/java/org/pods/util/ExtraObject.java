package org.pods.util;

public class ExtraObject {
	private String twitter_handle, facebook_hanlde, instagram_handle, wechat_handle, patreon_handle, youtube_url, linkedin_url, spotify_url, google_url;

	
	public ExtraObject() {
		this.twitter_handle = "";
		this.facebook_hanlde = "";
		this.instagram_handle = "";
		this.wechat_handle = "";
		this.patreon_handle = "";
		this.youtube_url = "";
		this.linkedin_url = "";
		this.spotify_url = "";
		this.google_url = "";
	}
	
	public ExtraObject(String twitter_handle, String facebook_hanlde, String instagram_handle, String wechat_handle,
			String patreon_handle, String youtube_url, String linkedin_url, String spotify_url, String google_url) {
		super();
		this.twitter_handle = twitter_handle;
		this.facebook_hanlde = facebook_hanlde;
		this.instagram_handle = instagram_handle;
		this.wechat_handle = wechat_handle;
		this.patreon_handle = patreon_handle;
		this.youtube_url = youtube_url;
		this.linkedin_url = linkedin_url;
		this.spotify_url = spotify_url;
		this.google_url = google_url;
	}

	public String getTwitter_handle() {
		return twitter_handle;
	}

	public void setTwitter_handle(String twitter_handle) {
		this.twitter_handle = twitter_handle;
	}

	public String getFacebook_hanlde() {
		return facebook_hanlde;
	}

	public void setFacebook_hanlde(String facebook_hanlde) {
		this.facebook_hanlde = facebook_hanlde;
	}

	public String getInstagram_handle() {
		return instagram_handle;
	}

	public void setInstagram_handle(String instagram_handle) {
		this.instagram_handle = instagram_handle;
	}

	public String getWechat_handle() {
		return wechat_handle;
	}

	public void setWechat_handle(String wechat_handle) {
		this.wechat_handle = wechat_handle;
	}

	public String getPatreon_handle() {
		return patreon_handle;
	}

	public void setPatreon_handle(String patreon_handle) {
		this.patreon_handle = patreon_handle;
	}

	public String getYoutube_url() {
		return youtube_url;
	}

	public void setYoutube_url(String youtube_url) {
		this.youtube_url = youtube_url;
	}

	public String getLinkedin_url() {
		return linkedin_url;
	}

	public void setLinkedin_url(String linkedin_url) {
		this.linkedin_url = linkedin_url;
	}

	public String getSpotify_url() {
		return spotify_url;
	}

	public void setSpotify_url(String spotify_url) {
		this.spotify_url = spotify_url;
	}

	public String getGoogle_url() {
		return google_url;
	}

	public void setGoogle_url(String google_url) {
		this.google_url = google_url;
	}
	
	
}
