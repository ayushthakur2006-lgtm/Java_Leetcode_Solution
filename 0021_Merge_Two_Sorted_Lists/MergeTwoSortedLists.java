import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListNode 
{
      int val;
    ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 

class Solution_21
{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode L1=list1;
        ListNode L2=list2;
        List<Integer> temp=new ArrayList<Integer>();
        while (L1!=null || L2!=null ) 
            {
                int var_1  = (L1 != null) ? L1.val: 0;
                int var_2  = (L2 != null) ? L2.val : 0;

                if (L1==null)
                    {
                        temp.add(var_2);
                        L2=L2.next;
                    }
                else if(L2==null)
                    {
                        temp.add(var_1);
                        L1=L1.next;
                    }
                else
                    {
                        temp.add(var_1);
                        temp.add(var_2);
                        L1=L1.next;
                        L2=L2.next;
                    }
                

            }
        ListNode answer=new ListNode(0);
        ListNode current =answer;
        int ans[]=new int[temp.size()];
        for(int i=0;i<temp.size();i++)
            {
                ans[i]=temp.get(i);
            }
        Arrays.sort(ans);
       for(int j=0;j<temp.size();j++)
        {
            current.next=new ListNode(ans[j]);
            current=current.next;

        } 
        
        return answer.next;
    }
}
