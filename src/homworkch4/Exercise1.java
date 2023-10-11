package homworkch4;
/**
 * @class :
 * @author : Sultan Abuhijleh
 * @version : 1.0
 * @course : Itec 2140 Fall 2023
 * @description : this program will take integer form the user and display if the number is prime or not
 */

import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter an intger");
        int num = input.nextInt();
        boolean isprime = num > 1;
        for(int i = 2; i < num; i++ ){
            if(num % 2 ==0){
                isprime = false;
            }

        }
        if(isprime){
            System.out.println(num +" is prime");
        }else{
            System.out.println(num +" is not prime");
        }
    }
}
