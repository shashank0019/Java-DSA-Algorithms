
public class Binarysearch 
{

    /*Binary Search works only on a sorted array. Calculate mid = left + (right - left) / 2 and compare it with the key.
     if equal → Found; if key is greater → left = mid + 1; if smaller → right = mid - 1.
      Repeat while left <= right. Time Complexity: O(log n). */
    public void search(int[] num,int key)
    {
        if(num==null ||num.length==0)
        {
            System.out.println("Array is null or empty");
        }

        
        int leftind=0;
        int rightind=num.length-1;

        while(leftind<=rightind)
        {
            int mid=leftind+(rightind-leftind)/2;

            if(num[mid]==key)
            {
                System.out.println(mid);
            }

            if(key>num[mid])
            {
                leftind=mid+1;
            }
            else
            {
                rightind=mid-1;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] numbers={10,20,30,40,50};

        Binarysearch arr=new Binarysearch();

        arr.search(numbers, 50);
    }
    
}
