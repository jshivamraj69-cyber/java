package basics.basics;

import java.util.Scanner;
public class TernaryOperator {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to number checker\n ");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Now enter the second number:");
        int number2 = scanner.nextInt();
        if (number > number2) {
            System.out.println("The first number is greater than the second number.");
        } else if (number < number2) {
            System.out.println("The first number is less than the second number.");
        } else {
            System.out.println("Both numbers are equal.");
            int greaterNumber = (number > number2) ? number : number2;
            System.out.println("The greater number is: " + greaterNumber);
        }
    }

}
 
