// package practices;
import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcom to LCM");
        System.out.print("enter first number");
        int first = input.nextInt();
        System.out.print("enter secound number");
        int secound = input.nextInt();
        int factor=factorial(first, secound);
        System.out.print("LCM of the number"+ factor);
    }
    
    public static int factorial(int first,int secound){
        int i=1;
        while (i<=secound) {
            int multiple=first*i;
            if (multiple%secound==0) {
                return multiple;
            }
            i++;
        }

        return 0;
    }
}
