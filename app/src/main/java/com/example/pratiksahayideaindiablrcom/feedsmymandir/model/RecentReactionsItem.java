package com.example.pratiksahayideaindiablrcom.feedsmymandir.model;


import com.google.gson.annotations.SerializedName;

public class RecentReactionsItem{

	@SerializedName("thumbnailUrlWithBackground")
	private String thumbnailUrlWithBackground;

	@SerializedName("nameKey")
	private String nameKey;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("staticUrl")
	private String staticUrl;

	@SerializedName("thumbnailUrl")
	private String thumbnailUrl;

	@SerializedName("selectedImageUrl")
	private String selectedImageUrl;

	public void setThumbnailUrlWithBackground(String thumbnailUrlWithBackground){
		this.thumbnailUrlWithBackground = thumbnailUrlWithBackground;
	}

	public String getThumbnailUrlWithBackground(){
		return thumbnailUrlWithBackground;
	}

	public void setNameKey(String nameKey){
		this.nameKey = nameKey;
	}

	public String getNameKey(){
		return nameKey;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setStaticUrl(String staticUrl){
		this.staticUrl = staticUrl;
	}

	public String getStaticUrl(){
		return staticUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl){
		this.thumbnailUrl = thumbnailUrl;
	}

	public String getThumbnailUrl(){
		return thumbnailUrl;
	}

	public void setSelectedImageUrl(String selectedImageUrl){
		this.selectedImageUrl = selectedImageUrl;
	}

	public String getSelectedImageUrl(){
		return selectedImageUrl;
	}

	@Override
 	public String toString(){
		return 
			"RecentReactionsItem{" + 
			"thumbnailUrlWithBackground = '" + thumbnailUrlWithBackground + '\'' + 
			",nameKey = '" + nameKey + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",staticUrl = '" + staticUrl + '\'' + 
			",thumbnailUrl = '" + thumbnailUrl + '\'' + 
			",selectedImageUrl = '" + selectedImageUrl + '\'' + 
			"}";
		}
}