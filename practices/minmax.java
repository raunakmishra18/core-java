import java.util.Scanner;
public class minmax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] numarr=arrayutility.inputarray();
        int max=max(numarr);
        int min=min(numarr);
        System.out.println("max number is array" +max);
        System.out.println("min number is array" +min);

    }
    public static int max(int[] numarr){
        if (numarr.length==0){
            return Integer.MIN_VALUE;
        }
        int max=numarr[0];
        int i=1;
        while (i<numarr.length) {
            if (max < numarr[i]) {
                max=numarr[i];
            }
            i++;
        }
        return max;


    }
    public static int min(int[] numarr){
        int min=Integer.MAX_VALUE;
        int i=0;
        while (i<numarr.length) {
            if (min>numarr[i]) {
                min=numarr[i];
            }
            i++;
        }
        return min;
    }
}
