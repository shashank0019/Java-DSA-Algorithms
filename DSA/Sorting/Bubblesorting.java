class Bubblesorting{
    /*Bubble Sort compares adjacent elements and swaps them if the left element is greater than the right element. After each pass, the largest unsorted element moves to the end.
Use two loops: outer loop for passes and inner loop for comparing adjacent elements (j < n-1-i).
Time Complexity: O(n²). Space Complexity: O(1). */

    public void Bubbless(int[] nums)
    {

        if(nums== null || nums.length ==0){
            System.out.println("Array is empty");//check if array is empty or not

        }
       
        for(int i =0;i<nums.length;i++){  //one to comapre all
            for(int j =0;j<nums.length-1-i;j++){ //for compare adjacent elemts
                //here length-1-i because last element is sorted every i loop we dont need to compare

            if(nums[j+1]<nums[j]){ //if right elemt is smaller than left swap 
                int temp = nums[j]; //swap
                nums[j]= nums[j+1];
                nums[j+1]=temp;
            
            }
        }
    }
    
}
//it is sorted like from descending,for i=0 first last element sorted process continues
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
        Bubblesorting b = new Bubblesorting();
        b.Bubbless(nums);
        for(int num :nums){
            System.out.println(num+ " ");
        }

        
    }
}