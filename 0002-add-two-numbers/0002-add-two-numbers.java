/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        String first = "";
        String second = "";

        while (curr1 != null) {
            first += curr1.val;
            curr1 = curr1.next;
        }
        while (curr2 != null) {
            second += curr2.val;
            curr2 = curr2.next;
        }

        first = new StringBuilder(first).reverse().toString();
        second = new StringBuilder(second).reverse().toString();
        BigInteger Fno = new BigInteger(first);
        BigInteger Sno = new BigInteger(second);
        BigInteger sum = Fno.add(Sno);

        String resultString = new StringBuilder(sum.toString())
                .reverse()
                .toString();
        int[] digits = resultString
                .chars()
                .map(c -> c - '0')
                .toArray();

        ListNode result = new ListNode(digits[0]);
        ListNode current = result;
        for (int i = 1; i < digits.length; i++) {
            current.next = new ListNode(digits[i]);
            current = current.next;
        }

        return result;
    }
}