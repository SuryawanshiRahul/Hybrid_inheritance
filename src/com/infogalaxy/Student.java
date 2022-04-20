package com.infogalaxy;

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    void  setStudent(){
        System.out.println("Enter Student ID and Name :");
        id = sc.nextInt();
        name = sc.next();
    }
}