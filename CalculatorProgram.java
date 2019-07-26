package com.org;

import java.util.Scanner;

public class CalculatorProgram {
	public static void main(String[] args) {
		
	
    Operation o = new Operation();


    Scanner input = new Scanner(System.in);
    double a,b;
    int userChoice;

    System.out.print(" Enter The First Number: ");
    a = input.nextDouble();
    System.out.print(" Enter The Second Number: ");
    b = input.nextDouble();
    System.out.println(" Select Operation to Perform:");
    System.out.println("1-Addition");
    System.out.println("2-Subtraction");
    System.out.println("3-Division");
    System.out.println("4-Multiplication");
    userChoice = input.nextInt();

    switch (userChoice){
    case 1:
        o.addition(a,b);
       // System.out.println();
        break;
    case 2:
        o.subtraction(a,b);
        break;
    case 3:
        o.division(a,b);
        break;
    case 4:
        o.multiplication(a,b);
        break;
    }


}



}
