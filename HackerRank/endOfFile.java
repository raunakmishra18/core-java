package HackerRank;
import java.util.*;
public class endOfFile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        while (sc.hasNextInt()) {
            System.out.print((i+1)+" "+sc.hasNextLine());
            i++;
        }
        System.out.println();
    }
}
