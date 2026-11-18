class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution_83 
{
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode firstPointer=head;
        ListNode secondPointer=head;

        if (head==null)
            {
                return head;
            }
        while(secondPointer!=null)
            {
                if(firstPointer.val==secondPointer.val)
                    {
                        secondPointer=secondPointer.next;
                    }
                else
                    {
                        firstPointer.next=secondPointer;
                        
                        firstPointer=firstPointer.next;
                        secondPointer=secondPointer.next;
                    }
            }
        firstPointer.next = null;
        return head;
        
    }
}
