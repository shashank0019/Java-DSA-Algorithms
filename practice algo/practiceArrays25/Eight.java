//odd number id doubled and even number is halfed

import java.util.Arrays;

public class Eight {

    
    public int [] DoubleHalf(int[]nums)
    {
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                nums[i]= nums[i]/2;
            }
            else{
               nums[i] = nums[i]*2;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
      Eight ob = new Eight();
        int[] nums = {70, 85, 90, 25,31,78,3};
        int[] nums1 = {100, 100, 100};
        int[] nums2 = {50};
        int[] nums3 = {0, 0, 0};
        int[] nums4 = {-10, 20, 30};
        int[] nums5 = {};
        int[] nums6 = null;
       int [] result = ob.DoubleHalf(nums);
        System.out.println("the result is " + Arrays.toString(result)) ;
        
        }
        
    }
    

