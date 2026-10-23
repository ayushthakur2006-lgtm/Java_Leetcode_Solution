class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


class Solution_237
{
    public void deleteNode(ListNode node) 
    {
        ListNode curr=node;
        ListNode prev=null;

        while(curr.next!=null)
            {
                curr.val=curr.next.val;

                prev=curr;
                curr=curr.next;
            }

        prev.next=null;
    }
}