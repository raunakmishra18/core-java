package practices;
import java.util.Scanner;
public class sumofoddnumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to the add of odd number calculator");
        System.out.println("enter the number");
        int num = input.nextInt();
        int sum = oddsum(num);
        System.out.println("sum of odd number"+sum);
    }
    // FUNCTION START
    public static int oddsum(int num) {
        int sum =0;
        int i=1;
        while (i<=num) {
            sum = sum + i;
            i = i+2;
        }
        return sum;
    }
}
