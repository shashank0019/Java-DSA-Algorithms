class Selectionsorting{
    /*Selection Sort finds the smallest element from the unsorted portion and swaps it with the first element of that portion.
- Outer loop → Selects the current position.
- Inner loop → Finds the minimum element.
- min = i → Assume current element is minimum.
- min = j → Update minimum index.
- Swap → Place minimum element in its correct position.
Time Complexity: O(n²)

Space Complexity: O(1) */

    public void Selctionss(int[] nums)
    {
        for(int i =0;i<nums.length;i++){
            int min = i;//make its as first elemt as min
            for(int j =i+1;j<nums.length;j++){
                if(nums[j]<nums[min]){
                    min = j;
                }
                
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min]= temp;
            
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
        b.Selctionss(nums6);
        for(int num :nums6){
            System.out.println(num+ " ");
        
    }
}
}