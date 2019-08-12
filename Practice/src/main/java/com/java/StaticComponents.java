package com.java;

public class StaticComponents {
	
	static int i;
	int j;
	
	static{
		System.out.println("Static block SIB");
		i=10;
	}
	
	public void nonstaticMethod()
	{
		System.out.println(i);
		System.out.println("Non Static method:");
		System.out.println("Non static variable"+j);
	}
	
	static void staticMethod()
	{
		
		System.out.println("From Static Method:");
		System.out.println(i);
		
	}
	



	public static void main(String[] args) {
		StaticComponents.i=20;
		StaticComponents.staticMethod();
		StaticComponents sc= new StaticComponents();
		sc.nonstaticMethod();
	//	System.out.println(sc.staticMethod());
		
		


}

}	