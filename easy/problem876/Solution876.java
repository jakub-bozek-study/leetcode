package easy.problem876;

public class Solution876 {

    // My solution on first try - beat 100% runtime, but bad result in memory used
    public static ListNode middleNode(ListNode head) {
        if(head.next == null){
            return head;
        }

        ListNode list = head;

        int count = 0;
        while(list.next != null){
            count++;
            list = list.next;
        }

        for(int i = 0; i <  (count % 2 == 0 ? count/2 : count/2 + 1)  ; i++){
            head = head.next;
        }

        return head;
    }

    // Solution based on forum post - less memory used.
    public static ListNode middleNodeBest(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }

        return slow;
    }

    public static void main(String[] args) {
        ListNode t1 = middleNode(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
        ListNode t2 = middleNode(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));

        System.out.println(t1);
        System.out.println(t2);
    }


      public static class ListNode {
          int val;
          ListNode next;
          ListNode(){}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }

          @Override
          public String toString() {
              return "ListNode{" +
                      "val=" + val +
                      ", next=" + next +
                      '}';
          }
      }
}
