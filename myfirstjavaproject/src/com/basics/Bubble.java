package com.basics;

public class Bubble {

	public static void main(String[] args) {
		int nums[]= {3,34,5,234,65,89,565};
		int temp=0;
		System.out.println("before Swapping");
		for(int num:nums) {
			System.out.print(num+" ");
		}
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length-i-1;j++) {
				if(nums[j]>nums[j+1])
				{
				  temp=nums[j];
				  nums[j]=nums[j+1];
				  nums[j+1]=temp;
				}
				for(int num:nums) {
					
					System.out.print(num+" ");
				}
			}
		}
		
		System.out.println("After Swapping");
		for(int num:nums) {
			System.out.print(num+" ");
		}
	}

}
