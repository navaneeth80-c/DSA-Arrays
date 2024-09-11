public class RotatedArraySearch {
    public static int search(int[] num,int target)
    {
        int min=PivotPointSearch(num);
        if(num[min]<=target && target<=num[num.length-1])
        {
            return search(num,min,num.length-1,target);
        }else{
            return search(num,0,min,target);
        }
    }
    public static int search(int[] num,int start,int end, int target)
    {
        int l=start,r=end;
        while (l<=r)
        {
            int mid=l+(r-l)/2;
            if(num[mid]==target)
            {
                return mid;
            } else if (num[mid]>target) {
                r=mid-1;

            }else{
                l=mid+1;
            }
        }
        return -1;
    }
    public static  int PivotPointSearch(int[] num)
    {
        int start=0,end=num.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid>0 && num[mid]<num[mid-1])
            {
                return mid;
            }else if(num[mid]>=num[start] && num[mid]>num[end])
            {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }
    public static void main(String args[])
    {
       // int num[]={4,5,6,7,0,1,2};
       int num[]={1};
        System.out.println(search(num,0));
    }
}
