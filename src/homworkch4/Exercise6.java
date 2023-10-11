package homworkch4;
/**
 * class : Sum
 *  @author : Sultan Abuhijleh
 *  @version : 1.0
 *  @course : Itec 2140 Fall 2023
 *  @description : this program will displays the sum of the digits of the provided intger
 *
 */
import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an number");
        int num = input.nextInt();
        int k =num;
        int sum = 0;
        while(num != 0){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println("The sum of digits of " + k + " is " + sum);
    }
}
