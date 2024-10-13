import java.util.*;
public class lrfthalfpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        int number=sc.nextInt();
        leftpattern(number);
    }
    public static void leftpattern(int number ) {
        int row=number;
        while (row>0) {
            int i=0;
            int j=0;
        while (j<=row) {
            System.out.print("  ");
            j++;
        }
            while (i<=number-row) {
                System.out.print(" *");
                i++;
            }

            System.out.println();
            row--;
        }
    }
}
