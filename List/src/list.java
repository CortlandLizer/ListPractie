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

    public ListPractice() {
        //empty
    }

    public void clear() {
        head.setNext(null);
        curr.setNext(null);
    }

    public Object getValue() {
        return curr.getVal();
    }

    public void insert(Object o) {
        // if curr == head, make head = new node(o)
        // relink existing nodes around the new one
    }

    public int length() {

    }

    public void next() {
        //curr = head;
        if(!(curr== null )&& !(curr.getNext() == null)){
            curr = curr.getNext();
        }

    }
}
