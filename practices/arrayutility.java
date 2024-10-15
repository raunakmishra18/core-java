import java.util.Scanner;
public class arrayutility {
    public static int[] inputarray() {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the size of element");
        int size=input.nextInt();
        int[] nums=new int[size];
        int i=0;
        while (i<size) {
            System.out.print("plese enter your element number " +(i+1));
            nums[i]=input.nextInt();
            i++;
        }
        return nums;
    }
}
