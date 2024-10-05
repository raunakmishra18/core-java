import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to reverse number");
        System.out.println("enter the number");
        int num = sc.nextInt();
        int reverse=reverse(num);
        System.out.println(reverse);

    }
    public static int reverse(int num){
        int newNumber = 0;
        while (num>0) {
            int digit=num%10;
            newNumber=newNumber*10+digit;
            num/=10;
        }
        return newNumber;
    }
}
