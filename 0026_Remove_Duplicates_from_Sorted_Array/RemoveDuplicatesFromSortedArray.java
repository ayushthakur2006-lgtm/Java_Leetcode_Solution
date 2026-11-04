class Solution_26 
{
    public int removeDuplicates(int[] nums) 
    {

        int firstPointer = nums[0];
        int secondPointer = 1;

        for (int i = 1; i < nums.length; i++) 
        {

            if (nums[i] != firstPointer) 
            {
                nums[secondPointer] = nums[i];
                secondPointer++;
                firstPointer = nums[i];
            }
        }

        return secondPointer;
    }
}

;
        System.out.println(sol.removeDuplicates(nums));
    }
}
