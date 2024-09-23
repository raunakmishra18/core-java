// public class functinn {
//     public static void main(String[] args) {
//         // Scanner Sc=new Scanner(System.in);
//         // System.out.println("good orning");
//         greeting();
//         strat();
//     }

//     public static void greeting( ) {
//         System.out.println("write someting");
//         // String str = Sc.nextLine();
//         System.out.println("good morning");
//     }
//     public static void strat( ) {
//         System.out.println("lets go");
//     }
// }

// print pattern

// public class function{
//     public static void main(String[] args) {
//         firstpattern();
//         secoundpattern();
//     }
//     public static void firstpattern(){
//         int rows=0;
//         while (rows<10) {
//             System.out.print("*");
//             int i=0;
//             while (i<rows) {
//                 System.out.print("*");
//                 i++;
//             }
//             rows++;
//             System.out.println( );
//         }
//     }
//     public static void secoundpattern(){
//         System.out.println("   *");
//         System.out.println("  **");
//         System.out.println(" ***");
//         System.out.println("****");
//     }
// }


// FUNTION RETURN TYPE

import java.util.Scanner;
public class function{
    public static void main(String[] args) {
        greet();
        int first =readnumber();
        int secound =readnumber();
        int result=first + secound;
        System.out.println("result " + result);
        
        }
        public static void greet(){
            System.out.println("welcone to the calculator");
    }
    public static int readnumber(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first number");
        int number=input.nextInt();
        return number;
    }
    
}