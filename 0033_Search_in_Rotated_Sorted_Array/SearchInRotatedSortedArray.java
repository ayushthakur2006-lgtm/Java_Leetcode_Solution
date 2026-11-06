class Solution_33 
{
    private int binarysearch_1(int[] nums, int target, int temp)
    {
        int start=0;
        int end=temp;
        int mid=0;
        int answer=-1;
        while (start<=end) 
            {
                mid=start+(end - start)/2;

                if(nums[mid]==target)
                    {
                        return mid;
                    }
                else if(nums[mid]>target)
                    {
                        end=mid-1;
                    }
                else
                    {
                        start=mid+1;
                    }
            }
        return answer;

    }

    private int binarysearch_2(int[] nums, int target, int temp)
    {
        int start=temp+1;
        int end=nums.length-1;
        int mid=0;
        int answer=-1;
        while (start<=end) 
            {
                mid=start+(end - start)/2;

                if(nums[mid]==target)
                    {
                        return mid;
                    }
                else if(nums[mid]>target)
                    {
                        end=mid-1;
                    }
                else
                    {
                        start=mid+1;
                    }
            }
        return answer;

    }
    public int search(int[] nums, int target) 
    {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        int answer=-1;
        while (start<=end) 
            {
                mid=start+(end-start)/2;
                
                if(mid < end && nums[mid]>nums[mid+1])
                    {
                        answer=mid;
                        break;
                    }
                else if(mid > start && nums[mid]<nums[mid-1])
                    {
                        answer=mid-1;
                        break;
                    }
                else if(nums[mid]<=nums[start])
                    {
                        end=mid-1;
                    }
                else
                    {
                        start=mid+1;
                    }
                
            }
        if(answer==-1)
            {
                int z=binarysearch_1(nums, target, nums.length-1);
                if(z!=-1){return z;}
            }
        else{
                int x=binarysearch_1(nums, target, answer);
                int y=binarysearch_2(nums, target, answer);
                if(x>y)
                {
                    return x;
                }
                else if(y>x)
                {
                    return y;
                }
            }
       

        return -1;
        
    }
}
