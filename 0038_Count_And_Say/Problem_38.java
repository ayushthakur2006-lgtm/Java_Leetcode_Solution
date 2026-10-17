class Solution_38 
{
    public String countAndSay(int n) 
    {
        if(n==1)
            {
                return "1";
            }
        
        String prev=countAndSay(n-1);

        StringBuilder sb=new StringBuilder();
        int count=0;
        int first=0;
        int second=0;
        while(second<prev.length())
            {
                if(prev.charAt(first)==prev.charAt(second))
                    {
                        second++;
                        count++;
                    }
                else
                    {
                        first=second;
                        sb.append(count);
                        sb.append(prev.charAt(first-1));
                        count=0;
                    }
                
            }

        sb.append(count);
        sb.append(prev.charAt(second-1));
            
        return sb.toString();
        
    }

    
}