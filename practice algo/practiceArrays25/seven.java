//how many days temop then day before we need to count
public class seven {
    public static int CheckDaysBefore(int[]nums)
    {
        if(nums==null &&nums.length==0)
        {
            return 0;
        }
        int count =0;

        for(int i =1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums ={10,3,7,34,9,13,56};
        int[] nums1 = {2, 4, 6, 8};
        int[] nums2 = {1, 3, 5, 7};
        int[] nums3 = {0, -3, 5, -1, 2};
        int[] nums4 = {9, 1};
        int[] nums5 = {7};
        int[] nums6 = {};
        int[] nums7 = null;
        int result = CheckDaysBefore(nums6);
        System.out.println("the RESULT is " + result);

        
    }
    
}
