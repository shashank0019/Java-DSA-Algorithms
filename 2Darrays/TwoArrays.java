import java.util.*;
public class TwoArrays
{
    public static void TwoD(int[][]nums)
    {
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
    //print address of matrix

    public static void Address(int[][]nums){
        System.out.println("Array Add");
        System.out.println(nums);

    }

    //print rows adresss
    public static void RowAdress(int[][]nums)
    {
        System.out.println("Row Add");
        for(int i =0;i<nums.length;i++){
            
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    //print column address
    public static void ColumnAddress(int[][]nums)
    {
         System.out.println("Column Add");
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums[i].length;j++){
                
                System.out.print(nums[j]+" ");
            }
            System.out.println();
        }
    }

    //PRINT row count

    public static void PrintRowCount(int[][]nums)
    {
        System.out.println(nums.length);
    }
    
    //print column coiunt
    public static void PrintColumnCount(int[][]nums)
    {
        System.out.println(nums[0].length);
    }
    //first row

    public static void FirstRow(int[][]nums)
    {   System.out.println("First row");
        for(int i =0;i<=0;i++){
            for(int j =0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
    //last row
    public static void LastRow(int[][]nums)
    {   System.out.println("Last row");
        for(int i =nums.length-1;i>=nums.length-1;i--){
            for(int j =0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
    //first column
    public static void FirstColumn(int[][]nums)
    {   System.out.println("First column");
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<=0;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
    //last column
    public static void LastColumn(int[][]nums)
    {   System.out.println("Last column ");
        for(int i =0;i<nums.length;i++){
            for(int j =nums.length-1;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }

    //main diagonal
    public static void LeftDiagonal(int[][]nums)
    {   System.out.println("LEFT Diagonal ");
        for(int i =0;i<nums.length;i++){
            for(int j =i;j<=i;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }

    //main diagonal sec program
    public static void printMainDiagonal(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                if(i == j)
                {
                    System.out.print(arr[i][j] + " ");
                }
                else
                {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    //sec diagonal
    
    public static void printSecondaryDiagonal(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length ; j++)
            {
                if(i + j == arr[i].length-1)
                {
                    System.out.print(arr[i][j] + " ");
                }else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int [][] nums={{1,2,3},{4,5,6},{7,8,9}};
        TwoD(nums);
        Address(nums);
        RowAdress(nums);
        ColumnAddress(nums);
        PrintRowCount(nums);
        PrintColumnCount(nums);
        FirstRow(nums);
        LastRow(nums);
        FirstColumn(nums);
        LastColumn(nums);
        LeftDiagonal(nums);
        printMainDiagonal(nums);
        printSecondaryDiagonal(nums);

    }
}