class Solution_41 
{
    public int firstMissingPositive(int[] nums) 
    {
        int i = 0;

        while(i < nums.length)
        {
            if(nums[i] <= 0)
                {
                    i++;
                }
            else if(nums[i] > nums.length)
                {
                    i++;
                }
            else if(i == nums[i] - 1)
                {
                    i++;
                }
            else if(nums[nums[i] - 1] == nums[i])
                {
                    i++;
                }
            else
                {
                    int index = nums[i] - 1;

                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                }
        }

        for(int j = 0; j < nums.length; j++)
        {
            if(nums[j] != j + 1)
                {
                    return j + 1;
                }
        }

        return nums.length + 1;
    }
}
