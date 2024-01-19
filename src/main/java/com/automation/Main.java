package com.automation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World");
        System.out.println("Please enter username");
        printHelloName();
    }

    public static void printHelloName() {
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();
        System.out.println("Hello " + userName);
    }
}
