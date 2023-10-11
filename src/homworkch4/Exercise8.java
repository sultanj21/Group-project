package homworkch4;
/**
 *  class : Reverse
 *   @author : Sultan Abuhijleh
 *  @version : 1.0
 *   @course : Itec 2140 Fall 2023
 *   description : This program will accept a string value form the user and displays the reverse of the value
 */

import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String str = scn.nextLine();

        char ch;
        String nstr = "";

        for (int i=0; i<str.length(); i++){
            ch= str.charAt(i);
            nstr= ch+nstr;
        }

        System.out.println("Reverse of "+str+" is "+nstr);

        if(str.equals(nstr)){
            System.out.println("String value "+str+" and its reverse "+nstr+" are equal");
        }
        else{
            System.out.println("String value "+str+" and its reverse "+nstr+" are not equal");
        }
    }
}
