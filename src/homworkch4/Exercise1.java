package homworkch4;
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
