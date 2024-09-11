public class PairsInArray {
    public static void pair(int num[])
    {                                           //just like cardinality ratio
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++) {
                System.out.print("( " + num[i] + ", " + num[j] + ")");

            }
            System.out.println();
        }
    }
    public static void main(String arrs[])
    {
        int num[]={2,4,6,8,10};
        pair(num);
    }
}
