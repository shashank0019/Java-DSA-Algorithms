
public class Ten {

    public static int ClosestToAverage(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        double avg = (double) sum / nums.length;

        int close = nums[0];//we assign a min to first number 
        double minDiff = Math.abs(nums[0] - avg);//math.abs convert negative number to positive and find the first diff to compare all

        for (int i = 1; i < nums.length; i++) {//start with first elemt to compare close

            double diff = Math.abs(nums[i] - avg);

            if (diff < minDiff) {
                minDiff = diff;
                close = nums[i];
            }
        }

        return close;
    }

    public static void main(String[] args) {

        int[] nums = {70, 85, 90, 25, 31, 78, 3};

        int result = ClosestToAverage(nums);

        System.out.println(" element: " + result);
    }
}
