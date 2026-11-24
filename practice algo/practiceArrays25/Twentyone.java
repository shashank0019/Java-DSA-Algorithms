
 //comapre score at each position return the new array where score is greater
 import java.util.*;

public class Twentyone{

    

    public static int [] ScoreWhereIsGreaterr(int[] a , int[]b) {

        if(a==null ||a.length==0){
            return null;
        }
        int[] temp = new int[a.length];
       int index=0;
        
        int i =0;
        while(i<a.length){
            int j =0;
            while(j<b.length){
                if(a[i]>b[j]){
                    temp[index]=a[i];
                }else{
                    temp[index]=b[j];
                }
                index++;
                
                i++;
                j++;

            }

        }
        return temp;
        

        
    }

    public static void main(String[] args) {
        int a[] ={78,65,90,65,82};
        int[]b = {70,80,85,60,82};

        
        int[]result = ScoreWhereIsGreaterr(a,b);
        System.out.println("the result is ") ;
        for(int i =0;i<result.length;i++){
        
        System.out.print(result[i]+" ") ;

        
    }
} 
}
    

