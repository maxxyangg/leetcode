/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode result = new ListNode();
        ListNode head = result;
        int carry = 0;
        while(l1 != null || l2 != null){
            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;
            
            int tempSum = l1_val + l2_val + carry;
            carry = tempSum / 10;
            int digit = tempSum % 10;
            
            ListNode new_node = new ListNode(digit);
            head.next = new_node;
            
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            
            head = head.next;
        }
        
        if(carry > 0){
            ListNode new_node = new ListNode(carry);
            head.next = new_node;
            head = head.next;
        }
        
        return result.next;
    }
}