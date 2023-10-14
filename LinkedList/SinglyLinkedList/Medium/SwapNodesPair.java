package LinkedList.SinglyLinkedList.Medium;

import javax.xml.transform.Templates;

import Strings.Easy.numberOfSeniorCitizen;

class ListNode{
    int data;
    ListNode next;
    public String val;

    ListNode(int x){
        data = x;
        next = null;
    }
}

class SwapNodesPair {

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

    static ListNode swapPairs(ListNode head) {

        ListNode node = head;
        ListNode prev = null;
        while(node.next!=null){
            
            ListNode temp = node.next;
            if(prev==null){
                head = node;
            }
            if(prev!=null){
                node.next = prev;
                prev.next = temp;
                System.out.println(node.next.data);
                System.out.println(prev.data);
                System.out.println(temp.data);
                // break;
            }

            prev = node;
            node =temp;
        }

      return head;
    }

   
    public static void main(String[] args) {

        ListNode head1 = null;

        head1 = insert(head1, 1);
        head1 = insert(head1, 2);
        head1 = insert(head1, 3);
        // display(head1);

        ListNode n1 = swapPairs(head1);

        display(n1);
    }
}


