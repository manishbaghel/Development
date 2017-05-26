package hackerrank.datastructure.linklist;

/**
 * Created by mb00549 on 5/17/2017.
 */
public class FirstLinkList {

    public static void main(String[] args) {

    }

    void Print(Node head) {
        while(head !=null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    Node InsertAtEnd(Node head,int data) {
        Node tail = new Node();
        tail.data = data;

        if(head == null){
            head = tail;
        }else{
            while(head!=null){
                head = head.next;
            }
            head = tail;
        }
        return tail;
    }

    Node InsertAtBegining(Node head,int data) {
        Node tail = new Node();
        tail.data = data;

        if(head == null){
            head = tail;
        }else{
            while(head!=null){
                head = head.next;
            }
            head = tail;
        }
        return tail;
    }
}

class Node {
    int data;
    Node next;

}