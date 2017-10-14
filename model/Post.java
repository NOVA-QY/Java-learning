package com.imooc.model;

public class Post {
	private String postName;
	public Post(){
		
	}
	public Post(String postName){
		this.setPostName(postName);
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	
}
