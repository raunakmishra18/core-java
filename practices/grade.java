// package practices;
import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("grade calculator\n");
        System.out.println("plese enter your marks precentage");
        int marks = input.nextInt();
        if (marks >= 90){
            System.out.println("your grade is A");
        }else if (marks >= 75) {
            System.out.println("your grade is B");
        }else if (marks >= 60){
            System.out.println("your gradenis C");
        }else if(marks >= 30){
            System.out.println("your grade is D");
        }else{
            System.out.println("your grade is F");
        }
    }
}
