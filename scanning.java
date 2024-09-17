import java.util.Scanner;
public class scanning{
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        // int b = sc.nextInt();
        if (a<18) {
            System.out.println("adult");
            }else{ System.out.println("not adult");
            }
        }
    }