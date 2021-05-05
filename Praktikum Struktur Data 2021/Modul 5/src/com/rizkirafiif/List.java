package com.rizkirafiif;

public interface List {
    boolean isEmpty();
    void addFirst(Node input);
    void addLast(Node input);
    void show();
    void removeFirst();
    void removeLast();
    void insert(int index, Node input);
    void replace(Node data1, Node data2);
    void remove(Node data);
    void removeAt(int index);
    void showReversed();
    void find(Node data);
    int length();
    void clear();
    void insertAfter(Node key, Node input);
    void insertBefore(Node key, Node input);
}
