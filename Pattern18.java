package com.kodnest.assignment.pattern.AtoZ;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==3||j==1||i==j&i>=3||i==1||j==5&i<4) {
					System.out.print("#"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

	}

}
