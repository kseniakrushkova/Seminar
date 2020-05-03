package ru.omsu.imit.queue;


import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;


public class SimpleBuffer<T> implements IBuffer {
    private Queue<T> integerQueue;



    public T getElem() {
        return integerQueue.peek();
    }

    public void setElem(Object elem) {
        integerQueue.add((T) elem);
    }

    public int countElem() {
        int k = 0;
        Queue<T> copy = new LinkedList<>(integerQueue);
        while (copy.poll() != null) {
            k++;
        }
        return k;
    }

    public SimpleBuffer(Queue<T> integerQueue) {
        this.integerQueue = new LinkedList<>(integerQueue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleBuffer that = (SimpleBuffer) o;
        return Objects.equals(integerQueue, that.integerQueue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integerQueue);
    }

    public void cleanBuffer() {
        integerQueue.clear();
    }

    public boolean checkEmpty() {
        return integerQueue.peek() == null;
    }
}
