package edu.vitor.dio.data_structure;

public class CircularList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int listSize;

    public CircularList(){
        this.listSize = 0;
    }

    public int size(){
        return this.listSize;
    }

    public boolean isEmpty(){
        return this.listSize == 0 ? true:false;
    }
}
