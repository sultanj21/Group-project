package homworkch4;
/**
 *  @class :Average
 *  @author : Sultan Abuhijleh
 *  @version : 1.0
 * @course : Itec 2140 Fall 2023
 * @description : this program will take the user grade and calculate the average
 */

import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i = 0; i >5 ; i++){


        }System.out.print("enter a grade or character to stop");
        sc.hasNextInt();

            double sum=0;
        int count=0;
        int marks=1;
        while(sc.hasNextInt()){
            marks=sc.nextInt();
            sum+=marks;
            count++;
        }

        double avg=(double)((double)sum/(double)count);
        System.out.println("Average student grade is "+avg);
    }
}
