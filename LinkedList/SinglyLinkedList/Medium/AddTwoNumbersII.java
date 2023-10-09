
/*

445. Add Two Numbers II
        Medium
        5.7K
        279
        Companies
        You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

        You may assume the two numbers do not contain any leading zero, except the number 0 itself.

        

        Example 1:
        Input: l1 = [7,2,4,3], l2 = [5,6,4]
        Output: [7,8,0,7]

        Example 2:
        Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [8,0,7]

        Example 3:
        Input: l1 = [0], l2 = [0]
        Output: [0]

 */




package LinkedList.SinglyLinkedList.Medium;

class ListNode{
    int data;
    ListNode next;
    // public String data;

    ListNode(int x){
        data = x;
        next = null;
    }
}

class addTwoNumbers {

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

   static ListNode addTwoNumber(ListNode l1, ListNode l2) {
        
        String str1 = "";
        
        while(l1!=null){
            str1 +=l1.data;
            l1 = l1.next;
        }

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

        str1 = new StringBuffer(str1).reverse().toString();
        str2 = new StringBuffer(str2).reverse().toString();

        String str = "";
        int carry = 0;
        for(int i=0;i<str1.length();i++){

            int sum = str1.charAt(i)-48 + str2.charAt(i)-48+carry;

            str +=sum%10;
            carry = sum/10;
        }

        for(int i=str1.length();i<str2.length();i++){

            int sum = str2.charAt(i)-48+carry;
            str +=sum%10;
            carry = sum/10;
        }

        if(carry>0){
            str +=carry;
        }

        str  = new StringBuffer(str).reverse().toString();
        ListNode node = null;
        ListNode ptr = node;
        for(int i=0;i<str.length();i++){

            ListNode newNode = new ListNode(str.charAt(i)-48);

            if(node==null){
                node = newNode;
                ptr = node;
                newNode.next = null;
            }

            else{

                ptr.next = newNode;
                ptr = newNode;
                newNode.next = null;
            }
        }

        return node;

    }

    public static void main(String[] args) {

        ListNode head1 = null;

        head1 = insert(head1, 7);
        head1 = insert(head1, 2);
        head1 = insert(head1, 4);
        head1 = insert(head1, 3);

        ListNode head2 = null;

        head2 = insert(head2, 5);
        head2 = insert(head2, 6);
        head2 = insert(head2, 4);


        ListNode ln = addTwoNumber(head1, head2);

        display(ln);
    }
}
