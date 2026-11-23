class Solution_125
{
    public boolean isPalindrome(String s) 
    {
        s=s.toLowerCase();
        s=s.strip();
        int firstPointer=0;
        int secondpointer=s.length()-1;
        int temp[]=new int[128];
        for (int j=97;j<=122;j++)
            {
                temp[j]=1;
            }
        
        for (int k=48 ;k<=57;k++)
            {
                temp[k]=1;
        
            }
        while(firstPointer<secondpointer)
            {   
                if(s.charAt(firstPointer)==s.charAt(secondpointer))
                    {
                        firstPointer++;
                        secondpointer--;
                    }
                else if(temp[s.charAt(firstPointer)]==1 && temp[s.charAt(secondpointer)]==1)
                    {
                        return false;
                    }
                else if(temp[s.charAt(firstPointer)]==0)
                    {
                        firstPointer++;
                    }
                else if(temp[s.charAt(secondpointer)]==0)
                    {
                        secondpointer--;
                    }
                

            }
        if (s.isEmpty())
            {
                return true;
            }
        return true;

    }
}
