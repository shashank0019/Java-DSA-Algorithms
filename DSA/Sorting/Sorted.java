import java.util.*;

public class Sorted {

    public void SortedElements(int[] nums) {

        if (nums == null || nums.length == 0) {
            System.out.println("empty");
            return;
        }

        int write = 0;

        for (int read = 1; read < nums.length; read++) {

            if (nums[read] == nums[read - 1]) {
                continue;
            } else {
                nums[write] = nums[read - 1];
                write++;
            }
        }
        nums[write]=nums[nums.length-1];
        write++;

        while(write ==0){
            nums[write] =nums[0];
            write++;
        }
        
        while(write<nums.length){
            nums[write]=0;
            write++;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {

        int[] nums = {4, 4, 5, 5, 7};
        int[] nums1 ={1,1,1,1,1};
        int[] nums2 ={};
        int[] nums3 ={1,2,3,3,4,5,6,6,7,8,9,9};
       


        Sorted obj = new Sorted();
        obj.SortedElements(nums3);
    }
}