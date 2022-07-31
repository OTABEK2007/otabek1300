package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        int a= 7, n = 5;

        int temp = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            temp = temp * 10 + a;
            sum = sum + temp;
        }

        System.out.println(sum);

    }
}
