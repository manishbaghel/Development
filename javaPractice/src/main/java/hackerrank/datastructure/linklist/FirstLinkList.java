package hackerrank.datastructure.linklist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mb00549 on 5/17/2017.
 */
public class FirstLinkList {

    public static void main(String[] args) {

    }

    void ReversePrint(Node head) {
        List<Integer> datalist = new ArrayList<Integer>();

        if (head == null) return;

        while(head !=null){
            datalist.add(head.data);
            head = head.next;
        }

        for(int i = datalist.size()-1; i>=0 ; i--){
            System.out.println(datalist.get(i));
        }
    }

    Node Delete(Node head, int position) {
        if(head == null) return null;

        if(position == 0){
            return head.next;
        }

        Node initialHead = head;
        for(int i =1 ; i<position ; i++){
            head = head.next;
        }

        Node toDelete = head.next;
        head.next = toDelete.next;

        return  initialHead;
    }


    Node InsertNth(Node head, int data, int position) {
        Node newNode = new Node();
        newNode.data = data;

        if(head == null) return newNode;

        if(position == 0){
            newNode.next = head;
            return newNode;
        }


        Node initialHead = head;

        for(int i =1 ; i<position ; i++){
                 head = head.next;
        }

        if(head.next !=null) {
            newNode.next = head.next;
        }
        head.next = newNode;


        return initialHead;
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

    Node insertAtHead(Node head,int data) {
        Node newHead = new Node();
        newHead.data = data;
        newHead.next = head;
        return newHead;
    }
}

class Node {
    int data;
    Node next;

}