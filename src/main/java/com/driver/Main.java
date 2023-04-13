package com.driver;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        RWOnly obj1=new RWOnly();
        obj1.setName(input);
        System.out.println(obj1.getName());
    }
  
}