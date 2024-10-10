import java.util.*;
public class reversePattern {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int number=input.nextInt();
        pattern(number);
    }
    public static void pattern(int number) {
        int row=number;
        while (row>0) {
            int i=0;
            while (i<row) {
                System.out.print(" *");
                i++;
            }

            row--;
            System.out.println();
        }
        // row--;
    }
}
