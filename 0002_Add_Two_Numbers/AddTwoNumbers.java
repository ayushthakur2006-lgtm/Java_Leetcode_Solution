class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

class Solution_2 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode Curr=l1;
        ListNode Curr_=l2;
        ListNode answer=new ListNode(0);
        ListNode Current=answer;
        int temp=0;
        int carry=0;
        int vary=0;
        while(Curr!=null && Curr_!=null)
            
            { 
                temp=Curr.val+Curr_.val+carry;
                if (temp>=10)
                    {
                        vary=temp;
                        Current.next=new ListNode(vary%10);
                        Current=Current.next;
                        carry=(vary-(vary%10))/10;
                    }
                else
                    {
                        Current.next=new ListNode(temp);
                        Current=Current.next;
                        carry=0;
                        
                    }
                    
                Curr=Curr.next;
                Curr_=Curr_.next;
            }
            
            
        
        
        
        if (Curr==null && Curr_!=null)
            {
                 
                while (Curr_!=null) 

                    {
                        temp=Curr_.val;
                        if((temp+carry)>=10)
                            {
                                vary=temp+carry;
                                Current.next=new ListNode(vary%10);
                                Current=Current.next;
                                carry=(vary-(vary%10))/10;
                                
                            }
                        else
                            {
                                Current.next=new ListNode((temp+carry));
                                Current=Current.next;
                            }
                        Curr_=Curr_.next;
                    }
                    if (carry>0)
                        {
                            Current.next=new ListNode(carry); 
                            Current=Current.next;
                        }

            }
        else if (Curr_==null && Curr!=null)
            {
                 while (Curr!=null) 

                    {
                        temp=Curr.val;
                        if((temp+carry)>=10)
                            {
                                vary=temp+carry;
                                Current.next=new ListNode(vary%10);
                                Current=Current.next;
                                carry=(vary-(vary%10))/10;
                                
                            }
                        else
                            {
                                Current.next=new ListNode((temp+carry));
                                Current=Current.next;
                            }
                        Curr=Curr.next;
                    }
                    if (carry>0)
                        {
                            Current.next=new ListNode(carry); 
                            Current=Current.next;
                        }   
        
            }
        else 
            {
                if (carry>0)
                        {
                            Current.next=new ListNode(carry); 
                            Current=Current.next;
                        }
            }
        

        
        return answer.next;
    }
}
