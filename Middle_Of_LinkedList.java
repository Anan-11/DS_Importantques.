
//https://leetcode.com/problems/middle-of-the-linked-list/submissions/
// this is a better solution where we have to traverse only once
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
