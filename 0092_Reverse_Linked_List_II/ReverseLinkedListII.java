import java.util.ArrayList;
import java.util.List;

class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution_92
{
    public ListNode reverseBetween(ListNode head, int left, int right)
    {
        if (head == null || left == right)
        {
            return head;
        }

        List<Integer> list = new ArrayList<>();
        list.add(0);

        ListNode temp = head;

        while (temp != null)
        {
            list.add(temp.val);
            temp = temp.next;
        }

        ListNode answer = new ListNode(0);
        ListNode curr = answer;

        for (int i = 1; i < left; i++)
        {
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }

        for (int i = right; i >= left; i--)
        {
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }

        for (int i = right + 1; i < list.size(); i++)
        {
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }

        return answer.next;
    }
}
