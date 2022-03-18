package Problem;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LeetCode_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = addCarry(l1.val, l2.val);
        ListNode rListNode = new ListNode((l1.val + l2.val) % 10);
        ListNode iListNode = rListNode;

        for (; l1.next != null && l2.next != null; iListNode = iListNode.next) {
            l1 = l1.next;
            l2 = l2.next;

            iListNode.next = new ListNode((l1.val + l2.val + carry) % 10);

            carry = addCarry(l1.val, l2.val + carry);
        }

        if (l1.next == null && l2.next == null) {
            if (carry == 1) {
                iListNode.next = new ListNode(1);
                return rListNode;
            }
        }

        ListNode restListNode = (l1.next == null) ? l2 : l1;
        for (; restListNode.next != null; iListNode = iListNode.next) {
            restListNode = restListNode.next;

            iListNode.next = new ListNode((restListNode.val + carry) % 10);
            carry = addCarry(restListNode.val, carry);
        }

        if (carry == 1) {
            iListNode.next = new ListNode(1);
        }

        return rListNode;

    }

    int addCarry(int val1, int val2) {
        return val1 + val2 >= 10 ? 1 : 0;
    }
}
