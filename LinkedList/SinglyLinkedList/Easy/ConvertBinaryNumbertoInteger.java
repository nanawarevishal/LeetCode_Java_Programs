

/*

1290. Convert Binary Number in a Linked List to Integer
        Easy
        4K
        148
        Companies
        Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

        Return the decimal value of the number in the linked list.

        The most significant bit is at the head of the linked list.

        

        Example 1:
        Input: head = [1,0,1]
        Output: 5
        Explanation: (101) in base 2 = (5) in base 10.

        Example 2:
        Input: head = [0]
        Output: 0.


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

class ConvertBinaryNumbertoIntegers {

    static int getDecimalValue(ListNode head) {
        
        String str = "";

        ListNode node = head;
        while(node!=null){
            str +=node.val;
            node = node.next;
        }

        int binaryNum = 0;
        for(int i=0;i<str.length();i++){
            
            if(str.charAt(i)=='1'){
                binaryNum +=Math.pow(2,str.length()-i-1);
            }
        }

        return binaryNum;
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

    public static void main(String[] args) {
        ListNode head = null;
        head = insert(head, 1);
        head = insert(head, 0);
        head = insert(head, 1);

        System.out.println(getDecimalValue(head));
    }
}
