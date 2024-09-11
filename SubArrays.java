public class SubArrays {
    public static void subarry(int num[])
    {
        for(int i=0; i <num.length;i++ )
        {
            for(int j=i;j<num.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+num[k];
                    System.out.print(num[k]);
                }
                System.out.print("\t");
                System.out.println("sum: "+sum);
            }
            System.out.println();
        }
    }
    public static void main(String arrgs[])
    {
        int num[]={1,-2,6,-1,3};
       // subarry(num);
        returnsmaxminsubarray(num);
    }
    public static void returnsmaxminsubarray(int num[])
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++)
        {
            for(int j=i;j<num.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=num[k]+sum;
                   System.out.print("\t"+num[k]+" ");
                }
                min=min(sum,min);
                max=max(sum,max);
                System.out.print("\tsum: "+sum);
                System.out.println("\n");

            }
        }
        System.out.println("max: "+max);
        System.out.println("min: "+min);
    }
    public static int min(int sum,int min)
    {
        if(sum<min)
        {
            min=sum;

        }
        return min;
    }
    public static int max(int sum,int max)
    {
        if(max<sum)
        {
            max=sum;
        }
        return max;
    }
}
