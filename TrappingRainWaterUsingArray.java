public class TrappingRainWaterUsingArray {
    public static void trapvaolume(int num[])
    {
      //  int max=Integer.MIN_VALUE;
        //int min =Integer.MAX_VALUE;
        //forming two arrays which holds left most max bound & right most max bound from the current block.
        int LHarray[]= new int[num.length];
        int RHarray[]= new int [num.length];
        //there  is no left most for the first element of the array ,so we consider that  itself is the left most and same for the right most element.
        LHarray[0]=num[0];
        for(int i=1;i<num.length;i++) {
            LHarray[i] = Math.max(num[i], LHarray[i - 1]);
        }
        int Total_water=0;
        //note hear index starts from the last element so i=num.length and while comparing the previous elements index is i+1.
        RHarray[num.length-1]=num[num.length-1];
        for(int i=num.length-2;i>=0;i--)
        {
            RHarray[i]=Math.max(RHarray[i+1],num[i]);
        }                                   //which is   height                 * width
        //formula to calculate the trapped water is =(water level -block height) *width hear width is 1
                //while considering for the (water level -block height) water level is considered minimum out of its upper and lower bounds.
        for(int i=0;i<num.length;i++)
        {
            Total_water+=(Math.min(RHarray[i],LHarray[i]))-num[i];
        }

            System.out.println("total volume of the water stored in between the blocks: "+Total_water);
    }

    public static void TrappingWaterOptimized(int num[])
    {
        int lhu[]= new int[num.length];
        int rhu[] = new int[num.length];
        lhu[0]=num[0];
        int volume=0;
        rhu[num.length-1]=num[num.length-1];
        for(int i=1;i<num.length;i++) {
            rhu[num.length - 1 - i] = Math.max(num[num.length - 1 - i], rhu[num.length - i]);
            lhu[i] = Math.max(num[i], lhu[i - 1]);
        }
        for(int i=0;i<num.length;i++){
            volume+=Math.min(rhu[i],lhu[i])-num[i];
        }
        System.out.println(volume);
    }
    public static void main(String arrgs[])
    {
        int num[]={4,2,0,6,3,2,5};
        //int num[]={4,3,5,7,10,6};
         //   trapvaolume(num);
        TrappingWaterOptimized(num);
    }
}
