package com.kodnest.assignment.pattern.AtoZ;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=3;j++) {
				if(j==1||i+j==4||i-j==2) {
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