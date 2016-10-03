import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.lang.Object;
import java.util.ListIterator;

/**
 * Created by cortland on 10/3/2016.
 */
public class ListPractice implements List {

    private Node head;
    private  Node curr;
    private int length = 0;

    public ListPractice() {
        //empty
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public boolean add(Object o) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public boolean addAll(int index, Collection c) {
        return false;
    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public void clear() {
        head = null;
        curr = head;
        length = 0;
    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator listIterator() {
        return null;
    }

    public ListIterator listIterator(int index) {
        return null;
    }

    public List subList(int fromIndex, int toIndex) {
        return null;
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
