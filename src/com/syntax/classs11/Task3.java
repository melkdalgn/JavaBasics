package com.syntax.classs11;

public class Task3 {

	public static void main(String[] args) {
		
		int [][] arr={ {10,10,10},
				{20,20,20},
				{30,30,30}};
		
		//System.out.println(arr[0][0]);
		//System.out.println(arr[0][1]);
		//System.out.println(arr[0][2]);
		//System.out.println(arr[1][0]);
		//System.out.println(arr[1][1]);
		//System.out.println(arr[1][2]);
		//System.out.println(arr[2][0]);
		//System.out.println(arr[2][1]);
		//System.out.println(arr[2][2]);
		//System.out.println(arr[2][3]);
		//System.out.println(arr[2][4]);
		
		int sum=0;
		for(int j=0; j<arr.length;j++) {
			
			for(int i=0;i<arr[j].length; i++) {
				sum=sum+arr[j][i];
			}
			
		}
		System.out.println(sum);
		
		
		
	}}