import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to palindrome number");
        System.out.print("enter the number");
        int num =sc.nextInt();
        boolean ispalindrome=ispalindrome(num);
        if (ispalindrome) {
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not palindrome");
        }
    }
    public static boolean ispalindrome(int num) {
        int reverse=reverse(num);
        if (num==reverse) {
            return true;
        }
        return false;
    }
    public static int reverse(int num) {
        int newNumber=0;
        while (num>0) {
            int digit=num%10;
            newNumber=newNumber*10+digit;
            num=num/10;
        }
        return newNumber;
    }
}
