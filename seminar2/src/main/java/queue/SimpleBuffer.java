package queue;

import java.nio.IntBuffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class SimpleBuffer implements IBuffer {
    private Queue<Integer> integerQueue = new LinkedList<Integer>();
    public int getElem() {
        return integerQueue.peek();
    }

    public void setElem(int elem) {
        integerQueue.add(elem);
    }

    public int countElem() {
        int k= 0 ;
        Queue<Integer> copy = new LinkedList<Integer>(integerQueue);
       while (copy.poll()!= null){
           k++;
       }
        return k;
    }

    public void cleanBuffer() {
        integerQueue.clear();
    }

    public boolean checkEmpty() {
        return integerQueue.peek() == null;
    }
}
