public class Sum {
   public int getSumOf(int[]nums,int key){
    if(nums == null && nums.length==0){
        return 0;
    }
    int sum =0;
    for(int i =0;i<nums.length;i++){
        if(nums[i]%10 ==key){
            sum+=nums[i];
        }

    }
    
    return sum;
}
    public static void main(String[] args) {

        int[] nums = {124,13,144,136};
        int key =6;
        Sum obj = new Sum();
        int result = obj.getSumOf(nums,key);
        System.out.println(result);

        
    }
    
}
//give sorted integer array with duplicate update the array in place such that