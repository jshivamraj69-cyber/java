package controlflow;

import java.util.Scanner;
public class DoWhile{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = input.nextInt();
        while (age < 10 || age > 100){
            System.out.println("Please enter a valid age:");
            age = input.nextInt();
        }
        System.out.println("Please enter your age:");
        age = input.nextInt();
        while (age < 10 || age > 100) {
            System.out.println("Please enter your age:");
            age = input.nextInt();
        }
        System.out.println("Your age is: " + age);
        

            }        }
                

