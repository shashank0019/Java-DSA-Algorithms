
 //bying at shp a and shop what profit we get
 import java.util.*;

public class TwentyThree{

    

    public static int ProfitOfShopAandB(int[] a , int[]b) {

        if(a==null ||a.length==0){
            return 0;
        }

        int profit =0;
        int i =0;
        while(i<a.length){
            int j =0;
            while(j<b.length){
                if(a[i]>b[j]){
                    profit +=a[i]-b[j];
                }
                i++;
                j++;

            }

        }
        return profit;
        

        
    }

    public static void main(String[] args) {
        int a[] ={100,250,80,40};
        int[]b = {90,260,70,45};

        
        int result = ProfitOfShopAandB(a,b);
        System.out.println("the result is " + result) ;

        
    }
} 
    

