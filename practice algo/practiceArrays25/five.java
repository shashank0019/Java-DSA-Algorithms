//count of how many students passed above 35 marks

 class five {

    public static int CountHowmanyPassed(int[]nums)
    {
        if(nums==null && nums.length==0)//null check
        {
            return 0;
        }
        int count =0;
        for(int read =0;read<nums.length;read++){
            if(nums[read]>35){//condition
                count++;//incremet
            }

        }
        return count;
    }


    
        
    }//run in main.java
    
    

