// package practices;
import java.util.*;
public class factoriall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("factorial calculator");
        System.out.println("enter the number");
        int num = sc.nextInt();
        int fact=factorial(num);
        System.out.println(fact);

    }

    public static int factorial(int num){
        if (num<2) {
            return 1;
        }
        int fact=1;
        int i = 2;
        while (i<=num) {
            fact=fact*i;
            i++;
        }
        return fact;
    }
}
