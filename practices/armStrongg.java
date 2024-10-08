import java.util.Scanner;
public class armStrongg{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to armstrong");
        System.out.println("enter the number");
        int number=input.nextInt();
        boolean isarmStrong=isarmStrong(number);
        if (isarmStrong) {
            System.out.println("your number is armstrong");
        }else{
            System.out.println("yout number is not armstrong");
        }
    }
    public static boolean isarmStrong(int num){
        int Digits= noOfDigits(num);
        int numCopy = num;
        int finalNumber=0;
        while (num>0) {
            int digit=num%10;
            num=num/10;
            finalNumber=finalNumber+pow(digit, Digits);
        }
        return finalNumber==numCopy;
    }
    public static int pow(int num1,int num2){
        int result=num1;
        int i = 0;
        while (i<num2) {
            result=result*num1;
            i++;
        }
        return result;
    }
    public static int noOfDigits(int num){
        int Digits=0;
        while (num>0) {
            Digits++;
            num=num/10;
        }
        return Digits;
    }
}