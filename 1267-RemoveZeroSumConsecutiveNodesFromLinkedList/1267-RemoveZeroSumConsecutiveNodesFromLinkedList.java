// Last updated: 7/9/2026, 9:47:08 AM
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        Map<Integer, ListNode> map = new HashMap<>();
        int sum = 0;

        for (ListNode cur = dummy; cur != null; cur = cur.next) {
            sum += cur.val;
            map.put(sum, cur);
        }

        sum = 0;

        for (ListNode cur = dummy; cur != null; cur = cur.next) {
            sum += cur.val;
            cur.next = map.get(sum).next;
        }

        return dummy.next;
    }
}