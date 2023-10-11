package homworkch4;
/**
 * @class :EvenOdd
 * @author : Sultan Abuhijleh
 * @version : 1.0
 * @course : Itec 2140 Fall 2023
 * @description : this program will calculate the sum of all even numbers and the product of all odd numbers
 */

import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number n");
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            int sum = 0;
            int product = 1;
            if (n > 0 && n <= 1000) {
                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0) {
                        sum += i;
                    } else {
                        product *= i;
                    }
                    System.out.println("The sum of the even numbers is:" + sum);
                    System.out.println("The product of the odd numbers is " + product);

                }

            } else {
                System.out.println("enter a valid number");
            }
        }
    }
}


