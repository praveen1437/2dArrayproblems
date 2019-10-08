package org.ie.practice;

public class palindromTest {
    public static void main(String[] args) {
        int[][] given= {{4, 0, 0}, {0, 4, 0}, {0, 0, 1}};
        boolean diagonalPalindrome = isDiagonalPalindrome(given);
        System.out.println(diagonalPalindrome);
    }

    public static boolean isDiagonalPalindrome(int [][] a) {
        String diagonalElements="";
        int diagonalNumber;
        for(int i=0;i<a.length;i++){
            diagonalElements=diagonalElements+a[i][i];
            }
        diagonalNumber=Integer.parseInt(diagonalElements);
        int temp=diagonalNumber;
        int sum=0,remainder;
        while(diagonalNumber>0){
            remainder=diagonalNumber%10;
            sum=remainder+(sum*10);
            diagonalNumber= diagonalNumber/10;
        }
        if(temp==sum){ return true;}
        else{
            return false;
        }


    }

}
