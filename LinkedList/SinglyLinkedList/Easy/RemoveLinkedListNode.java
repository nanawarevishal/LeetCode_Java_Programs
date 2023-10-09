package LinkedList.SinglyLinkedList.Easy;

class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
        next = null;
    }
}

class RemoveNode {

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
                System.out.print(node.val+"-->");
                node = node.next;
            }
        }
    }

    static ListNode removeElements(ListNode head, int val) {
        
        ListNode node = head.next;
        ListNode prev = head;
        if(node!=null){

            while(node!=null){
                System.out.println(prev.val);
                prev = node;
                node = node.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = null;
        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 6);
        head = insert(head, 3);
        head = insert(head, 4);
        head = insert(head, 5);
        head = insert(head, 6);


        ListNode node = removeElements(head, 6);

        display(node);
    }
}
