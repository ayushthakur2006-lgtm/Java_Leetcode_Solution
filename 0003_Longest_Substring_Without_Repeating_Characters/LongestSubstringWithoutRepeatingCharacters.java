import java.util.Arrays;

class Solution_3 {
    public int lengthOfLongestSubstring(String s) 
    {
        int lastSeen[]=new int[128];
        Arrays.fill(lastSeen,-1);
        int left_pointer=0;
        int size=0;
        int compare=0;
        for(int right_pointer=0;right_pointer<s.length();right_pointer++)
            {
                if (lastSeen[s.charAt(right_pointer)]==-1)
                    {
                        lastSeen[s.charAt(right_pointer)]=right_pointer;
                    }
                else
                    {
                        compare=right_pointer-left_pointer;
                        if (compare>size)
                            {
                                size=compare;
                            }
                        left_pointer = Math.max(left_pointer, lastSeen[s.charAt(right_pointer)] + 1);
                        lastSeen[s.charAt(right_pointer)]=right_pointer;
                    }   
            } 
        size = Math.max(size, s.length() - left_pointer);

        
            

        return size;
    }
}
