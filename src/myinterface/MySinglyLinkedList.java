package myinterface;

public interface MySinglyLinkedList {
    boolean addFirst(int element);
    boolean addLast(int element);
    int first();                        //O(1)
    int last();                                  //O(n)
    int removeFirst();
    int removeLast();
    int size();
    boolean isEmpty();
}
// in interface by default all the methods are public abstract