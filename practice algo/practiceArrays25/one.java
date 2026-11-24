
import java .util.*;
public class one {

    public static int[] OddEven(int[] nums) {//return array

    if (nums==null||nums.length ==0) {
            return null;
        }

    int odcount = 0;//initaial
    int evcount = 0;//inaiatal

        for (int i= 0; i<nums.length;i++) {

            if (nums[i] % 2 == 0) //cond
            {
                evcount++;//increment
            } else {
                odcount++;//increment
            }
        }

        return new int[]{odcount, evcount};//return array we declare array
    }

    public static void main(String[] args) {

        int[] nums = {3, 8, 5, 12, 7};
        int[] nums1 = {2, 4, 6, 8};
        int[] nums2 = {1, 3, 5, 7};
        int[] nums3 = {0, -3, 5, -1, 2};
        int[] nums4 = {9, 1};
        int[] nums5 = {7};
        int[] nums6 = {};
        int[] nums7 = null;
        

        System.out.println(Arrays.toString(OddEven(nums)));
        
    }
}