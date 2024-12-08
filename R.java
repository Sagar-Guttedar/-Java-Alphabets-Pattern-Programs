package com.AlphabetsPatternPro;

public class R {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if(j==1 || (i==1) || (i==2 && j==5) || (i==3 && j==5) || i==3 || (i==4 && j==3) || (i==5 && j==5) ){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
