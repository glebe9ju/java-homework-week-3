package homework_week_7;

import java.util.Scanner;

/**
 * 1. Write a  java program that tells os that Input number is odd or even?
 * HINT : use ternary operator( ? :)
 */
public class Programme_1_OddEvenTernaryOperator {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number :");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);
        //closing the scanner object
        scanner.close();
    }
    //Checking the number is even or odd
    public static void isItOddOrEvenNumber(int number){
        //ternary operator is used
        String evenorOdd = (number % 2 == 0) ? "Even" : "odd";
        System.out.println("The " + number + " is " + evenorOdd + " number");
    }
}
