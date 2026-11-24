//sum the numbers of array

import java.util.Arrays;

public class Seventeen{

    public static int[] SumArraynumber(int[]nums)
    {
        int [] result = new int[nums.length];
        
        for(int i =0;i<nums.length;i++)
        {
            int sum=0;

        
        int temp =nums[i];
        while(temp>0){
            int digit = temp%10;
            sum+=digit;
            temp = temp/10;
        }
        result[i] =sum;
        

        }
        return result;

    }
    public static void main(String[] args) {
        int[] nums = {121, 45, 7, 1331, 80};
         int[] nums1 = {60, 70, 80, 90};
        int[] nums2 = {10, 20, 30};
        int[] nums3 = {51, 99, 50, 100};
        int[] nums4 = {75};
        int[] nums5 = {};
        int[] nums6 = null;
        int[] nums7 = {50, 100, 150, 200};
        int []result = SumArraynumber(nums);

        System.out.println(" element: " + Arrays.toString(result));

        
    }

}