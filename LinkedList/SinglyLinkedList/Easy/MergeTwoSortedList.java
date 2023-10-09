

/*

21. Merge Two Sorted Lists
        Easy
        20.2K
        1.9K
        Companies
        You are given the heads of two sorted linked lists list1 and list2.

        Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

        Return the head of the merged linked list.

        Example 1:
        Input: list1 = [1,2,4], list2 = [1,3,4]
        Output: [1,1,2,3,4,4]

        Example 2:
        Input: list1 = [], list2 = []
        Output: [].

        Example 3:
        Input: list1 = [], list2 = [0]
        Output: [0].


 */




package LinkedList.SinglyLinkedList.Easy;


class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
        next = null;
    }
}

class MergeSortedList {

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

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1==null && list2!=null){
            return list2;
        }

        else if(list2==null && list1!=null){
            return list1;
        }

        else if(list1==null && list2==null){
            return null;
        }

        ListNode node = null;
        ListNode ptr = node;

        while(list1!=null && list2!=null){

            if(ptr==null && list1.val <= list2.val){
                ListNode newNode = new ListNode(list1.val);
                node = newNode;
                ptr = newNode;
                newNode.next = null;
                list1 = list1.next;
            }

            else if(ptr == null && list2.val<=list1.val){
                ListNode newNode  = new ListNode(list2.val);
                node = newNode;
                ptr = newNode;
                newNode.next = null;
                list2 = list2.next;
            }

            else if(list1.val <= list2.val){

                ListNode newNode = new ListNode(list1.val);
                ptr.next = newNode;
                ptr = newNode;
                newNode.next = null;
                list1 = list1.next;
            }

            else{
                ListNode newNode = new ListNode(list2.val);
                ptr.next = newNode;
                ptr = newNode;
                newNode.next = null;
                list2 = list2.next;
            }
        }

        while(list1!=null){
            ListNode newNode = new ListNode(list1.val);
            ptr.next = newNode;
            ptr = newNode;
            newNode.next = null;
            list1 = list1.next;
        }

        while(list2!=null){
            ListNode newNode = new ListNode(list2.val);
            ptr.next = newNode;
            ptr = newNode;
            newNode.next = null;
            list2 = list2.next;
        }

        return node;
    }

   
    public static void main(String[] args) {

        ListNode head1 = null;

        head1 = insert(head1, 1);
        head1 = insert(head1, 2);
        head1 = insert(head1, 4);

        ListNode head2 = null;

        head2 = insert(head2, 1);
        head2 = insert(head2, 3);
        head2 = insert(head2, 4);

        ListNode head = mergeTwoLists(head1, head2);
        display(head);

    }
}

