package Generics;

import java.util.ArrayList;

class Stack<T> {

    private ArrayList<T> list = new ArrayList<>();

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }

    public void display() {
        System.out.println(list);
    }
}
