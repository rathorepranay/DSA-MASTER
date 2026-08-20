class Solution {
    public ListNode sortList(ListNode head) {

        // Stop when 0 or 1 node
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        // Find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split the list
        ListNode second = slow.next;
        slow.next = null;

        // Recursively sort both halves
        ListNode left = sortList(head);
        ListNode right = sortList(second);

        // Merge
        return merge(left, right);
    }

    public ListNode merge(ListNode left, ListNode right) {

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (left != null && right != null) {

            if (left.val <= right.val) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }

            curr = curr.next;
        }

        if (left != null) {
            curr.next = left;
        } else {
            curr.next = right;
        }

        return dummy.next;
    }
}