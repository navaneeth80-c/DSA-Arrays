public class ReverseOfanArrayUsingSwapFunction {
    public static void Reverse(int num[])
    {
        int first=0,last=num.length-1,temp;
        while (first<last)
        {
            temp=num[first];
            num[first]=num[last];
            num[last]=temp;
            last--;first++;
        }
    }
    public static void main(String arrgs[])
    {
        int num[]={1,2,3,4,5,6};
        Reverse(num);
        for(int i:num)
        {
            System.out.print(i);
            System.out.print("\t");
        }
    }
}
