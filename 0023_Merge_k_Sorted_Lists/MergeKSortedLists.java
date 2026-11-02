import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution_23 
{
    public ListNode mergeKLists(ListNode[] lists) 
    {
        if(lists.length==0) return null;

        List<Integer> temp=new ArrayList<>();
        
        for(int i=0;i<lists.length;i++)
            {
                ListNode curr=lists[i];
                while(curr!=null)
                    {
                        temp.add(curr.val);
                        curr=curr.next;
                    }
            }

        int[] copy=new int[temp.size()];

        for(int j=0;j<copy.length;j++)
            {
                copy[j]=temp.get(j);
            }

        ListNode answer=new ListNode(0);
        ListNode Current=answer;

        Arrays.sort(copy);

        for(int k=0;k<copy.length;k++)
            {
                Current.next=new ListNode(copy[k]);
                Current=Current.next;
            }

        return answer.next;
        
    }
}
