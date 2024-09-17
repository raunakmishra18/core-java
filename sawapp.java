import java.util.Scanner;
public class sawapp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sawaping calculator\n\n");
        System.out.println("enter number A");
        int a = sc.nextInt();
        System.out.println("enter number B");
        int b = sc.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("sawapping done:");
        System.out.println("vailue of A is:" +a);
        System.out.println("vailue of B is:" +b);
    }
}