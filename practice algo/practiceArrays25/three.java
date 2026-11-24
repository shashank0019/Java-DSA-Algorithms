 import java.util.*;

public class three {

    public static int[] filNumbers(int[] nums) {

        if (nums ==null||nums.length== 0) {
            return null;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) 
        {

            if (nums[i] > 50 && nums[i] < 100) {
                nums[j] = nums[i];
                j++;
            }
        }

        return Arrays.copyOf(nums, j);
    }

    public static void main(String[] args) {

        int[] nums = {45, 67, 100, 52, 99, 120, 50};
        int[] nums1 = {60, 70, 80, 90};
        int[] nums2 = {10, 20, 30};
        int[] nums3 = {51, 99, 50, 100};
        int[] nums4 = {75};
        int[] nums5 = {};
        int[] nums6 = null;
        int[] nums7 = {50, 100, 150, 200};

        System.out.println(Arrays.toString(filNumbers(nums)));
    }
} 
    

