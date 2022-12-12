 class LL {
    Node head;
    class Node{
        int val;
        Node next;

        Node(int val){  // constructor of node class
            this.val = val;
            this.next = null;
        }
    }
  // ADD  AT  FIRST...
  // make a function of addFirst with parameter of (int val)
    public void addFirst(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

   public void printlist() {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node temp = this.head;
        while(temp!=null)
        {
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
       System.out.println("NULL");
    }
 }

public class LnkListADDATFIRST {
     public static void main(String[] args) {
         LL list = new LL();
         list.addFirst(1);
         list.addFirst(2);
         list.addFirst(3);
         list.printlist();

      }
}


