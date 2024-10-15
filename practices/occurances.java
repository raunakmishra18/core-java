import java.util.Scanner;
public class occurances{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to fine occurances in array");
        int[] arr=arrayutility.inputarray();
        System.out.print("enter the number you are find in array ");
        int number=input.nextInt();
        int occurance=noOfoccurance(arr, number);
        System.out.print("your number in array" + occurance + "times");

    }
    public static int  noOfoccurance(int[] arr, int number) {
        int occ=0;
        int i=0;
        while (i<arr.length) {
            if (number==arr[i]) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}