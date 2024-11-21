import java.util.*;
public class deleteArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to array deletion");
        int[] numArr=arrayutility.inputarray();
        System.out.println("now enter the number you want to delete from in array");
        int numToDelete=input.nextInt();
        int[] newArray=deleteNumber(numArr, numToDelete);
        System.out.println("array after deletion");
        arrayutility.displayArr(newArray);
    }
    public static int[] deleteNumber(int[]numArr, int numToDelete) {
        int occ=occurances.noOfoccurance(numArr, numToDelete);
        if(occ==0){
            return numArr;
        }
        int newSize=numArr.length-occ;
        int[] newArr= new int[newSize];

        int i=0, j=0;
        while (i<numArr.length) {
            if (numArr[i]!=numToDelete) {
                newArr[j]=numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
