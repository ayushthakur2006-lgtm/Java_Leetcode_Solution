class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution_24
{
    public ListNode swapPairs(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode first = head;
        ListNode second = head.next;

        first.next = second.next;
        second.next = first;
        head = second;

        ListNode last = first;

        while(last.next != null && last.next.next != null)
        {
            first = last.next;
            second = first.next;

            first.next = second.next;
            second.next = first;
            last.next = second;

            last = first;
        }

        return head;
    }
}
