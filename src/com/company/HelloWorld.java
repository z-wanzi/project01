package com.company;

import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        Date date = new Date();
        System.out.println("helloworld");
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        System.out.println("args = [" + args + "]");
        System.out.println("HelloWorld.main");
        System.out.println("list = " + list);
        System.out.println(date);

    }
}