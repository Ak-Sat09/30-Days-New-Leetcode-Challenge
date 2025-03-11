 class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Compare values and merge recursively
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1; // Return the merged list starting from list1
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2; // Return the merged list starting from list2
        }
    }
}
