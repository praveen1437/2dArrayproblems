package org.ie.test;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
    	Scanner scn= new Scanner(System.in);
    	int diagonalSum=0;
		int[][] array= new int[3][3];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				array[i][j]=scn.nextInt();
			}
		}
	
	      for(int i=0;i<array.length;i++) {
	    	 // System.out.println(array[i][i]);
	    	 diagonalSum= diagonalSum+array[i][i]; 
		}
		System.out.println(diagonalSum);
	}
}
