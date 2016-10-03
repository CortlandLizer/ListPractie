import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.lang.Object;

/**
 * Created by cortl on 10/3/2016.
 */
public class ListPractice extends Object implements List {

    private Node head;
    private  Node curr;
    private int length = 0;

    public ListPractice() {
        //empty
    }

    public void clear() {
        head = null;
        curr = head;
        length = 0;
    }

    public Object getValue() {
        return curr.getVal();
    }

    public void insert(Object o) {
        // if curr == head, make head = new node(o)
        if (curr == head) {
            head = new Node(o);
            if (curr == null) {
                curr = head;
            } else {
                head.setNext(curr);
                curr.setPrev(head);
            }
        } else {
            Node myNode = new Node(o);
            myNode.setNext(curr);
            myNode.setPrev(curr.getPrev());

            curr.getPrev().setNext(myNode);
            curr.setPrev(myNode);
            // curr.setNext();

        }

        // relink existing nodes around the new one
        length++;
    }

    public int length() {

        return length;
    }

    public void next() {
        //curr = head;
        if(!(curr== null )&& !(curr.getNext() == null)){
            curr = curr.getNext();
        }

    }
}
