public class SubArrayOptimaized {
    public static void suarray(int num[])
    {
        int num2[]= new int[num.length];
        num2[0]=num[0];
        for(int i=1;i<num.length;i++)
        {
            num2[i]=num2[i-1]+num[i]; //hear we are creating prefix array in the
            //prefix array every index holds the sum upto certain degit.

        }
        for(int i=0; i<num.length;i++)
        {
            int sum=0;
            for(int j=i;j<num.length;j++)
            {
                if(i==0)
                {
                    sum=num2[j];
                }else {
                    sum = num2[j] - num2[i - 1];
                }

            System.out.println("sum "+sum);}
        }
    }
    public static void main(String srrgs[])
    {
        int num[] ={1,-2,6,-1,3};
        suarray(num);
    }
}
