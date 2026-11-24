
 //most runs scored ina over return the i ndex
 import java.util.*;

public class Nineteen{

    public static int MostRunsScored(int[] nums) {

        int maxs= nums[0];
        int index =0;
        for(int i =1;i<nums.length;i++)
        {
            if(nums[i]>maxs)
            {
                maxs = nums[i];
                index =i;

            }
        }
        return index;


        
    }

    public static void main(String[] args) {

        int[] nums = {4005, 67, 10000, 52, 99, 12, 50};
        int[] nums1 = {60, 70, 80, 90};
        int[] nums2 = {10, 20, 30};
        int[] nums3 = {51, 99, 50, 100};
        int[] nums4 = {75};
        int[] nums5 = {};
        int[] nums6 = null;
        int[] nums7 = {50, 100, 150, 200};
        int result = MostRunsScored(nums);
        System.out.println("the result is " + result) ;

        
    }
} 
    

