package controlflow;

import java.util.Scanner;
class MultiplicationTableFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to printing tables\n");
        System.out.print("please, enter the number of rows you want to print: ");
        int num =  sc.nextInt();
        int i = 0;
        for(int row = i; row <= 10; row++){
            System.out.println(num +"X" + i + " = " + (num * i));
            
        }
    }
}
