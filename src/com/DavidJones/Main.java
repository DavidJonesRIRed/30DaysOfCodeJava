package com.DavidJones;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = (N % 2);
        if (result == 1) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

        scanner.close();


    }
}
