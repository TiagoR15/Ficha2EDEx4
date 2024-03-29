/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha2edex4;

/**
 *
 * @author tiago
 */
public class DoublyLinkedList<T> {

    private int count;
    private Node<T> head;
    private Node<T> tail;

    public DoublyLinkedList() {
        this.count = 0;
        this.head = null;
        this.tail = null;
    }

    public int getCount() {
        return count;
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);

        if (this.count == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.head.setPrevious(newNode);
            newNode.setNext(this.head);
            this.head = newNode;
        }

        this.count++;
    }

    public void print() {
        Node<T> current = this.head;

        while (current != null) {
            System.out.println(current.getElement().toString());
            current = current.getNext();
        }
    }

}
