package com.imooc.model;

public class Clerk {
	private String clerkName;
	private String clerkNo;
	private int clerkAge;
	private String clerkSex;
	private Department clerkDepartment;
	private Post clerkPost;
	
	public Clerk(){
		
	}
	
	public Clerk(String clerkName,String clerkNo,String clerkSex,int clerkAge){
		this.setClerkName(clerkName);
		this.setClerkNo(clerkNo);
		this.setClerkAge(clerkAge);
		this.setClerkSex(clerkSex);
	}

	public Department getClerkDepartment() {
		return clerkDepartment;
	}

	public void setClerkDepartment(Department clerkDepartment) {
		this.clerkDepartment = clerkDepartment;
	}

	public Post getClerkPost() {
		return clerkPost;
	}

	public void setClerkPost(Post clerkPost) {
		this.clerkPost = clerkPost;
	}

	public String getClerkName() {
		return clerkName;
	}

	public void setClerkName(String clerkName) {
		this.clerkName = clerkName;
	}

	public String getClerkNo() {
		return clerkNo;
	}

	public void setClerkNo(String clerkNo) {
		this.clerkNo = clerkNo;
	}

	public int getClerkAge() {
		return clerkAge;
	}

	public void setClerkAge(int clerkAge) {
		if(clerkAge<18||clerkAge>65)
			this.clerkAge=18;
		else
			this.clerkAge = clerkAge;
	}

	public String getClerkSex() {
		return clerkSex;
	}

	public void setClerkSex(String clerkSex) {
		if(clerkSex.equals("女"))
			this.clerkSex="女";
		else
			this.clerkSex="男";
//		this.clerkSex = clerkSex;
	}
	/**
	 * 员工自我介绍的方法
	 * @return 员工的信息，包括：姓名、工号、性别、年龄、职务
	 */
	public String info(Department clerkDepartment,Post clerkPost){
		String str="";
		str="姓名:"+this.getClerkName()+"\n工号:"+this.getClerkNo()+"\n性别:"+this.getClerkSex()+"\n年龄:"+this.getClerkAge()+"\n职务:"+clerkDepartment.getDepartmentName()+clerkPost.getPostName()+"\n";
		return str;
	}
}
