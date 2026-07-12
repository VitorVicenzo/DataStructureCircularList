package edu.vitor.dio.data_structure;

public class CircularList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int listSize;

    public CircularList(){
        this.listSize = 0;
        this.head = null;
        this.tail = null;
    }

    public void add(T content){
        Node<T> newNode = new Node<>(content);
        if(this.isEmpty()){
            this.head = newNode;
            this.tail = this.head;
            this.head.setNextNode(tail);
        }else{
            newNode.setNextNode(this.tail);
            this.head.setNextNode(newNode);
            this.tail = newNode;
        }
        this.listSize++;
    }

    public void remove(int index){
        if (index >= this.listSize){
            throw new IndexOutOfBoundsException("O indíce é maior que o tamanho da lista.");
        }
        Node<T> auxiliarNode = this.tail;
        if (index == 0){
            this.tail = tail.getNextNode();
            this.head.setNextNode(this.tail);
        }else if (index == 1){
            this.tail.setNextNode(this.tail.getNextNode().getNextNode());
        }else{
            for (int i = 0; i < index-1; i++) {
                auxiliarNode = auxiliarNode.getNextNode();
            }
            auxiliarNode.setNextNode(auxiliarNode.getNextNode().getNextNode());
        }
        this.listSize--;
    }

    public T get(int index){
        return getNode(index).getContent();
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
