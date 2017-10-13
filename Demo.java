package com.imooc;

import java.util.Scanner;

public class Demo {
	
	//插入数据
	public int[] insertData(){
		int[] a=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length-1;i++){
			System.out.println("请输入第"+(i+1)+"个数据");
			a[i]=sc.nextInt();
			if(a[i]==0){
				System.out.println("数据不能为0");
				i--;
			}
		}
		return a;
	}
		
	//显示提示信息
	public void notice(){
		System.out.println("****************************");
		System.out.println("      1--插入数据");
		System.out.println("      2--显示所有数据");
		System.out.println("      3--在指定位置处插入数据");
		System.out.println("      4--查询能被3整除的数据");
		System.out.println("      0--退出");
		System.out.println("****************************");
		System.out.println("请输入相应的数字进行操作:");
	}
	
	//查看全部数据
	public void showData(int a[],int length){
		for(int i=0;i<length;i++)
			if(a[i]!=0)
				System.out.print(a[i]+"  ");
		System.out.println("");
	}
	
	//在指定位置插入数据
	public void insertAtArray(int[] a,int n,int k){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要插入的数据:");
		n=sc.nextInt();
		System.out.println("请输入插入数据的位置:");
		k=sc.nextInt();
		for(int i=a.length-1;i>k;i--)
			a[i]=a[i-1];
		a[k]=n;
	}
	
	//查询能被3整除的数组
	public void divThree(int[] a){
		boolean judge=false;
		String str="";
		for(int n:a){
			if(n%3==0){
				System.out.print(n+"  ");
				str=str+n+"";
				judge=true;
			}
		}
		if(str==""){
			System.out.println("没有能够被3整除的数");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		Demo wk=new Demo();
		Scanner sc=new Scanner(System.in);
		int n;
		int[] a=null;
		while(true){
			wk.notice();
			n=sc.nextInt();
			if(n==0){
				System.out.println("程序结束");
				break;
			}
			if(n<0||n>4){
				System.out.println("输入有误，请重新输入！");
			}
			switch(n){
			case 1:
				a=wk.insertData();
				wk.showData(a, a.length);
				break;
			case 2:
				wk.showData(a, a.length);
				break;
			case 3:
				int b=0;
				int k=0;
				wk.insertAtArray(a, b, k);
				int k2=a.length;
				wk.showData(a,a.length);
				break;
			case 4:
				wk.divThree(a);
				break;
			}
		}
	}
}