package practices;
import java.util.Scanner;
// public class mtable {
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         System.out.println("welcome to multiplication calculator\n");
//         System.out.print("enter number");
//         int num=input.nextInt();
//         int i=1;
//         while (i<=10) {
//             System.out.println(num +"X" +i+ "=" +num*i);
//             i++;
//         }
//     }
// }

public class mtable{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("multiplication calculator");
        System.out.print("enter the number");
        int num = input.nextInt();
        multiplication(num);
    }
    public static void multiplication(int num) {
        int i = 1;
        while (i<=10) {
            System.out.println(num+"X"+i+"="+num*i);
            i++;
        }
    }
}