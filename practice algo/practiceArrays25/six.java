//sum of elmets at index position 0,2,4 and so on
public class six {

    public static int SumOfAtIndexEvenElements(int[] nums)
    {
        int sum =0;
        for(int read =0;read<nums.length;read++){
            if(nums[read]%2==0){ //condition check
                sum+=nums[read];//update
            }else{
                continue;
            }
        }
        return sum;//return int because we declared int 

    }
    public static void main(String[] args) {

        int[] nums ={10,3,7,34,9,13,56};
        int[] nums1 = {2, 4, 6, 8};
        int[] nums2 = {1, 3, 5, 7};
        int[] nums3 = {0, -3, 5, -1, 2};
        int[] nums4 = {9, 1};
        int[] nums5 = {7};
        int[] nums6 = {};
        int[] nums7 = null;
        int result = SumOfAtIndexEvenElements(nums);
        System.out.println("the RESULT is " + result);

        
    }
    
    
}
