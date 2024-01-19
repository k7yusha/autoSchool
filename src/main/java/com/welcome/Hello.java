package com.welcome;

public class Hello {

    private String userName;

    public void setupName(String name){
        this.userName = name;
    }

    public String getUserName(){
        return userName;
    }

    public void welcome(){
        System.out.println("Hello, " + getUserName());
    }

    public void byeBay(){
        System.out.println("Bye, " + getUserName());
    }
}
