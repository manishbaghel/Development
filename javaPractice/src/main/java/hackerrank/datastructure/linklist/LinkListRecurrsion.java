package hackerrank.datastructure.linklist;

/**
 * Created by manish on 5/20/17.
 */
public class LinkListRecurrsion {

    Node InsertAtTheTail(Node head,int data) {
        if(head == null){
            Node node = new Node();
            node.data=data;
            return node;
        }else{
            if(head.next == null){
                Node node = new Node();
                node.data=data;
                head.next =  node;
            }else{
                InsertAtTheTail(head.next, data);
            }
        }
        return head;
    }

}
