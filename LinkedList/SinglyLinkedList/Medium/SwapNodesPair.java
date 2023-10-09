package LinkedList.SinglyLinkedList.Medium;

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

    static ListNode swapPairs(ListNode head) {

        if(head!=null){
            
            ListNode node = head;
            while(node!=null){

                ListNode temp = node.next.next;
                node.next.next = node;
                node = temp;
            }
        }
        return head;
    }

   
    public static void main(String[] args) {

        ListNode head1 = null;

        head1 = insert(head1, 1);
        head1 = insert(head1, 2);
        head1 = insert(head1, 3);
        head1 = insert(head1, 4);

        ListNode head = swapPairs(head1);
        display(head);

    }
}

