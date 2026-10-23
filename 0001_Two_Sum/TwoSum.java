import java.util.ArrayList;
import java.util.List;

class Solution_1 {
    public int[] twoSum(int nums[], int target) 
    {
        int answer[]=new int[2];
        int n=nums.length;
        List<Integer> temp1=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
            {
                temp1.add(nums[i]);
            }
        for(int j=0;j<n;j++)
            {   
                int x=target-nums[j];
                if(temp1.contains(x))
                    {
                        int y=temp1.indexOf(x);
                        if (j==y)
                            {
                                continue;
                            }
                        else
                            {
                                answer[0]=j;
                                answer[1]=y;
                                break;
                            }
                    }
            }
        
        
        return answer;

    }
}
