package ru.omsu.imit.queue;

public interface IBuffer<T> {
    T getElem();

    void setElem(T elem);

    int countElem();

    void cleanBuffer();

    boolean checkEmpty();
}
