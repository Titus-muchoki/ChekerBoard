package org.example;

public class Main {
    public static void main(String[] args) {
        int m = 3;
        int n = 4;
        for(int rows = 0; rows<m; rows++)
        {
            for(int cols = 0; cols<n; cols++)
            {
                if((rows+cols)%2 ==0) System.out.print("X");
                else System.out.print("O");
            }
            System.out.println();
        }
    }
}