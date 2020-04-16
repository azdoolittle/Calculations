/*
Pseudocode:
import scanner
declare class
declare method
declare scanner input
declare int vars for num 1, num 2, sum, product
prompt user for integer1 input
initialize input integers
prompt user for integer2 input
calculate sum
calculate product
output the sum and product
 */

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        int num1, num2, num3, sum, product, square;
        String inputText1, inputText2, outputText;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num1 = input.nextInt();
        System.out.println("Enter another number: ");
        num2 = input.nextInt();
        System.out.println("Enter another number: ");
        num3 = input.nextInt();
        input.nextLine();
        System.out.println("Enter some words: ");
        inputText1 = input.nextLine();
        System.out.println("Enter some more words: ");
        inputText2 = input.nextLine();


        sum = num1 + num2;
        product = num1 * num2;
        square = num3 * num3;
        outputText = inputText1 + " " + inputText2;


        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Square: " + square);
        System.out.printf("Combined sentences: %s", outputText);

    }
}
