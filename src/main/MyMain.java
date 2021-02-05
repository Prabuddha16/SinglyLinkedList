package main;

import implementation.MyLinkedList;

public class MyMain {
    public  static void  main(String[] args){
        MyLinkedList singlyLinkedList = new MyLinkedList();
        int element = 300;
        boolean result = singlyLinkedList.addFirst(element);
        System.out.println(result);
        result= singlyLinkedList.addLast(element);
        System.out.println(result);
        singlyLinkedList.travers();
        singlyLinkedList.addLast(500);
        singlyLinkedList.addFirst(700);
        singlyLinkedList.travers();
    }

}
