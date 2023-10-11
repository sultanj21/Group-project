package homworkch4;
/**
 * @class : Index
 *  @author : Sultan Abuhijleh
 *  @version : 1.0
 *  @course : Itec 2140 Fall 2023
 *  @description :this program will find the last occurrence of the provided character in the provided String and display the corresponding index
 */

import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        int last=-1;

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==ch)
                last = i;
        }


        System.out.println(last);
    }
}
