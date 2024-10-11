import java.util.*;
public class lrfthalfpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number=sc.nextInt();
        leftpattern(number);
    }
    public static void leftpattern(int number ) {
        int row=number;
        int j=0;
        while (j<row-number) {
            System.out.print("  ");
            j++;
        }

        while (row>0) {
            int i=0;
            while (i<=number-row) {
                System.out.print("*");
                i++;
            }

            System.out.println();
            row--;
        }
    }
}
