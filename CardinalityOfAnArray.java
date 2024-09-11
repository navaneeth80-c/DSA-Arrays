public class CardinalityOfAnArray {
    public static void array(int num[])
    {
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                System.out.print("( "+num[i]+" , "+num[j]+" )");
                System.out.print("\t");
            }
            System.out.println();
        }
    }
    public static void main(String arrgs[])
    {
        int num[]={2,4,6,8,10};
        array(num);
    }
}