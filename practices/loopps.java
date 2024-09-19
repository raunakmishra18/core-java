import java.util.Scanner;
public class loopps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ;
        int t = 1;
        int n = sc.nextInt();
        while (t<=10) {
            a = t*n;
            System.out.println(a);
            t++;
        }
    }
}