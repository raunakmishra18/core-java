
import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcom to GCD ");
        System.out.println("enter first number ");
        int first = input.nextInt();
        System.out.println("enter the secound number ");
        int secound = input.nextInt();
        int result = calculate( first, secound);
        System.out.println("GCD" +result);

    }
    public static int calculate (int first,int secound){
        int gcd = 1;
        int i = 1;
        int least=least(first, secound);
        while (i<=least) {
            if (first%i == 0 &&  secound%i==0) {
                gcd=i;
            }
            i++;
        }
        // return gcd;
        return gcd;
    }
    public static int least(int first,int secound){
        if (first<secound) {
            return first;
        }else{
            return secound;
        }
    }
}
