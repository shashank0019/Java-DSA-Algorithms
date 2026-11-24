
public class Linear
{
    /*they give both key and arr if key is found in the array we return found
Linear Search checks each element one by one from the beginning until the key is found or the array ends.
If arr[i] == key → Element found at index i; otherwise, continue to the next element.
Works on sorted or unsorted arrays. Time Complexity: O(n). */

    public static void search(int[] num,int key)
    {
        boolean flag=false;
        int index=0;
        for(int i = 0;i<num.length;i++)
        {
            if(num[i]==key)
            {
                flag=true;
                index=i;
                break;
            }
        }

        if(flag)
        {
            System.out.println("Key found at: "+index);
        }
        else
        {
            System.out.println("Key not found");

        }


    }

    public static void main(String[] args)
    {
        int[] arr={10,20,30,40,50};

    

    search(arr,40);
    
}
}