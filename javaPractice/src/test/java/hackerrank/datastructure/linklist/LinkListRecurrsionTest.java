package hackerrank.datastructure.linklist;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by manish on 5/22/17.
 */
public class LinkListRecurrsionTest {
    @Test
    public void InsertAtTheTail() throws Exception {
        Node head_node = getLinkList();
        LinkListRecurrsion linkListRecurrsion = new LinkListRecurrsion();
        Node new_node = linkListRecurrsion.InsertAtTheTail(head_node, 9);

//        System.out.println(new_node);
        assert(getTailNode(new_node).data==9);
    }

    private Node getTailNode(Node new_node) {
        while (new_node.next != null) {
            new_node = new_node.next;
        }
        return new_node;
    }

    Node getLinkList() {
        Node node1 = new Node();
        node1.data = 1;
        Node node2 = new Node();
        node2.data = 2;
        node1.next = node2;
        Node node3 = new Node();
        node3.data = 3;
        node2.next = node3;
        return node1;
    }

}