package com.imooc.test;
import com.imooc.model.*;
public class ClerkTest {
	public static void main(String[] args){
		Department d2=new Department("市场部");
		Department d1=new Department("人事部");
		Post p1=new Post("经理");
		Post p2=new Post("助理");
		Post p3=new Post("职员");
		Clerk c1=new Clerk("张铭","S001","男",29);
		System.out.println(c1.info(d1,p1));
		System.out.println("==========================");
		Clerk c2=new Clerk("张艾爱","S002","女",21);
		System.out.println(c2.info(d1,p2));
		System.out.println("==========================");
		Clerk c3=new Clerk("孙超","S004","男",29);
		System.out.println(c3.info(d1,p3));
		System.out.println("==========================");
		Clerk c4=new Clerk("张美美","S005","女",26);
		System.out.println(c4.info(d2,p3));
		System.out.println("==========================");
		Clerk c5=new Clerk("蓝迪","S006","男",37);
		System.out.println(c5.info(d2,p1));
		System.out.println("==========================");
		Clerk c6=new Clerk("米莉","S007","女",24);
		System.out.println(c6.info(d2,p3));
		System.out.println("==========================");
		d1.addClerk(c1);
		d1.addClerk(c2);
		d1.addClerk(c3);
		d2.addClerk(c4);
		d2.addClerk(c5);
		d2.addClerk(c6);
		System.out.print(d1.info());
		System.out.println(d2.info());
	}
}
