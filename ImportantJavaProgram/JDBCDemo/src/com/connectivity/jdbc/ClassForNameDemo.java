package com.connectivity.jdbc;

public class ClassForNameDemo 
{
	
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class.forName("com.connectivity.jdbc.Demo").newInstance();
	}
}

class Demo
{
	static
	{
		System.out.println("Static block-1");
	}
	
	{
		System.out.println("Instance block-1");
	}
	
	static
	{
		System.out.println("Static block-2");
	}
	
	{
		System.out.println("Instance block-2");
	}
}