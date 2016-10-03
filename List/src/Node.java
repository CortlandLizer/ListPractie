/**
 * Created by cortl on 10/3/2016.
 */
public class Node {
    private Object val;
    private Node next;
    private  Node prev;

    public Node(Object val){
        this.val = val;
    }
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }

}
