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
        int num1, num2, sum, product;
        Scanner inputNum = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num1 = inputNum.nextInt();
        System.out.println("Enter another number: ");
        num2 = inputNum.nextInt();

        sum = num1 + num2;
        product = num1 * num2;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
