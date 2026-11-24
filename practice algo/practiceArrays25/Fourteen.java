//sum of first and last element
public class Fourteen {
    public static int SumOfFirstAndLast(int[]nums)
    {
        int sum =0;
        for(int i =0;i<nums.length;i++)
        {
            if(i ==0 || i ==nums.length-1)
            {
                sum+=nums[i];

            }else{
                continue;
            }
        }
        return sum;
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
        int result = SumOfFirstAndLast(nums);
        System.out.println("the RESULT is " + result);

        
    }
    
}
