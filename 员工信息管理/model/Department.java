package com.imooc.model;

public class Department {
	//成员属性：部门名称、部门人员信息、部门人数
	private String departmentName;
	private Clerk[] myClerks;
	private int clerkNum;
	
	public Department(){
		
	}
	
	public Department(String departmentName){
		this.setDepartmentName(departmentName);
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Clerk[] getMyClerks() {
		if(this.myClerks==null)
			this.myClerks=new Clerk[200];
		return myClerks;
	}
	public void setMyClerks(Clerk[] myClerks) {
		this.myClerks = myClerks;
	}
	public int getClerkNum() {
		return clerkNum;
	}
	public void setClerkNum(int clerkNum) {
		this.clerkNum = clerkNum;
	}
	public void addClerk(Clerk cl){
		for(int i=0;i<this.getMyClerks().length;i++){
			if(this.getMyClerks()[i]==null){
				cl.setClerkDepartment(this);
				this.getMyClerks()[i]=cl;
				this.clerkNum=i+1;
				return;
			}
		}
	}
	public String info(){
		String str="";
		str=this.getDepartmentName()+"总共有"+this.getClerkNum()+"名员工\n";
		return str;
	}
}
