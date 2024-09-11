import java.util.*;
public class ArraysCc {
    public static void array()
    {
        int num[]=new int[4];
        Scanner sc=new Scanner(System.in);
        int i=0;
        while (i!=4)
        {
            num[i]= sc.nextInt();
            i++;
        }
        System.out.println("phy: "+num[0]);
        System.out.println("computer: "+num[1]);
        System.out.println("chem: "+num[2]);
        System.out.println("math: "+num[3]);
        i=0;
        int percentage=0;
        while (i!=4)
        {
            percentage+=num[i];i++;

        }
        System.out.println("total: "+percentage);
        System.out.println("percentage: "+percentage/i);
    }
    public static void main(String arrgs[])
    {
        Scanner sc=new Scanner(System.in);
        String names[]= new String[100];
        for(int i=0;i<4;i++)
        {
            names[i]=sc.nextLine();
        }
        for(int i=0;i<4;i++)
        {
            System.out.println("hello "+names[i]);
        }
        System.out.println(names.length);
    }
}
