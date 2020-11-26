package com.company;

import java.util.Scanner;

public class Calculator {

    public static int addAToB(int a, int b){
        return a+b;
    }

    public static int subtractBFromA(int a, int b) {
        return a-b;
    }

    public static void main(String[] args) {
        // write your code here
        int a, b, result;
        String addOrSubstract= "";
        Scanner scan = new Scanner(System.in);

        while (!addOrSubstract.equals("exit")){
            System.out.println("Do you want add or subtract? To exit write exit.");
            addOrSubstract = scan.nextLine();

            if (addOrSubstract.equals("add")){
                System.out.println("Write first number");
                a = scan.nextInt();
                System.out.println("Write second number");
                b = scan.nextInt();
                result = addAToB(a,b);
                System.out.println("Result of adding is: " + result);
            } else if (addOrSubstract.equals("subtract")){
                System.out.println("Write first number");
                a = scan.nextInt();
                System.out.println("Write second number");
                b = scan.nextInt();
                result = subtractBFromA(a,b);
                System.out.println("Result of subtraction is: " + result);
            }
        }
    }

}
