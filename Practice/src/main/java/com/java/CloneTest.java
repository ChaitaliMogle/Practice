package com.java;

import java.util.StringTokenizer;

import org.omg.CORBA.StringValueHelper;

public class CloneTest implements Cloneable {
	
	int id=10;
	String name="Chaitali";
	
	/*public CloneTest(int id, String name)
	{
		this.id=id;
		this.name=name;
	}*/
	

	/*public void display()
	{
		System.out.println("Old copy:"+id+" "+name);
		System.out.println("New Copy:"+id+" " +name);
	}
	*/
	@Override
 public String toString()
 {
	
	return name;
 }
	public static void main(String[] args) {

		
		CloneTest cn=new CloneTest();
		try {
		Object obj=	cn.clone();
	CloneTest cn1=(CloneTest) obj;
	System.out.println("Old copy:"+cn);
	System.out.println("New Copy:"+cn1);
	

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
	
		}
		
		
	}

}
