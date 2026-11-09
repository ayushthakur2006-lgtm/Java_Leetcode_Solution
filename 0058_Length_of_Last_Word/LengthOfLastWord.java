class Solution_58
{
    public int lengthOfLastWord(String s) 
    {
        s=s.strip();
        String parts[]=s.split("\\s+");
        s=parts[parts.length-1];
        return s.length();   
    }
}
