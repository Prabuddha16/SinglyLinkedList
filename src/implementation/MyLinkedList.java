package implementation;

import myinterface.MySinglyLinkedList;

public class MyLinkedList implements MySinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public boolean addFirst(int element){
        boolean response = false;
        Node node = new Node(element);      //node variable
        if(isEmpty()){           //head == null
            head = node;
            tail = node;
            size++;
            response = true;
        }
        else {
            node.setNext(head);
            head = node;
            size++;
            response = true;
        }
        return  response;
    }
    @Override
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        else{
            return  false;
        }
    }
    @Override
    public boolean addLast(int element){
        boolean response = false;
        Node node = new Node(element);
        if(isEmpty()){
            head = node;
            tail = node;
            size++;
            response = true;
        }
        else{
            tail.setNext(node);
            tail = node;
            size++;
            response = true;
        }
        return response;
    }
    @Override
    public int first(){
        return 0;
    }

    @Override
    public int last(){
        return 0;
    }

    @Override
    public int removeFirst(){
        return 0;
    }

    @Override
    public int removeLast(){
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    //additional method to traverse
    public void travers(){
        System.out.println("printing");
        if(head != null){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.getData()+"-->");
                temp = temp.getNext();
            }
        }
        System.out.println();
    }
}
