

public class two {

    public static double AvMarks(int[] nums) {

        if (nums==null||nums.length ==0) {
            return 0.0;
        }

        int sum = 0;

        for (int i= 0; i< nums.length;i++) {
            sum += nums[i];
        }
        double re =(double)sum/nums.length;
        return re;
    }

    public static void main(String[] args) {

        int[] nums = {70, 85, 90, 55};
        int[] nums1 = {100, 100, 100};
        int[] nums2 = {50};
        int[] nums3 = {0, 0, 0};
        int[] nums4 = {-10, 20, 30};
        int[] nums5 = {};
        int[] nums6 = null;

        System.out.println(AvMarks(nums));

    }
}