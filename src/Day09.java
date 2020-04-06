public class Day09 {


    //删除链表的倒数第N个节点--每天刷一道leetcode算法系列！
    /*
    *  1、新建一个新链表res，并让res的next指针指向head。并新建fast和slow，他们均指向res。
       2、将fast往后移n个距离。
       3、同时移动fast和slow，直到fast.next == null为止。
       4、此时slow为倒数第n个节点的前一个节点。slow.next = slow.next.next就可以将倒数第n个节点移除。
    */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode fast = res;
        ListNode slow = res;

        while (n-- > 0){
            fast = fast.next;
        }
        //为了找到要删除的节点的前一个节点，所以此处让fast.next!=null
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        //此时slow为倒数第n个节点的前一个节点。
        slow.next = slow.next.next;
        return res.next;

    }

}
class ListNode{
    public Integer data;
    public ListNode next;

    public ListNode(Integer data) {
        this.data = data;
    }
}