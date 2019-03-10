package com.example.pratiksahayideaindiablrcom.feedsmymandir.model;


import com.google.gson.annotations.SerializedName;

public class Sender{

	@SerializedName("friendlyId")
	private String friendlyId;

	@SerializedName("webPath")
	private String webPath;

	@SerializedName("isIdentityVerified")
	private boolean isIdentityVerified;

	@SerializedName("imageUrl")
	private String imageUrl;

	@SerializedName("name")
	private String name;

	@SerializedName("language")
	private String language;

	@SerializedName("id")
	private int id;

	@SerializedName("microThumbnailUrl")
	private String microThumbnailUrl;

	@SerializedName("status")
	private String status;

	@SerializedName("thumbnailUrl")
	private String thumbnailUrl;

	public void setFriendlyId(String friendlyId){
		this.friendlyId = friendlyId;
	}

	public String getFriendlyId(){
		return friendlyId;
	}

	public void setWebPath(String webPath){
		this.webPath = webPath;
	}

	public String getWebPath(){
		return webPath;
	}

	public void setIsIdentityVerified(boolean isIdentityVerified){
		this.isIdentityVerified = isIdentityVerified;
	}

	public boolean isIsIdentityVerified(){
		return isIdentityVerified;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setMicroThumbnailUrl(String microThumbnailUrl){
		this.microThumbnailUrl = microThumbnailUrl;
	}

	public String getMicroThumbnailUrl(){
		return microThumbnailUrl;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setThumbnailUrl(String thumbnailUrl){
		this.thumbnailUrl = thumbnailUrl;
	}

	public String getThumbnailUrl(){
		return thumbnailUrl;
	}

	@Override
 	public String toString(){
		return 
			"Sender{" + 
			"friendlyId = '" + friendlyId + '\'' + 
			",webPath = '" + webPath + '\'' + 
			",isIdentityVerified = '" + isIdentityVerified + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",name = '" + name + '\'' + 
			",language = '" + language + '\'' + 
			",id = '" + id + '\'' + 
			",microThumbnailUrl = '" + microThumbnailUrl + '\'' + 
			",status = '" + status + '\'' + 
			",thumbnailUrl = '" + thumbnailUrl + '\'' + 
			"}";
		}
}