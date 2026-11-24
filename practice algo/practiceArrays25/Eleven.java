 //find the score greater than 10k and max
 import java.util.*;

public class Eleven{

    public static int[] countAndMax(int[] nums) {

        int count =0;
        int max = nums[0];
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]>=10000){
                count++;
            }
            if(nums[i]>max)
            {
                max= nums[i];
            }
        }
        return new int[]{count,max};

        
    }

    public static void main(String[] args) {

        int[] nums = {4005, 67, 10000, 52, 99, 120000, 50};
        int[] nums1 = {60, 70, 80, 90};
        int[] nums2 = {10, 20, 30};
        int[] nums3 = {51, 99, 50, 100};
        int[] nums4 = {75};
        int[] nums5 = {};
        int[] nums6 = null;
        int[] nums7 = {50, 100, 150, 200};
        int []result = countAndMax(nums);
        System.out.println("the result is " + Arrays.toString(result)) ;

        
    }
} 
    

