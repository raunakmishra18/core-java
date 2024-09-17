package practices;
import java.util.Scanner;
public class oddnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("checking the number odd and even\n");
        System.out.println("enter the number");
        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + "is odd number");
        }
    }
}
