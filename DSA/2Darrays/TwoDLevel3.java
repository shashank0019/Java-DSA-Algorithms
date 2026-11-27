public class TwoDLevel3 {

    public static int [][]printBpundaryElements(int[][]nums)
    {
        
        for(int i =0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                /*if((i>0 && i<nums.length-1)&&(j>0 && j<nums[i].length-1)){
                        System.out.print("  ");
                    continue;
                }else{
                    {
                System.out.print(nums[i][j]+" ");
                
                 } */

                if(i==0||i==nums.length-1||j==0||j==nums[i].length-1)
                {
                System.out.print(nums[i][j]+" ");
                
                 }
                else{
                   System.out.print("  ");
                }

            }
            System.out.println();
        }
        return nums;

    }

    public static int[][] CornerElemets(int[][]nums)
    {
         System.out.println("borderr elemets" );
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums[0].length;j++){
                if((i==0 &&j==0)||(i==0&&j==nums.length-1)||(i==nums.length-1 && j ==0)||i ==nums.length-1 &&j==nums.length-1)
                {
                    System.out.print(nums[i][j]+"  ");
                }
            }
            System.out.println( );
        }
        return nums;
           
    }

    public static int[][] transposeinplace(int[][]nums){
        System.out.println("the transpose in palce");
       
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums[0].length;j++){
                System.out.print(nums[j][i]+" ");
            }
            System.out.println( );
        }
        return nums;
    }

    public static int[][] transposee(int[][]nums){
        System.out.println("new matrix");
        int[][]temp = new int[nums[0].length-1][nums.length-1];
       
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums[i].length;j++){
                temp[j][i] = nums[i][j];
               
            }
            System.out.println( );
        }
        return temp;
    }


    //multiplication
    public static int[][] MultiTranspose(int[][]a,int[][]b)
    {
        int temp[][] = new int[a.length][b[0].length];
        for(int i =0;i<a.length;i++)
        {
            for(int j =0;j<b[i].length;j++)
            {
                for(int k =0;k<a[i].length;k++){
                    temp[i][j]+=a[i][k]*b[k][j];


                }
                System.out.println( );
            }
        }
        return temp;
    }

    

    public static void main(String[] args) {
        int [][]nums ={{3,5,9},{7,6,2},{4,8,1}};
        int[][] b = {{1,1,1},{1,1,1},{1,1,1}};
        int [][]rev = printBpundaryElements(nums);
        int[][] king =CornerElemets(nums);
        int [][]one= transposeinplace(nums);
       /*  int[][] kk = transposee(nums);
         for (int i = 0; i < kk.length; i++) {
            for (int j = 0; j < kk[i].length; j++) {
                System.out.print(kk[i][j] + " ");
            }
            System.out.println();*/

        int[][] multi= MultiTranspose(nums,b);
         for (int k = 0; k < multi.length; k++) {
            for (int j = 0; j < multi[k].length; j++) {
                System.out.print(multi[k][j] + " ");
            }
            System.out.println();

       
        
            
        }

        
    }
}

    

