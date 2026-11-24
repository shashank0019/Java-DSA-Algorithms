
import java.util.Arrays;

public class Mergesorting {

    public static void mergeSort(int[] nums, int low, int high) {

        // Base condition
        if (low >= high) {
            return;
        }

        // Find middle
        int mid = low + (high - low) / 2;

        // Divide left half
        mergeSort(nums, low, mid);

        // Divide right half
        mergeSort(nums, mid + 1, high);

        // Merge both halves
        merge(nums, low, mid, high);
    }

    public static void merge(int[] nums, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        // Compare and insert smaller elements
        while (i <= mid && j <= high) {

            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }

            k++;
        }

        // Copy remaining left elements
        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }

        // Copy remaining right elements
        while (j <= high) {
            temp[k] = nums[j];
            j++;
            k++;
        }

        // Copy sorted elements back
        for (int x = 0; x < temp.length; x++) {
            nums[low + x] = temp[x];
        }
    }

    public static void main(String[] args) {

        int[] nums = {5, 3, 8, 1, 2};

        mergeSort(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }
}
