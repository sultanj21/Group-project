package homworkch4;
import java.util.Scanner;
public class Exercise2AnotherWay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter as many student grades as you like. Enter a character to stop.");
        double minGrade = Double.MAX_VALUE;
        double maxGrade = Double.MIN_VALUE;
        while (input.hasNextDouble()) {
            double grade = input.nextDouble();
            minGrade = Math.min(minGrade, grade);
            maxGrade = Math.max(maxGrade, grade);
        }
        System.out.println("The highest grade is: " + maxGrade);
        System.out.println("The lowest grade is: " + minGrade);



    }

    }





