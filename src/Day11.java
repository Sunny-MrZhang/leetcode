public class Day11 {

    //两数相加--每天刷一道leetcode系列！
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        int jinwei = 0;
        ListNode res = new ListNode(-1);
        ListNode tmp = res;
        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.data;
            int val2 = l2 == null ? 0 : l2.data;
            int sum = val1 + val2 + jinwei;
            res.next = new ListNode(sum % 10);
            res = res.next;
            jinwei = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (jinwei == 1) {
            res.next = new ListNode(1);
        }
        return tmp.next;
    }
}