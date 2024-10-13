public class array {
    public static void main(String[] args) {
        // int myarray[]=new int[5];
        // myarray[0]=94;
        // myarray[2]=92;
        // myarray[3]=96;
        // myarray[1]=91;
        // myarray[4]=97;
        int[] myarray={94,91,92,96,97};
        // System.out.println(myarray[4]);
        // System.out.println(myarray[3]);
        // System.out.println(myarray[2]);
        // System.out.println(myarray[1]);
        // System.out.println(myarray[0]);

        //USE LOOP

        // int index=0;
        // while (index<5) {
        //     System.out.println(myarray[index]);
        //     index++;
        // }


        int index=0;
        while (index<myarray.length) {
            System.out.println(myarray[index]);
            index++;
        }


    }
}
