package homworkch4;
/**
 *
 * @class : Pattern
 * @author : Sultan Abuhijleh
 * @version : 1.0
 * @course : Itec 2140 Fall 2023
 * @description : this code will create the pattern that is in the exercise
 */

public class Exercise10 {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
