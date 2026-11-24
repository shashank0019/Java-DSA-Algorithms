//find the doicount of 10 per
public class Fifteen
 {
    public static int DicountOfPrice(int[]nums)
    {
        int sum =0;
        int price =0;
        

        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
        }

        int dicount = (sum*10)/100;
        price = sum -dicount;

    return price;

    }
    public static void main(String[] args) {
        int[] nums ={10,3,7,34,9,13,56};
        int[] nums1 = {400,350,450};
        int[] nums2 = {1, 3, 5, 7};
        int[] nums3 = {0, -3, 5, -1, 2};
        int[] nums4 = {9, 1};
        int[] nums5 = {7};
        int[] nums6 = {};
        int[] nums7 = null;
        int result = DicountOfPrice(nums1);
        System.out.println("the RESULT is " + result);

        
    }
    
}
