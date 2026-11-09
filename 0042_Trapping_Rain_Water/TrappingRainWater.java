class Solution_42 
{
    public int trap(int[] height) 
    {
        int[] leftmax=new int[height.length];
        int max=-1;

        int i=0;
        for(int elem:height)
            {
                max=Math.max(max, elem);
                leftmax[i]=max;
                i++;
            }

        max=-1;
        int[] rightmax=new int[height.length];
        
        for(int j=height.length-1;j>=0;j--)
            {
                max=Math.max(max, height[j]);
                rightmax[j]=max;
            }

        int count=0;
        for(int k=0;k<height.length;k++)
            {
                int req=Math.min(rightmax[k], leftmax[k])-height[k];
                if(req>0)
                    {
                        count=count+req;
                    }
            }

        return count;
    }
}
