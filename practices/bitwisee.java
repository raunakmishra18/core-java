package practices;
import java.util.*;


public class bitwisee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int first = input.nextInt();
        System.out.println("enter secound number");
        int secound = input.nextInt();
        int result = first & secound;
        System.out.println("resulat is: " + result);
    }
}
