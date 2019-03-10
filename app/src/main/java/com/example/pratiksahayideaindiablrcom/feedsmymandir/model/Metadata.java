package com.example.pratiksahayideaindiablrcom.feedsmymandir.model;


import com.google.gson.annotations.SerializedName;

public class Metadata{

	@SerializedName("width")
	private int width;

	@SerializedName("height")
	private int height;

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return width;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"Metadata{" + 
			"width = '" + width + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}