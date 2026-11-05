class Solution_31 
{
    private void reverse(int[] nums,int start,int end)
    {
        int first=start;
        int second=end;

        while(first<second)
            {
                int temp=nums[first];
                nums[first]=nums[second];
                nums[second]=temp;

                first++;
                second--;
            }
    }

    public void nextPermutation(int[] nums) 
    {
        int incorrect=-1;
        
        int i=nums.length-1;
        for(;i>0;i--)
            {
                if(nums[i]>nums[i-1])
                    {
                        incorrect=nums[i-1];
                        break;
                    }
            }

        if(incorrect==-1)
            {
                reverse(nums, 0 ,nums.length-1);
            }
        else
            {
                int j=nums.length-1;
                for(;j>=0;j--)
                    {
                        if(nums[j]>incorrect)
                            {
                                break;
                            }
                    }
                
                int temp=nums[i-1];
                nums[i-1]=nums[j];
                nums[j]=temp;

                reverse(nums, i, nums.length-1);
            }
    }
}
