package edu.vitor.dio.data_structure;

public class CircularList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int listSize;

    public CircularList(){
        this.listSize = 0;
    }

    private Node<T> getNode(int index){
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");

        if (index == 0){
            return this.tail;
        }
        Node<T> auxiliarNode = this.tail;
        for (int i = 0; (i < index) && (auxiliarNode != null); i++) {
            auxiliarNode = auxiliarNode.getNextNode();
        }
        return auxiliarNode;
    }

    public int size(){
        return this.listSize;
    }

    public boolean isEmpty(){
        return this.listSize == 0 ? true:false;
    }
}
