import java.util.Scanner;
public class arraysumaverage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to the sun and average of array element");
        System.out.println("enter the size of element");
        int size=input.nextInt();
        int[] nums=new int[size];
        int i=0;
        while (i<size) {
            System.out.print("plese enter your element number"+(i+1) +" ");
            nums[i]=input.nextInt();
            i++;
        }
        long sum=sumarray(nums);
        int avg=avgarray(nums);
        System.out.println("sum of the element is"+sum);
        System.out.println("avg of the element is"+avg);
    }
    public static long sumarray(int []nums) {
        long sum=0;
        int i=0;
        while (i<nums.length) {
            sum=sum+nums[i];
            i++;
        }
        return sum;
    }
    public static int avgarray(int[]nums) {
        long avgsum=sumarray(nums);
        int avg=(int)(avgsum/nums.length);
        return avg;
    }
}
