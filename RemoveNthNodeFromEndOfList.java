package leetcodeProblems;

public class RemoveNthNodeFromEndOfList {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int length = findLength(head);
        int i = 0, traverseTill = length - n - 1;
        if (traverseTill == -1) return head.next;
        ListNode curr = head;
        while (i < traverseTill) {
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
        return head;
    }

    public static int findLength(ListNode head) {
        int count = 0;
        if (head == null) return count;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

}
