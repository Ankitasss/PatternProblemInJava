package com.kodnest.assignment.pattern.AtoZ;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if((i==1&j>1&j<5)||(i==5&j>1&j<5)||(j==1&i>1&i<5)||(j==5&i>1&i<5)||i==j&i>=3) {
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
