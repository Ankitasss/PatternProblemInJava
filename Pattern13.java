package com.kodnest.assignment.pattern.AtoZ;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==1||j==5||i-j==0&i<=3||i+j==6&i<=3) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

	}

}
