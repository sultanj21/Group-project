package homworkch4;
import java.sql.SQLOutput;
import java.util.Scanner;
/**
 * class : Lexicographic
 *  *   @author : Sultan Abuhijleh
 *  *  @version : 1.0
 *  *   @course : Itec 2140 Fall 2023
 *  *   description : this code will tell the user which string is larger in lexicographic order
 *
 */
public class Exercise7 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = input.next();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the second string");
        String str2 = input2.nextLine();
        int lengthComparison = str1.length() - str2.length();
        int leicographicComparison =str1.compareTo(str2);
        if(lengthComparison > 0){
            System.out.println("String one is bigger then string two");

        } else if (lengthComparison < 0 ) {
            System.out.println("string one is smaller than string two");

        }else {
            System.out.println("both string are the same length");
        }if(leicographicComparison < 0){
            System.out.println("String one appears before string two in lexicographic order");
        }else if (leicographicComparison > 0){
            System.out.println("String two appears before string one in lexicographic order");
        }else{
            System.out.println("both strings are lexicographic equal");
        }
        String both = str1 + " " + str2;
        System.out.println("combined is " + both);
    }
}
