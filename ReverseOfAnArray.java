public class ReverseOfAnArray {
    public static void Rreverse(int num[])
    {
        int temp;
        for(int i=0;i<num.length/2;i++)
        {
            temp=num[i];
            num[i]=num[num.length-i-1];
            num[num.length-i-1]=temp;
        }
    }
    public static void main(String arrgs[])
    {
        int num[]={10,2,3,4,5,6,7,8};
        Rreverse(num);
        for(int i:num)
        {
            System.out.print(i);
        }
    }
}
