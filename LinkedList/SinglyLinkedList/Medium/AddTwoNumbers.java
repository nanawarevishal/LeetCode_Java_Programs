

/*

2. Add Two Numbers
        Medium
        28.6K
        5.5K
        Companies
        You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

        You may assume the two numbers do not contain any leading zero, except the number 0 itself.

        

        Example 1:
        Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807.

        Example 2:
        Input: l1 = [0], l2 = [0]
        Output: [0].

        Example 3:
        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        Output: [8,9,9,9,0,0,0,1].


 */




package LinkedList.SinglyLinkedList.Medium;


class ListNode{
    int data;
    ListNode next;

    ListNode(int x){
        data = x;
        next = null;
    }
}

class AddTwoNumber {

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

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        String str1 = "";

        while(l1!=null){
            str1 +=l1.data;
            l1 = l1.next;
        }

        // System.out.println(str1);
        String str2 = "";

        while(l2!=null){
            str2 +=l2.data;
            l2 = l2.next;
        }

        if(str1.length()>str2.length()){
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        int carry = 0;
        String str = "";
        for(int i=0;i<str1.length();i++){
            int sum = str1.charAt(i)-48 + str2.charAt(i)-48+carry;

            str +=sum%10;

            carry = sum /10;
        }

        for(int i=str1.length();i<str2.length();i++){

            int sum = str2.charAt(i)-48+carry;

            str +=sum%10;
            carry = sum /10;
        }

        if(carry>0){
            str +=carry;
        }

        System.out.println(str);
        ListNode head = null;
        ListNode ptr = head;

        for(int i=0;i<str.length();i++){

            ListNode newNode = new ListNode(str.charAt(i)-48);

            if(head == null){
                head = newNode;
                ptr = newNode;
                newNode.next = null;
            }

            else{

                ptr.next = newNode;
                ptr = newNode;
                newNode.next = null;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        ListNode head1 = null;

        head1 = insert(head1, 2);
        head1 = insert(head1, 4);
        head1 = insert(head1, 3);

        ListNode head2 = null;

        head2 = insert(head2, 5);
        head2 = insert(head2, 6);
        head2 = insert(head2, 4);


        ListNode ln = addTwoNumbers(head1, head2);

        display(ln);
    }
}

