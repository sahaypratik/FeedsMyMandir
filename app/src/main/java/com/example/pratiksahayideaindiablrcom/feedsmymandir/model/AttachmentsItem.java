package com.example.pratiksahayideaindiablrcom.feedsmymandir.model;


import com.google.gson.annotations.SerializedName;

public class AttachmentsItem{

	@SerializedName("metadata")
	private Metadata metadata;

	@SerializedName("mobile_url")
	private String mobileUrl;

	@SerializedName("type")
	private String type;

	@SerializedName("title")
	private String title;

	@SerializedName("userName")
	private String userName;

	@SerializedName("thumbnail_url")
	private String thumbnailUrl;

	@SerializedName("url")
	private String url;

	@SerializedName("userImage")
	private String userImage;

	@SerializedName("post")
	private int post;

	@SerializedName("size")
	private int size;

	@SerializedName("downsampled_url")
	private String downsampledUrl;

	@SerializedName("watermark_url")
	private String watermarkUrl;

	@SerializedName("temple")
	private int temple;

	@SerializedName("medium_url")
	private String mediumUrl;

	@SerializedName("id")
	private int id;

	@SerializedName("user")
	private int user;

	public void setMetadata(Metadata metadata){
		this.metadata = metadata;
	}

	public Metadata getMetadata(){
		return metadata;
	}

	public void setMobileUrl(String mobileUrl){
		this.mobileUrl = mobileUrl;
	}

	public String getMobileUrl(){
		return mobileUrl;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return userName;
	}

	public void setThumbnailUrl(String thumbnailUrl){
		this.thumbnailUrl = thumbnailUrl;
	}

	public String getThumbnailUrl(){
		return thumbnailUrl;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setUserImage(String userImage){
		this.userImage = userImage;
	}

	public String getUserImage(){
		return userImage;
	}

	public void setPost(int post){
		this.post = post;
	}

	public int getPost(){
		return post;
	}

	public void setSize(int size){
		this.size = size;
	}

	public int getSize(){
		return size;
	}

	public void setDownsampledUrl(String downsampledUrl){
		this.downsampledUrl = downsampledUrl;
	}

	public String getDownsampledUrl(){
		return downsampledUrl;
	}

	public void setWatermarkUrl(String watermarkUrl){
		this.watermarkUrl = watermarkUrl;
	}

	public String getWatermarkUrl(){
		return watermarkUrl;
	}

	public void setTemple(int temple){
		this.temple = temple;
	}

	public int getTemple(){
		return temple;
	}

	public void setMediumUrl(String mediumUrl){
		this.mediumUrl = mediumUrl;
	}

	public String getMediumUrl(){
		return mediumUrl;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setUser(int user){
		this.user = user;
	}

	public int getUser(){
		return user;
	}

	@Override
 	public String toString(){
		return 
			"AttachmentsItem{" + 
			"metadata = '" + metadata + '\'' + 
			",mobile_url = '" + mobileUrl + '\'' + 
			",type = '" + type + '\'' + 
			",title = '" + title + '\'' + 
			",userName = '" + userName + '\'' + 
			",thumbnail_url = '" + thumbnailUrl + '\'' + 
			",url = '" + url + '\'' + 
			",userImage = '" + userImage + '\'' + 
			",post = '" + post + '\'' + 
			",size = '" + size + '\'' + 
			",downsampled_url = '" + downsampledUrl + '\'' + 
			",watermark_url = '" + watermarkUrl + '\'' + 
			",temple = '" + temple + '\'' + 
			",medium_url = '" + mediumUrl + '\'' + 
			",id = '" + id + '\'' + 
			",user = '" + user + '\'' + 
			"}";
		}
}