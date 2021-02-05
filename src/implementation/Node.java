package implementation;

public class Node {
    private int data;
    private Node next;

    // create getter and setter
    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    public void setData(int data){
        this.data = data;       //this is used to point current value object
    }
    public void setNext(Node next){
        this.next =next;
    }

    //constructor
    public Node(int data){
        this.data = data;
        next = null;
    }
}
