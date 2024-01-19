package com.automation;

import com.welcome.*;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Hello hello = new Hello();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter you name");
        String name  = input.nextLine();
        hello.setupName(name);
        hello.welcome();
        System.out.println("Hello, World");
        hello.byeBay();
    }
}
