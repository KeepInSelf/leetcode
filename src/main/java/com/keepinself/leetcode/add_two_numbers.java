package com.keepinself.leetcode;

public class add_two_numbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        listNode2.next= new ListNode(3);
        l1.next = listNode2;
        ListNode l2 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        listNode5.next= new ListNode(4);
        l2.next = listNode5;
        ListNode solution = solution(l1, l2);
        System.out.println(solution);
    }

    private static ListNode solution(ListNode l1,ListNode l2){
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int add = 0;
        while (l1!=null||l2!=null){
            int val1 = null!=l1?l1.val:0;
            int val2 = null!=l2?l2.val:0;
            int sum = add + val1 + val2;
            add = sum / 10;
            int val = sum %  10;
            temp.next = new ListNode(val);
            temp = temp.next;
            l1 = null!=l1?l1.next:null;
            l2 = null!=l2?l2.next:null;
        }

        if(add>0){
            temp.next = new ListNode(add);
        }
        return result.next;
    }

}

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }

}