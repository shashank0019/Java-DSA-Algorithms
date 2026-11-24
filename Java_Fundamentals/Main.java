package Basicjavaandsomearrayconcept;
// public class Main{
//     public static void main(String[] args){

//         int[] arr={10,20,30,40,50};
//         int sum=0;

//         for(int i=0; i<arr.length;i++){
//             sum=sum+arr[i];

//         }

//         System.out.println("sum="+sum);
//     }
// }


// public class Main {

//     static int findSum(int[] arr) {

//         int sum = 0;

//         for (int i = 0; i < arr.length; i++) {
//             sum = sum + arr[i];
//         }

//         return sum;
//     }

//     public static void main(String[] args) {

//         int[] arr = {10, 20, 30, 40, 50};

//         int result = findSum(arr);

//         System.out.println("sum = " + result);
//     }
// }

//program for finding max element in array
// public class Main{
//     public static void main(String[] args){

//         int[] arr={10,20,30,80,50};
//         int max=arr[0];

//         for(int i=0; i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }

//         }

//         System.out.println("max="+max);
//     }
// }

//finding the minimum
public class Main{
    public static void main(String[] args){

        int[] arr={10,20,5,30,80,50};
        int min=arr[0];

        for(int i=0; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }

        System.out.println("min="+min);
    }
}