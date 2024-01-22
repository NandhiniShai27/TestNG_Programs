package com.facebook;

public class Static {
	static int a =10;
	static {
		System.out.println("I am a Static block1");
		
	}
	static {
		System.out.println("I m static 2");
		
	}
	{
		System.out.println("Im instance block");
	}
	public static  void method(){
		
		System.out.println("Method");
	}
	static {
		System.out.println("I m static 3");
	}
	static {
		System.out.println("I m static 4");
	}
	public static void main(String[] args) {
		//Static a = new Static();
		method();
		
		System.out.println(a);
		
		
	}

}
