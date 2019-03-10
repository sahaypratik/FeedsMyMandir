package com.example.pratiksahayideaindiablrcom.feedsmymandir.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class RespData{

	@SerializedName("code")
	private String code;

	@SerializedName("attachments")
	private List<AttachmentsItem> attachments;

	@SerializedName("fromCache")
	private boolean fromCache;

	@SerializedName("likedBy")
	private List<Object> likedBy;

	@SerializedName("saved")
	private boolean saved;

	@SerializedName("recentReactions")
	private List<RecentReactionsItem> recentReactions;

	@SerializedName("likeCount")
	private int likeCount;

	@SerializedName("type")
	private String type;

	@SerializedName("title")
	private String title;

	@SerializedName("liked")
	private boolean liked;

	@SerializedName("shareCount")
	private int shareCount;

	@SerializedName("createdAt")
	private long createdAt;

	@SerializedName("xid")
	private String xid;

	@SerializedName("text")
	private String text;

	@SerializedName("viewCount")
	private int viewCount;

	@SerializedName("id")
	private int id;

	@SerializedName("isFeatured")
	private boolean isFeatured;

	@SerializedName("precantCount")
	private int precantCount;

	@SerializedName("isPNSent")
	private boolean isPNSent;

	@SerializedName("comments")
	private List<Object> comments;

	@SerializedName("isRepost")
	private boolean isRepost;

	@SerializedName("postType")
	private String postType;

	@SerializedName("userFollowsPoster")
	private boolean userFollowsPoster;

	@SerializedName("reactionCount")
	private int reactionCount;

	@SerializedName("parentId")
	private Object parentId;

	@SerializedName("commentCount")
	private int commentCount;

	@SerializedName("isHidden")
	private boolean isHidden;

	@SerializedName("tags")
	private List<TagsItem> tags;

	@SerializedName("webPath")
	private String webPath;

	@SerializedName("reactionsByViewer")
	private List<Object> reactionsByViewer;

	@SerializedName("sender")
	private Sender sender;

	@SerializedName("temple")
	private int temple;

	@SerializedName("user")
	private int user;

	@SerializedName("isValidPost")
	private boolean isValidPost;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setAttachments(List<AttachmentsItem> attachments){
		this.attachments = attachments;
	}

	public List<AttachmentsItem> getAttachments(){
		return attachments;
	}

	public void setFromCache(boolean fromCache){
		this.fromCache = fromCache;
	}

	public boolean isFromCache(){
		return fromCache;
	}

	public void setLikedBy(List<Object> likedBy){
		this.likedBy = likedBy;
	}

	public List<Object> getLikedBy(){
		return likedBy;
	}

	public void setSaved(boolean saved){
		this.saved = saved;
	}

	public boolean isSaved(){
		return saved;
	}

	public void setRecentReactions(List<RecentReactionsItem> recentReactions){
		this.recentReactions = recentReactions;
	}

	public List<RecentReactionsItem> getRecentReactions(){
		return recentReactions;
	}

	public void setLikeCount(int likeCount){
		this.likeCount = likeCount;
	}

	public int getLikeCount(){
		return likeCount;
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

	public void setLiked(boolean liked){
		this.liked = liked;
	}

	public boolean isLiked(){
		return liked;
	}

	public void setShareCount(int shareCount){
		this.shareCount = shareCount;
	}

	public int getShareCount(){
		return shareCount;
	}

	public void setCreatedAt(long createdAt){
		this.createdAt = createdAt;
	}

	public long getCreatedAt(){
		return createdAt;
	}

	public void setXid(String xid){
		this.xid = xid;
	}

	public String getXid(){
		return xid;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	public void setViewCount(int viewCount){
		this.viewCount = viewCount;
	}

	public int getViewCount(){
		return viewCount;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setIsFeatured(boolean isFeatured){
		this.isFeatured = isFeatured;
	}

	public boolean isIsFeatured(){
		return isFeatured;
	}

	public void setPrecantCount(int precantCount){
		this.precantCount = precantCount;
	}

	public int getPrecantCount(){
		return precantCount;
	}

	public void setIsPNSent(boolean isPNSent){
		this.isPNSent = isPNSent;
	}

	public boolean isIsPNSent(){
		return isPNSent;
	}

	public void setComments(List<Object> comments){
		this.comments = comments;
	}

	public List<Object> getComments(){
		return comments;
	}

	public void setIsRepost(boolean isRepost){
		this.isRepost = isRepost;
	}

	public boolean isIsRepost(){
		return isRepost;
	}

	public void setPostType(String postType){
		this.postType = postType;
	}

	public String getPostType(){
		return postType;
	}

	public void setUserFollowsPoster(boolean userFollowsPoster){
		this.userFollowsPoster = userFollowsPoster;
	}

	public boolean isUserFollowsPoster(){
		return userFollowsPoster;
	}

	public void setReactionCount(int reactionCount){
		this.reactionCount = reactionCount;
	}

	public int getReactionCount(){
		return reactionCount;
	}

	public void setParentId(Object parentId){
		this.parentId = parentId;
	}

	public Object getParentId(){
		return parentId;
	}

	public void setCommentCount(int commentCount){
		this.commentCount = commentCount;
	}

	public int getCommentCount(){
		return commentCount;
	}

	public void setIsHidden(boolean isHidden){
		this.isHidden = isHidden;
	}

	public boolean isIsHidden(){
		return isHidden;
	}

	public void setTags(List<TagsItem> tags){
		this.tags = tags;
	}

	public List<TagsItem> getTags(){
		return tags;
	}

	public void setWebPath(String webPath){
		this.webPath = webPath;
	}

	public String getWebPath(){
		return webPath;
	}

	public void setReactionsByViewer(List<Object> reactionsByViewer){
		this.reactionsByViewer = reactionsByViewer;
	}

	public List<Object> getReactionsByViewer(){
		return reactionsByViewer;
	}

	public void setSender(Sender sender){
		this.sender = sender;
	}

	public Sender getSender(){
		return sender;
	}

	public void setTemple(int temple){
		this.temple = temple;
	}

	public int getTemple(){
		return temple;
	}

	public void setUser(int user){
		this.user = user;
	}

	public int getUser(){
		return user;
	}

	public void setIsValidPost(boolean isValidPost){
		this.isValidPost = isValidPost;
	}

	public boolean isIsValidPost(){
		return isValidPost;
	}

	@Override
 	public String toString(){
		return 
			"RespData{" + 
			"code = '" + code + '\'' + 
			",attachments = '" + attachments + '\'' + 
			",fromCache = '" + fromCache + '\'' + 
			",likedBy = '" + likedBy + '\'' + 
			",saved = '" + saved + '\'' + 
			",recentReactions = '" + recentReactions + '\'' + 
			",likeCount = '" + likeCount + '\'' + 
			",type = '" + type + '\'' + 
			",title = '" + title + '\'' + 
			",liked = '" + liked + '\'' + 
			",shareCount = '" + shareCount + '\'' + 
			",createdAt = '" + createdAt + '\'' + 
			",xid = '" + xid + '\'' + 
			",text = '" + text + '\'' + 
			",viewCount = '" + viewCount + '\'' + 
			",id = '" + id + '\'' + 
			",isFeatured = '" + isFeatured + '\'' + 
			",precantCount = '" + precantCount + '\'' + 
			",isPNSent = '" + isPNSent + '\'' + 
			",comments = '" + comments + '\'' + 
			",isRepost = '" + isRepost + '\'' + 
			",postType = '" + postType + '\'' + 
			",userFollowsPoster = '" + userFollowsPoster + '\'' + 
			",reactionCount = '" + reactionCount + '\'' + 
			",parentId = '" + parentId + '\'' + 
			",commentCount = '" + commentCount + '\'' + 
			",isHidden = '" + isHidden + '\'' + 
			",tags = '" + tags + '\'' + 
			",webPath = '" + webPath + '\'' + 
			",reactionsByViewer = '" + reactionsByViewer + '\'' + 
			",sender = '" + sender + '\'' + 
			",temple = '" + temple + '\'' + 
			",user = '" + user + '\'' + 
			",isValidPost = '" + isValidPost + '\'' + 
			"}";
		}
}