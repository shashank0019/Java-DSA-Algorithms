 //positive to negative and positive to negative
 import java.util.*;

public class Eighteen{

    public static int countSignChanges(int[] nums) {

    int count = 0;

    for (int i = 1; i < nums.length; i++) {

        if ((nums[i] > 0 && nums[i - 1] < 0) ||
            (nums[i] < 0 && nums[i - 1] > 0)) {

            count++;
        }
    }

    return count;
}

    public static void main(String[] args) {

        int[] nums = {4005, 67, 10000, 52, 99, 120000, 50};
        int[] nums1 = {60, -70, -80, 90};
        int[] nums2 = {10, 20, 30};
        int[] nums3 = {51, 99, 50, 100};
        int[] nums4 = {75};
        int[] nums5 = {};
        int[] nums6 = null;
        int[] nums7 = {50, 100, 150, 200};
        int result = countSignChanges(nums1);
        System.out.println("the result is " + result) ;

        
    }
} 
    

