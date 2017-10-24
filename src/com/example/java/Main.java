package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        HealthProfile obj = new HealthProfile();

        Scanner input =  new Scanner(System.in);

        for (int i=0; i<60; i++){

            System.out.print("*");
        }
        System.out.println("");

        System.out.println("Enter your first name");
        obj.setFirst_name(input.nextLine());


        System.out.println("Enter your first name");
        obj.setLast_name(input.nextLine());

        System.out.println("Enter your gender");
        obj.setGender(input.nextLine());

        System.out.println("Enter your day of birth: e.g 01");
        obj.setDay(input.nextInt());

        System.out.println("Enter your month of birth e.g 05");
        obj.setMonth(input.nextInt());


        System.out.println("Enter your year of birth e.g 1996");
        obj.setYear(input.nextInt());


        System.out.println("Enter your Weight in pounds");
        obj.setWeight(input.nextDouble());

        System.out.println("Enter your Height in inches");
        obj.setHeight(input.nextDouble());

        for (int i=0; i<60; i++){

            System.out.print("*");
        }
        System.out.println("");


        System.out.println("Your First Name " + obj.first_name);
        System.out.println("Your Last Name " + obj.last_name);
        System.out.println("Your Sex " + obj.gender);
        System.out.println("Your Birth " + obj.day + " " +  obj.month + " " + " " +  obj.year);

        obj.Calculate();

    }
}
