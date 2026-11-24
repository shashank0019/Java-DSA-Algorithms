
 //return true if number are in asecending order otherwise false
 import java.util.*;

public class Thriteen{

    public static boolean isTrueAscendingOrder(int[] nums) {

        boolean b = false;
        for(int i =1;i<nums.length;i++)//performs in two ways if i =0 <length-1 or i= 1 <length
        {
            if(nums[i-1]<nums[i])
            {
                b= true;
                continue;
            }
            b = false;
            
            
        }
        return b;
        

        
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
        boolean result = isTrueAscendingOrder(nums1);
        System.out.println("the result is " + result) ;

        
    }
} 
    

