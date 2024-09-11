import java.util.*;
public class ArrayLinearSearch {
    public static boolean Linear(int array[],int key)
    {
        for (int j : array) {
            if (j == key) {
                return true;
            }
        }
        return false;

    }
    public static void main(String arrgs[])
    {
        Scanner sc = new Scanner(System.in);
        int arry[]=new int[4];
        for(int i=0;i<arry.length;i++)
        {
            arry[i]= sc.nextInt();
        }
        int key;
        System.out.println("enter the key element: ");
        key= sc.nextInt();
       if(Linear(arry,key))
       {
           System.out.println("element is present");
       }else{
           System.out.println("unsuccessful search ");
       }
    }
}
