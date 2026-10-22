
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution_2816 
{
    private ListNode reverse(ListNode l)
    {
        ListNode prev = null;
        ListNode curr = l;

        while(curr != null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public ListNode doubleIt(ListNode head) 
    {
        ListNode tempListNode=reverse(head);

        int carry=0;
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;

        while(tempListNode!=null)
            {
                int value=carry + (tempListNode.val*2);

                carry=value/10;

                curr.next=new ListNode(value%10);
                curr=curr.next;

                tempListNode=tempListNode.next;
            }

        while(carry!=0)
            {
                curr.next=new ListNode(carry%10);
                curr=curr.next;
                carry=carry/10;
            }

        return reverse(dummy.next);
    }
}