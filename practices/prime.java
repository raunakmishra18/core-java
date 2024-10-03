import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("prime number checking");
        System.out.println("enter the number");
        int number = sc.nextInt();
        boolean isprime=primeNumber(number);
        System.out.println(isprime);
        if (isprime) {
            System.out.println("your number is prime");
        }else{
            System.out.println("your number is not prime");
        }


    }
    public static boolean primeNumber(int number) {
        int i = 2;
        while (i<number) {
            if (number%i==0) {
                return false;
            }
            i++;
        }
        return true;

    }
}
