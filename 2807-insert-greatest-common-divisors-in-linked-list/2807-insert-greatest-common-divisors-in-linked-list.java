class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            int first = curr.val;
            int second = curr.next.val;
            while (second != 0) {
                int temp = second;
                second = first % second;
                first = temp;
            }
            ListNode newnode = new ListNode(first);
            newnode.next = curr.next;
            curr.next = newnode;
            curr = newnode.next;
        }
        return head;
    }
}