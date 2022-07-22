class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(checkLength(head,k))
        {
            return head;
        }
        ListNode cur = head;
        ListNode next = null;
        ListNode prev = null;
        int count =0;
        
        while(count<k && cur!=null)
        {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            count++;
        }
        
        if(next!=null)
        {
            head.next = reverseKGroup(next,k);
        }
        
        return prev;
    }
    
    public boolean checkLength(ListNode head,int k){
    ListNode start = head;
    int size = 0;
    while(start!=null){
        start = start.next;
        size++;
    }
    return size<k;
}
}
