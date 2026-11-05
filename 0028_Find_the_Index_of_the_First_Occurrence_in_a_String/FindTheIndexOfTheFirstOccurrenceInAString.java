class Solution_28
{
    public int strStr(String haystack, String needle) 
    {   
        int result=0;
        if (haystack.contains(needle)) 
            {
                result=haystack.indexOf(needle);
            } 
        else
            {
                result=-1;
            } 
        return result;  
    }
}
