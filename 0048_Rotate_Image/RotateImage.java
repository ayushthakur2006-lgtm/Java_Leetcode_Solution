class Solution_48
{
    private void reverse(int[] nums)
    {
        int first=0;
        int second=nums.length-1;

        while(first<second)
            {
                if(nums[first]!=nums[second])
                    {
                        int temp=nums[first];
                        nums[first]=nums[second];
                        nums[second]=temp;
                    }

                first++;
                second--;
            }
    }
    public void rotate(int[][] matrix) 
    {
        for(int row=0;row<matrix.length;row++)
            {
                for(int col=0;col<matrix[0].length;col++)
                    {
                        int temp=matrix[row][col];
                        matrix[row][col]=matrix[col][row];
                        matrix[col][row]=temp;
                    }
            }
            
        for(int[] rows: matrix)
            {
                reverse(rows);
            }
            
    }
}
