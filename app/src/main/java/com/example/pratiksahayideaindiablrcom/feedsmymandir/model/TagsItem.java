package com.example.pratiksahayideaindiablrcom.feedsmymandir.model;


import com.google.gson.annotations.SerializedName;

public class TagsItem{

	@SerializedName("imageUrl")
	private String imageUrl;

	@SerializedName("description")
	private String description;

	@SerializedName("id")
	private int id;

	@SerializedName("text")
	private String text;

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	@Override
 	public String toString(){
		return 
			"TagsItem{" + 
			"imageUrl = '" + imageUrl + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			",text = '" + text + '\'' + 
			"}";
		}
}