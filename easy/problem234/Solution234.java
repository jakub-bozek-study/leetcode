package easy.problem234;

import java.util.ArrayList;
import java.util.List;

public class Solution234 {

    public static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while(head != null){
            list.add(head.val);
            head = head.next;
        }

        int c = 0;
        while(c < list.size() / 2){
            if(list.get(c) != list.get(list.size() - 1 - c)) return false;
            c++;
        }

        return true;

    }

    public static void main(String[] args) {

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

}
