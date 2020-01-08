package Week4.Day_24.Lesson;

import Week4.Day_23.Lesson.LearnList.Student;
import playground.Faker;
import playground.Timer;

/*
自实现链表
 */
public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        checkRange(index);
        return find(index).getData();
    }

    private Node find(int index) {
        checkRange(index);
        Node temp;

        if (index > size / 2) {
            temp = tail;
            for (int i = 0; i < size - 1 - index; i++) {
                temp = temp.getPrev();
            }
        } else {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
            }
        }

        return temp;
    }

    public void add(Object object) {
        if (size == 0) {
            addToEmptyList(object);
        } else {
            addLast(object);
        }
    }

    private void addToEmptyList(Object object) {
        Node node = new Node(object);
        head = node;
        tail = node;
        size = 1;
    }

    public void addFirst(Object object) {
        if (size == 0) {
            addToEmptyList(object);
        } else {
            Node newNode = new Node(object);

            head.setPrev(newNode);
            newNode.setNext(head);
            head = newNode;
            size++;
        }
    }

    // addLast
    public void addLast(Object object) {
        if (size == 0) {
            addToEmptyList(object);
        } else {
            Node node = new Node(object);

            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
            size++;
        }
    }

    public void add(int index, Object object) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        } else if (index == size) {
            addLast(object);
        } else if (index == 0) {
            addFirst(object);
        } else {
            Node newNode = new Node(object);
            Node indexNode = find(index);

            indexNode.getPrev().setNext(newNode);
            newNode.setPrev(indexNode.getPrev());

            indexNode.setPrev(newNode);
            newNode.setNext(indexNode);
            size++;
        }
    }

    // removeFirst
    private void removeFirst() {
        head.getNext().setPrev(null);
        head = head.getNext();
        size--;
    }

    // removeLast
    private void removeLast() {
        tail.getPrev().setNext(null);
        tail = tail.getPrev();
        size--;
    }

    public void remove(int index) {
        checkRange(index);
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node node = find(index); // remove Node 要删除的节点

            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
            size--;
        }
    }

    public void set(int index, Object object) {
        checkRange(index);
        Node node = find(index);
        node.setData(object);
    }

    private void checkRange(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        for (int i = 0; i < 10; i++) {
            myLinkedList.add(new Student("N" + i, i));
        }

        myLinkedList.remove(0);
        myLinkedList.remove(8);
        myLinkedList.remove(3);

        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));

        }
    }
}
