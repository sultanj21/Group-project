package homworkch4;
/**
 * @class :MaxMin
 * @author : Sultan Abuhijleh
 * @version : 1.0
 * @course : Itec 2140 Fall 2023
 * @description : this program will display the highest grade and the lowest grade
 */

import java.util.Scanner;
public class Exercise3 {
        public static void main(String[] args) {
            Scanner input = new java.util.Scanner(System.in);
            System.out.println("Enter as many grades as you want to stop enter any charcter");
            int max = input.nextInt();
            int min = max;

            while (input.hasNextInt()) {
                int value = input.nextInt();

                if (value > max) {
                    max = value;
                }
                if (value < min) {
                    min = value;
                }
            }
            System.out.println("max grade is " + max);
            System.out.println("min grade is " + min);
        }
    }


