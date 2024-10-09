// import java.util.Scanner;
// public class patternquestion {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for (int j=1;j<=m;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.Scanner;
// public class patternquestion{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         for (int i = 1; i<=n; i++){
//             for(int j = 1;j<=m; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

public class patternquestion{
    public static void main(String[] args) {
        int row=0;
        while (row<5) {
            System.out.println("*");
            int i=0;
            while (i<row) {
                System.out.print("*");
                i++;
            }
            row++;
        }
    }
}