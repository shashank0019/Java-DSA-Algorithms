
public class sixteen {

    public static int CheckPalindrome(int[] nums) {

        if (nums == null||nums.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0;i< nums.length;i++) {

            int original = nums[i];
            int temp = original;
            int rev = 0;
            if (temp < 0) {
                continue;
            }

            while (temp > 0) {

                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp = temp / 10;
            }

            if (original == rev) {
                count++;
            }
        }

        return count;
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
        int result = CheckPalindrome(nums);

        System.out.println(" element: " + result);

       
    }
}
