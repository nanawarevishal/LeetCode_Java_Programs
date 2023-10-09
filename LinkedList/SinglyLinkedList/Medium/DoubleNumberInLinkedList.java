
/*

2816. Double a Number Represented as a Linked List
        Medium
        370
        5
        Companies
        You are given the head of a non-empty linked list representing a non-negative integer without leading zeroes.

        Return the head of the linked list after doubling it.

        
        Example 1:
        Input: head = [1,8,9]
        Output: [3,7,8]
        Explanation: The figure above corresponds to the given linked list which represents the number 189. Hence, the returned linked list represents the number 189 * 2 = 378.

        Example 2:
        Input: head = [9,9,9]
        Output: [1,9,9,8]
        Explanation: The figure above corresponds to the given linked list which represents the number 999. Hence, the returned linked list reprersents the number 999 * 2 = 1998. 


 */



package LinkedList.SinglyLinkedList.Medium;

class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
        next = null;
    }
}

class DoubleNumberLL {

    static ListNode insert(ListNode head,int val){

        ListNode node = head;
        ListNode newnode = new ListNode(val);
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
                System.out.print(node.val+"-->");
                node = node.next;
            }
        }
    }

    static ListNode doubleIt(ListNode head) {
        
        String str1 = "";

        while(head!=null){
            str1 +=head.val;
            head = head.next;
        }

        str1 = new StringBuffer(str1).reverse().toString();


        String str = "";
        int carry = 0;
        for(int i=0;i<str1.length();i++){

            int sum = str1.charAt(i)-48+str1.charAt(i)-48+carry;
            str +=sum%10;
            carry = sum/10;
        }

        if(carry>0){
            str +=carry;
        }

        str = new StringBuffer(str).reverse().toString();

        // System.out.println(str);

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

        head1 = insert(head1, 1);
        head1 = insert(head1, 8);
        head1 = insert(head1, 9);

        ListNode head = doubleIt(head1);
        display(head);
    }
}
