package com.kodnest.assignment.pattern.AtoZ;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==1||(i==1&j<=4)||(i==5&j<=4)||(i>=2&i<=4)&j==5) {
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
