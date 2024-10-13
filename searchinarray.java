import java.util.*;
public class searchinarray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] myarr={23,24,25,26,27,28,29,20,31,32,35};
        System.out.println("enter the number you want to search in array");
        int number=input.nextInt();
        boolean isfound=isfound(myarr, number);
        if (isfound) {
            System.out.println("your number in the array");
        }else{
            System.out.println("your number is not in array");
        }
    }
    public static boolean isfound(int[] arr,int number) {
        int index=0;
        while (index<arr.length) {
            if (arr[index]==number) {
                return true;
            }
            index++;
        }
        return false;
    }
}
