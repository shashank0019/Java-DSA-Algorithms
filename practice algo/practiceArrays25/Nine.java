//Divisble by both 3 and 5

import java.util.Arrays;

public class Nine{

    
    public int DivisbleBy3And5(int[]nums)

    {
        int count=0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]%3==0 &&nums[i]%5==0)
            {
                count++;
                
            }
           
        }
        return count;
    }
    public static void main(String[] args) {
      Nine ob = new Nine();
        int[] nums = {70, 85, 90, 25,31,78,3};
        int[] nums1 = {100, 100, 100};
        int[] nums2 = {50};
        int[] nums3 = {0, 0, 0};
        int[] nums4 = {-10, 20, 30};
        int[] nums5 = {};
        int[] nums6 = null;
       int result = ob.DivisbleBy3And5(nums);
        System.out.println("the result is " + result) ;
        
        }
        
    }
    

