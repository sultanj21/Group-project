package homworkch4;
/**
 * class : Factorial
 *   @author : Sultan Abuhijleh
 *  @version : 1.0
 *  @course : Itec 2140 Fall 2023
 *  description : this program will calculate and print the factorial of the user provided value
 */

import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
       int n = input.nextInt();
       int fact = 1;
       for(int i =1; i<= n ;i++){
           fact = fact * i;
       }
        System.out.println(fact);
    }
}
