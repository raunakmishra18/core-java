import java.util.Scanner;
public class patternn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows");
        int row = sc.nextInt();
        firstPattern(row);
        secoundPattern(row);
    }
    public static void firstPattern(int rows){
        int row=0;
        while (row<rows) {
            System.out.print("*");
            int i=0;
            while (i<row) {
                System.out.print(" *");
                i++;
            }
            System.out.println(  );
            row++;
        }
        System.out.println();
    }


// REVERSE PATTERN

    public static void secoundPattern(int row){
        int roww=row;
        while (roww>0) {
            int i=0;
            while (i<roww) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            roww--;
        }
    }
}
