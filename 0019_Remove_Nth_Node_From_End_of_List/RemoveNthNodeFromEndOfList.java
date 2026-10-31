class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution_19
{
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        int count = 0;

        ListNode temp = head;

        while(temp != null)
        {
            count++;
            temp = temp.next;
        }

        int remove = count - n + 1;

        if(head.next == null)
        {
            return null;
        }

        if(remove == 1)
        {
            return head.next;
        }

        ListNode prev = head;

        for(int i = 1; i < remove - 1; i++)
        {
            prev = prev.next;
        }

        prev.next = prev.next.next;

        return head;
    }
}
