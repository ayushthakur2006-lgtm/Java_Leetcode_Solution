class Solution_35 
{
    public int searchInsert(int[] nums, int target) 
    {
        int left=0;
        int right=nums.length-1;
        int mean=0;
        
        while(left<=right)
            {
                mean=(left+right)/2;

                if(nums[mean]==target)
                    {
                        return mean;
                    }
                else if(nums[mean]>target)
                    {
                        right=mean-1;
                    }
                else
                    {
                        left=mean+1;
                    }
            }

        return left;
    }   

}
