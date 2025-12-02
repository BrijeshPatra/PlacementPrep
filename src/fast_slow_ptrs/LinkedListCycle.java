package fast_slow_ptrs;
class Node{
    static Node head;

    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedListCycle {
    public boolean hasCycle(Node head){
        Node slow=head,fast=head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if (slow==fast){
                return true;
            }
        }
        return false;
    }

}
