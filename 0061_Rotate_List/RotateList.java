class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution_61
{
    public ListNode rotateRight(ListNode head, int k)
    {
        if (head == null || head.next == null || k == 0)
        {
            return head;
        }

        int length = 1;
        ListNode temp = head;

        while (temp.next != null)
        {
            temp = temp.next;
            length++;
        }

        k = k % length;

        if (k == 0)
        {
            return head;
        }

        int i = 0;

        while (i < k)
        {
            ListNode prev = head;
            ListNode curr = head.next;

            while (curr.next != null)
            {
                curr = curr.next;
                prev = prev.next;
            }

            curr.next = head;
            head = curr;
            prev.next = null;

            i++;
        }

        return head;
    }
}
