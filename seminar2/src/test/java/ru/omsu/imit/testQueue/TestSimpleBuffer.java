package ru.omsu.imit.testQueue;


import org.junit.Assert;
import org.junit.Test;
import ru.omsu.imit.queue.ITask;
import ru.omsu.imit.queue.SimpleBuffer;
import ru.omsu.imit.queue.Task;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class TestSimpleBuffer {
    @Test
    public void testCountElem(){
        Task task = new Task(1,2,3,4,5);
        Task task1 = new Task(1,2,3,4,5);
        Task task2= new Task(1,2,3,4,5);
        Queue<ITask> queue = new LinkedList<>();
        Collections.addAll(queue,task,task1,task2);
        SimpleBuffer<ITask> simpleBuffer = new SimpleBuffer<>(queue);
        Assert.assertEquals(3,simpleBuffer.countElem());
    }

}
