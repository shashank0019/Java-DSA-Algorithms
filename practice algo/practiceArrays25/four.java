//find largets and smallest and find differnce
public class four{

    public static int DiffercenceBtwLargestSmallest(int[]nums)
    {
        if(nums== null && nums.length-1==0)
        {
            return -1;
        }
        
        int largest = Integer.MIN_VALUE;//to find max start with lowest value
        int smallest = Integer.MAX_VALUE;//to find min start with large value

        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]>largest)
            {
                largest = nums[i];//update

            }
            if(nums[i]<smallest)
            {
                smallest = nums[i];//update
            }
        }
        return largest -smallest;
    }
    public static void main(String[] args) {

        int[] nums ={10,3,7,34,9,13,56};
        int result = DiffercenceBtwLargestSmallest(nums);
        System.out.println("the diff is " + result);

        
    }
}