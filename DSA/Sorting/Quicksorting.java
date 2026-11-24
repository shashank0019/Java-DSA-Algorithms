public class Quicksorting {

    public void Quicksss(int[]nums,int l,int h)
    {   if (l >= h) {
        return;
        }
        int i= l;
        int j=h;
        int pivot = nums[l];
        if (l >= h) {
        return;
        }
        while(i<j)
        {
            while(i<=h && nums[i]<=pivot )
            {
                i++;
            }
            while(j>l && nums[j]>pivot)
            {
                j--;
            }
            if(i<j)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j]= temp;
            }


} 
int t = nums[l];
nums[l]  = nums[j];
nums[j]=t; 



Quicksss(nums, l, j-1);
Quicksss(nums, j+1, h);
 }


    
    public static void main(String[] args) {
        int[] nums= {50,80,20,70,30,60,10,40};
        int[] nums1 = {5, 3, 8, 1, 2};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = {5, 4, 3, 2, 1};
        int[] nums4 = {4, 4, 2, 2, 1};
        int[] nums5 = {0, -3, 5, -1, 2};
        int[] nums6 = {9, 1};
        int[] nums7 = {7};
        int[] nums8 = {};
        int[] nums9 = null;
        int[] nums10 = {Integer.MAX_VALUE, 0, Integer.MIN_VALUE};
        int l = 0;
        int h = nums5.length-1;
        Quicksorting ob =  new Quicksorting();
        ob.Quicksss(nums5, l, h);
        for(int arr:nums5){
            System.out.println(arr +" ");

        }
        
        
    }
    
}
