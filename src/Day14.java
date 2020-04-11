public class Day14 {




    //两两交换链表中的节点--每天刷一道leetcode算法系列！
    public ListNode swapPairs(ListNode head) {
        while (head == null || head.next == null) {
            return head;
        }
        ListNode node = new ListNode(null);
        ListNode res = node;
        while (head != null && head.next != null) {
            node.next = head.next;
            head.next = head.next.next;
            node.next.next = head;

            node = node.next.next;
            head = head.next;

        }
        return res.next;
    }
}
