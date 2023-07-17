

/*

 328. Odd Even Linked List
            Medium
            8.6K
            465
            Companies
            Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

            The first node is considered odd, and the second node is even, and so on.

            Note that the relative order inside both the even and odd groups should remain as it was in the input.

            You must solve the problem in O(1) extra space complexity and O(n) time complexity.

            

            Example 1:
            Input: head = [1,2,3,4,5]
            Output: [1,3,5,2,4]


            Example 2:
            Input: head = [2,1,3,5,6,4,7]
            Output: [2,3,6,7,1,5,4]


 */


package LinkedList.SinglyLinkedList.Medium;

public class oddEvenLinkedList {

    static ListNode oddEvenList(ListNode head) {
        ListNode node = head;
        ListNode temp = head.next;
        while(temp.next!=null){
            ListNode temp1 = temp.next;
            temp.next = temp1.next;
            head.next = temp1;
            temp1.next = temp;
        }
        return node;
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

    public static void main(String[] args) {
        ListNode head = null;
        display(head);

        head = insert(head, 10);
        head = insert(head, 20);
        head = insert(head, 30);
        head = insert(head, 40);
        head = insert(head, 50);
        head = insert(head, 60);

        System.out.println("The linked list....!");
        display(head);
        System.out.println();

        head = oddEvenList(head);
        display(head);

    }
}
