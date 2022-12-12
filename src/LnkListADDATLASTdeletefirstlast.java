import java.util.*;

class Node {
        int val;
        Node next;

        Node(int val) {  // constructor of node class
            this.val = val;
//            this.next = null;
        }
    }
class LL2 {
    Node head;
    public void addFirst(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    public void addLast(int val) {
        Node newNode = new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
public void addtoposition(int pos , int valuetoadd , int n) {
    if (pos < 0) {
        System.out.println("INVALID POSITION INSERTED BY USER");
    } else if (pos == 0) {
        addFirst(valuetoadd);
    } else if (pos > n) {
        addLast(valuetoadd);
    } else {
        Node newNode = new Node(valuetoadd);
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
}


    public void deletefirst(){
        if(head==null)
        {
            System.out.println("The link is empty");
        }
        head=head.next;
    }



    public void deletelast(){
        if(head==null)
        {
            System.out.println("The link is empty");
        }
        if(head.next==null)
        {
            head = null;
            return;
        }
        Node secLast = head;
        Node LastNode = head.next;
        while(LastNode.next!=null)
        {
            LastNode = LastNode.next;
            secLast = secLast.next;
        }
        secLast.next = null;
    }
   public void deleteFromPosition(int pos){
        if(pos==0)
        {
            head = head.next;
            return;
        }
        Node prev = head;
        for(int i=0 ; i<pos-1; i++)
        {
            prev = prev.next;
        }
        prev.next = (prev.next).next;
    }

    public void reverseIterate(){
        if(head==null || head.next==null)
        {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null)
        {
            Node nextNode = currNode.next;
            currNode.next=prevNode;
            //upadte....
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next=null;
        head= prevNode;
    }

    public void printList() {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");  //NULL will print after the last node every time
    }
}

public class LnkListADDATLASTdeletefirstlast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int n = sc.nextInt(); // size of the LL
               LL2 list = new LL2();
                for(int i=0 ; i<n ; i++)
                        {
                                int x = sc.nextInt();
                                list.addLast(x); // it will take input and keep inserting at last

                        }
                               int pos = sc.nextInt();
                                int valuetoadd = sc.nextInt();
//
                                    list.addtoposition(pos,valuetoadd,n);
//                                        list.reverseIterate();
                                     list.printList();
//
//                list.addFirst(5);
//                list.printList();
//
//                list.addLast(10);
//                list.printList();


//
//        LL2 list = new LL2();
//        list.addLast(5);
//        list.addLast(6);
//        list.addLast(7);
//        list.printList();
//
//        list.addFirst(1);
//        list.printList();
//        list.addFirst(2);
//        list.printList();

//        list.deletefirst();
//        list.printList();

//        list.deletelast();
//        list.printList();

    }
}