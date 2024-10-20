import java.util.*;
public class deleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("deletion array ");
        int[] numarr=arrayutility.inputarray();
        System.out.println("enter the number you want to delete in array");
        int numDelete=sc.nextInt();
        int[] newArr=deleteNumber(numarr, numDelete);
        System.out.println("here is the new array");
        arrayutility.displayArr(newArr);

    }
    public static int[] deleteNumber(int[] numarr,int numDelete){
        int[] occ=occurances.noOfoccurance(numarr,numDelete);
        int newSize=numarr.length-occ;

    }
}
