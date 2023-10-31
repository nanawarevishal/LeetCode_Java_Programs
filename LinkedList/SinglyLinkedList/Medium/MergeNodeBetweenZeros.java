

/*

2181. Merge Nodes in Between Zeros
        Medium
        1.6K
        30
        Companies
        You are given the head of a linked list, which contains a series of integers separated by 0's. The beginning and end of the linked list will have Node.val == 0.

        For every two consecutive 0's, merge all the nodes lying in between them into a single node whose value is the sum of all the merged nodes. The modified list should not contain any 0's.

        Return the head of the modified linked list.

        Example 1:
        Input: head = [0,3,1,0,4,5,2,0]
        Output: [4,11]
        Explanation: 
        The above figure represents the given linked list. The modified list contains
        - The sum of the nodes marked in green: 3 + 1 = 4.
        - The sum of the nodes marked in red: 4 + 5 + 2 = 11.


        Example 2:
        Input: head = [0,1,0,3,0,2,2,0]
        Output: [1,3,4]
        Explanation: 
        The above figure represents the given linked list. The modified list contains
        - The sum of the nodes marked in green: 1 = 1.
        - The sum of the nodes marked in red: 3 = 3.
        - The sum of the nodes marked in yellow: 2 + 2 = 4.


 */



package LinkedList.SinglyLinkedList.Medium;

class ListNode{
    int data;
    ListNode next;
    public String val;

    ListNode(int x){
        data = x;
        next = null;
    }
}
public class MergeNodeBetweenZeros {

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

    static void delete(ListNode node){
        node.data = node.next.data;
        node.next = node.next.next;
        
    }

    static ListNode mergeNodes(ListNode head) {
        
        ListNode node1 = head;
        ListNode node2 = null;
        ListNode ptr = node2;

        int sum = 0;
        while(node1!=null){

            if(node1.data==0){
                ListNode newNode = new ListNode(sum);

                if(node2==null && sum!=0){
                    node2 = newNode;
                    ptr = newNode;
                }

                else{

                    if(sum!=0){
                        ptr.next = newNode;
                        ptr = newNode;
                    }
                }

                sum = 0;
            }

            else{

                sum +=node1.data;
            }
            node1 = node1.next;
        }

        return node2;
    }

    
    public static void main(String[] args) {
        ListNode head = null;
        display(head);

        head = insert(head, 0);
        head = insert(head, 1);
        head= insert(head, 0);
        head = insert(head, 3);
        head = insert(head, 0);
        head = insert(head, 2);
        head = insert(head, 2);
        head = insert(head, 0);

        System.out.println("\nLinked List after insertion...!");
        display(head);

        System.out.println();

        ListNode heaNode = mergeNodes(head);

        display(heaNode);
        
    }
}
