package com.basics;

public class Factorial {
	
	static int fact(int n) {
		if(n==0)
			return 1;
		return n*fact(n-1);
	}
	
	
public static void main(String[]args) {
	int n=33;
	System.out.println("FActorial of "+n+" is "+fact(33));
}
}
