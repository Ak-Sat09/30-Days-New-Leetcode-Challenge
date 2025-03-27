 class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode curr = head;
        while(curr != null){
            len++;
            curr = curr.next;
        }
        int m = len-n;
        if(m==0)return head.next;
        curr = head;
        for(int i=0; i<m-1; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}