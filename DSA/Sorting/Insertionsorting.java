class Insertionsorting{
    
    public void insertionSort(int[] nums) {

        for (int i = 1; i < nums.length; i++) {

            int key = nums[i];

            int j = i - 1;

            while (j >= 0 && key < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = key;
        }
    
}
    public static void main(String[] args) {
        int[] nums = {5,3,8,1, 2};
        int[] nums1 = {5, 3, 8, 1, 2};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = {5, 4, 3, 2, 1};
        int[] nums4 = {4, 4, 2, 2, 1};
        int[] nums5 = {0, -3, 5, -1, 2};
        int[] nums6 = {9, 1};
        int[] nums7 = {7};
        int[] nums8 = {};
        int[] nums9 = null;
        int[] nums10 = {Integer.MAX_VALUE, 0, Integer.MIN_VALUE}; 
        Selectionsorting b = new Selectionsorting();
        b.Selctionss(nums);
        for(int num :nums){
            System.out.println(num+ " ");
        
    }
        
    }
}