

/*
1019. Next Greater Node In Linked List
        Medium
        3.1K
        112
        Companies
        You are given the head of a linked list with n nodes.

        For each node in the list, find the value of the next greater node. That is, for each node, find the value of the first node that is next to it and has a strictly larger value than it.

        Return an integer array answer where answer[i] is the value of the next greater node of the ith node (1-indexed). If the ith node does not have a next greater node, set answer[i] = 0.

        

        Example 1:
        Input: head = [2,1,5]
        Output: [5,5,0].

        Example 2:
        Input: head = [2,7,4,3,5]
        Output: [7,0,5,5,0].

 */




package LinkedList.SinglyLinkedList.Medium;

import java.util.*;

class ListNode{
    int data;
    ListNode next;
    public String val;

    ListNode(int x){
        data = x;
        next = null;
    }
}

class nextGreaterElement {

    static ListNode insert(ListNode head,int data){

        ListNode node = head;
        ListNode newnode = new ListNode(data);
        if(head==null){
            head = newnode;
            newnode.next=null;
        }

        else{

            while(node.next!=null){
                node = node.next;
            }

            node.next = newnode;
            newnode.next= null;
        }
        return head;
    }

    static void display(ListNode head){
        ListNode node = head;
        if(head == null){
            System.out.println("Lineked list is empty...!");
        }

        else{
            while(node!=null){
                System.out.print(node.data+"-->");
                node = node.next;
            }
        }
    }

    static int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer>ls = new ArrayList<>();

        while(head!=null){
            ls.add(head.data);
            head = head.next;
        }

        int ans[] = new int[ls.size()];
        Stack<Integer>st = new Stack<>();   
        for(int i=ls.size()-1;i>=0;i--){

            int x = ls.get(i);
            if(st.isEmpty()){
                ans[i] = 0;
                st.push(x);
            }

            else if(st.peek()<=x){

                while(st.peek()<=x){
                    st.pop();

                    if(st.isEmpty()){
                        break;
                    }
                }

                if(st.isEmpty()){
                    ans[i] = 0;
                    st.push(x);
                }

                else{
                    ans[i] =st.peek();
                    st.push(x);
                }
            }

            else{
                ans[i] = st.peek();
                st.push(x);
            }
        }

        return ans;
    }


    public static void main(String[] args) {

        ListNode head1 = null;

        head1 = insert(head1, 2);
        head1 = insert(head1, 7);
        head1 = insert(head1, 4);
        head1 = insert(head1, 3);
        head1 = insert(head1, 5);

        int[] arr = nextLargerNodes(head1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
