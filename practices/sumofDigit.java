// package practices;
import java.util.Scanner;
public class sumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("sum of digit calculator");
        System.out.println("enter the digit number");
        int digit = sc.nextInt();
        int sum = sumOfDigit(digit);
        System.out.println(sum);

    }
    public static int sumOfDigit(int digit){
        int sum = 0;
        while (digit>0) {
            sum =sum+digit%10;
            digit=digit/10;
        }
        return sum;
    }
}
