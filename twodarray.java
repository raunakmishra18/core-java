public class twodarray {
    public static void main(String[] args) {
        // int [][] myarr=new int[2][3];
        // myarr[0][0]=1;
        // myarr[0][1]=2;
        // myarr[0][2]=3;
        // myarr[1][0]=4;
        // myarr[1][1]=5;
        // myarr[1][2]=6;
        // // myarr[2][0]=7;
        // // myarr[2][1]=8;
        // // myarr[2][2]=9;
        // System.out.println(myarr[2][0]);

        int[][] myarr={{2,3,4,},{5,6,7},{8,9,10}};
        System.out.println(myarr.length);
        System.out.println(myarr[0].length);
        int i=0;
        while (i<myarr.length) {
            int j=0;
            while (j<myarr.length) {
                System.out.print(myarr[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
