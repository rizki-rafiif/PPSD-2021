package gg.rizkirafiif;

public interface List {
    boolean isEmpty();
    void printNode();
    void addFirst(Node input);
    void addLast(Node input);
    void insertAfter(int key, Node input);
    void insertBefore(int key, Node input);
    void insert(int index, Node input);
    void replace(int data1,int data2);
    void remove(int data);
    void removeFirst();
    void removeLast();
    void find(int data);
    int length();
    void removeAt();
    void clear();
}
