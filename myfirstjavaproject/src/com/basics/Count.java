package com.basics;

public class Count {
	
	static int count=0;
	
	{
		count++;
	}
	
	static void show(){
	System.out.println("the no.of objects we are creating in the class:"+count);	
	}
	
	

	public static void main(String[] args) {
		
     Count c1 =new Count();
     
     Count c2 =new Count();
     Count c3 =new Count();
     
     Count c4 =new Count();
     
     
   show();
	}
	
}
