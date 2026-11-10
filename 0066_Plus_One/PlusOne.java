class Solution_66 
{
    public int[] plusOne(int[] digits) 
    {
       int arr[]=new int[digits.length+1];
       for(int i=1;i<arr.length;i++)
        {
            arr[i]=digits[i-1];
        }
        int carry=1;
        int pointer=0;
        for(pointer=arr.length-1;pointer>=0;pointer--)
            {
                if(arr[pointer]+carry==10)
                    {
                        carry=1;
                        arr[pointer]=0;
                    }
                else if(carry==0)
                    {
                        break;
                    }
                else
                    {
                        arr[pointer]=arr[pointer]+1;
                        carry=0;
                    }
            }
        
        if (arr[0]==0)
            {
                 for(int i=1;i<digits.length+1;i++)
                    {
                        digits[i-1]=arr[i];
                    }
                
                return digits;
                
            }
        
        
        return arr;
            

    }
}


