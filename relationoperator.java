// import java.util.Scanner;
// public class relationoperator{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("enter the age");
//         int age = input.nextInt();
//         if(age>=18){
//             System.out.println("you are allow for draving");
//         }else{
//             System.out.println("are you not allowed for draving");
//         }

//     }
// }





import java.util.Scanner;
public class relationoperator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("the the number");
        int number = input.nextInt();
        if(number<0){
            System.out.println("number is negative");
        }else{
            if(number>0){
                System.out.println("number is positive");
            }else{
                System.out.println("number is zero");
            }
        }
    }
}