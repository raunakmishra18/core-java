import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to finonacci series");
        System.out.println("enter the number uo to ");
        int number=sc.nextInt();
        
   }
   public static void main(int num) {
    if(num<0) return;
    System.out.println("0 ");
    if (num==0) return;
    System.out.println("1 ");
    int first=0;
    int secound=1;
    while (first+secound<=num) {
        int third=first+secound;
        System.out.println(third+" ");
        first=secound;
        secound=third;
    }
   }
}
