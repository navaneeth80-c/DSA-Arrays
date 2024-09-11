import java.util.*;
public class ArrayMarkUpdater {
    public static void markup(int num[])
    {
        for(int i=0;i<num.length;i++)
        {
            num[i]=num[i]+1;
        }
    }
    public static void main(String arrgs[])
    {
        int num[]=new int[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<num.length;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("before print: ");
        for(int i=0;i<num.length;i++)
        {
            System.out.println("number: "+num[i]);
        }
        System.out.println("after print");
        markup(num);
        for (int i=0;i<num.length;i++)
        {
            System.out.println(num[i]);
        }
    }
}
