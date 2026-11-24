import java.util.*;

public class Sorting {

    public void SortedElements(int[] nums) {

        if (nums == null || nums.length == 0) {
            System.out.println("empty");
            return;
        }

        int write = 0;
        

        for (int read = 0; read < nums.length; read++) {
               int count =0;
            for(int readag =0;readag<nums.length;readag++){
                if(nums[read]==nums[readag]){
                    count++;

                }

            }
            if(count==1){
                nums[write] =nums[read];
                write++;
            }

        }
        

        System.out.println(Arrays.toString(Arrays.copyOf(nums, write)));
    }

    public static void main(String[] args) {

        int[] nums = {4, 4, 5, 5, 7};
        int[] nums1 ={1,1,1,1,1};
        int[] nums2 ={};
        int[] nums3 ={1,2,3,3,4,5,6,6,7,8,9,9};
       


        Sorting obj = new Sorting();
        obj.SortedElements(nums3);
    }
}