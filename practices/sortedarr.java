public class sortedarr {
    public static void main(String[] args) {
        System.out.println("welcome to check array is shorted\n");
        int[] nums= arrayutility.inputarray();
        boolean inc=isincresing(nums);
        boolean dec=isdecresing(nums);
        if (inc || dec) {
            System.out.println("your array is shorted");
        }else{
            System.out.println("your array is not shorted");
        }
    }
    public static boolean isincresing(int[] nums){
        int i=1;
        while (i<nums.length) {
            if (nums[i]<nums[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isdecresing(int[] nums){
        int i=1;
        while (i<nums.length) {
            if (nums[i]>nums[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }

}
