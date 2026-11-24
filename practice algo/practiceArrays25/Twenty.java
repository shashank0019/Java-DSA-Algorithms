
 //comapre marks of two students return how many subjects shashi scored more than shre
 import java.util.*;

public class Twenty{

    

    public static int MostMarksInSub(int[] a , int[]b) {

        if(a==null ||a.length==0){
            return 0;
        }

        int count =0;
        int i =0;
        while(i<a.length){
            int j =0;
            while(j<b.length){
                if(a[i]>b[j]){
                    count++;
                }
                i++;
                j++;

            }

        }
        return count;
        

        
    }

    public static void main(String[] args) {
        int a[] ={78,65,90,65,82};
        int[]b = {70,80,85,60,82};

        
        int result = MostMarksInSub(a,b);
        System.out.println("the result is " + result) ;

        
    }
} 
    

