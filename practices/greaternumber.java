// package practices;
import java.util.Scanner;

public class greaternumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welometo find greater number\n");
        System.out.print("enter first number");
        int num1 = input.nextInt();
        System.out.print("enter secound number");
        int num2 = input.nextInt();
        System.out.print("enter third number");
        int num3 = input.nextInt();


        if(num1>=num2 && num1>=num3){
            System.out.println("the greater number is" + num1);
        }else if(num2>=num3){
            System.out.println(num2 + "is the greater number");
        }else{
            System.out.println(num3 + "is the greater number");
        }
    }
}
