package LinkedList.SinglyLinkedList.Medium;


class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
public class deleteNode {

    static Node insert(Node head,int data){

        Node node = head;
        Node newnode = new Node(data);
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

    static void display(Node head){
        Node node = head;
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

    static void delete(Node node){
        node.data = node.next.data;
        node.next = node.next.next;
        
    }
    public static void main(String[] args) {
        Node head = null;
        display(head);

        head = insert(head, 10);
        head = insert(head, 20);
        head= insert(head, 30);
        head = insert(head, 40);

        System.out.println("\nLinked List after insertion...!");
        display(head);

        Node node = head;
        while(node.data!=30){
            node = node.next;
        }

        delete(node);

        System.out.println("\nLinked List after deletion of anonymous node...!");
        display(head);


    }
}
