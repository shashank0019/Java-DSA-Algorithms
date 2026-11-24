import java.util.Arrays;

public class TwoDLevel2 {

    public int TwoSum(int[][]nums)
    {
        int sum=0;
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums[i].length;j++){
               sum +=nums[i][j];
            }
            System.out.println();
        }
        return sum;
    }

    //max element
    public static int[] getMax(int[][]nums)
    {
        int min =nums[0][0];
        int max=nums[0][0];
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums[i].length;j++){
               if(nums[i][j]>max){
                max= nums[i][j];
               }
               if(nums[i][j]<min){
                min =nums[i][j];
               }
            }
            System.out.println();
        }
        return new int[]{max,min};
    }
    //oddeven count

    public  static int[] EvenOddCount(int[][]nums)
    {
        int evenCount =0;
        int oddCount =0;
        for(int i =0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                if(nums[i][j]%2==0)
                {
                    evenCount++;
                }else{
                    oddCount++;
                }


            }
        }
        return new int[]{evenCount,oddCount};
    }

    //search element

    public static boolean isKeyPresent(int[][]nums,int key)
    {  boolean b =false;
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums[i].length;j++){

                if(nums[i][j]==key){
                    System.out.println("the element founr" +" "+i+","+j);
                    b = true;
                }
           
                
           }
    }
    return b;
    }
    //main daigonal sum
    public static int MainDiagonal(int[][]nums)
    {
        int sum =0;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                if(i == j)
                {
                    sum+=nums[i][j];
                }
                
                
            }
           
        }
        return sum;
    }

    public static int main2Diagoinal(int[][]nums)
    {
        int sunm =0;

        for(int i =0;i<nums.length;i++)
        {
            sunm+=nums[i][i];
        }
        return sunm;
    }

    //sec diagonal sum

    public static int SecDiagonal(int[][]nums)
    {
        int sum =0;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                if(i+j==nums[i].length-1)
                {
                    sum+=nums[i][j];
                }
                
            }
           
        }
        return sum;
    }


    //REVERSE

   public static int[][] ReverseRow(int[][] nums) {
    System.out.println("the reverse function");

    for (int i = 0; i < nums.length; i++) {

        int left = 0;
        int right = nums[i].length - 1;
        

        while (left < right) {

            int temp = nums[i][left];
            nums[i][left] = nums[i][right];
            nums[i][right] = temp;

            left++;
            right--;
        }
    }

    return nums;
}
    public static void ReverseRowagain(int[][] nums) {
        System.out.println("the reverse function again");

    for (int i = 0; i < nums.length; i++) {

        for (int j = nums[i].length - 1; j >= 0; j--) {

            System.out.print(nums[i][j] + " ");
        }

        System.out.println();
    }
}

    //row sum

    public static int[] RowsumEle(int[][]nums)
    {
        int [] temp = new int[nums.length];
        for(int i =0;i<nums.length ;i++)
        {
        int sum =0;
        for(int j =0;j<nums[i].length;j++){
            sum+=nums[i][j];
        }
        temp[i] =sum;
    }
    return temp;

    }
    //column sum

    public static int[] ColumnsumEle(int[][] nums) {

    int[] temp = new int[nums[0].length];

    for (int j = 0; j < nums[0].length; j++) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i][j];
        }

        temp[j] = sum;
    }

    return temp;
}

    public static void main(String[] args) {
        int [][] nums={{3,5,9},{7,6,2},{4,8,1}};
        TwoDLevel2 obj = new TwoDLevel2();
        //sum
        int result = obj.TwoSum(nums);
        System.out.println("The sum is" + result);

       int [] re = getMax(nums);
        System.out.println("The Max is " +" " +Arrays.toString(re));

        int[] one = EvenOddCount(nums);
        System.out.println("THE count is"+" "+Arrays.toString(one));

        boolean e = isKeyPresent(nums, 8);
        System.out.println("THE found is"+" "+(e));

        int mainsum =MainDiagonal(nums);
        System.out.println("the main diagonal sum is"+mainsum);

        int main2sum =MainDiagonal(nums);
        System.out.println("the main SEC diagonal sum is"+main2sum);

        int secsum =SecDiagonal(nums);
        System.out.println("the sec diagonal sum is"+secsum);

        int [][]rev = ReverseRow(nums);
        for (int i = 0; i < rev.length; i++) {
            for (int j = 0; j < rev[i].length; j++) {
                System.out.print(rev[i][j] + " ");
            }
            System.out.println();
        }

        ReverseRowagain(nums);
        int [] rowsum =RowsumEle(nums);
        for(int i =0;i<rowsum.length;i++){
            System.out.println("the row sum is" +" "+rowsum[i]);
        }

         int [] colsum =ColumnsumEle(nums);
        for(int i =0;i<colsum.length;i++){
            System.out.println("the col sum is" +" "+colsum[i]);





    
}}
}

