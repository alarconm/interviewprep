package com.company;

public class RemoveKFromList {
    // Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
    ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {

        if (l == null) {
            return l;
        }

        ListNode<Integer> tempHead = new ListNode<>(0);
        tempHead.next = l;
        ListNode<Integer> temp = tempHead;

        while (temp.next != null) {

            if (temp.next.value == k) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return tempHead.next;
    }
}
