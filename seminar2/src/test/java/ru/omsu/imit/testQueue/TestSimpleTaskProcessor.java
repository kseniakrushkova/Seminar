package ru.omsu.imit.testQueue;

import org.junit.Assert;
import org.junit.Test;
import ru.omsu.imit.queue.ITask;
import ru.omsu.imit.queue.SimpleBuffer;
import ru.omsu.imit.queue.SimpleTaskProcessor;
import ru.omsu.imit.queue.Task;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class TestSimpleTaskProcessor {
    @Test
    public  void testProcessor(){
        Task task = new Task(1,2,3);
        Queue<ITask> integerQueue = new LinkedList<ITask>();
        SimpleBuffer buffer0 = new SimpleBuffer(integerQueue);
        integerQueue.add(task);
        SimpleBuffer buffer = new SimpleBuffer(integerQueue);
        SimpleTaskProcessor simpleTaskProcessor0 = new SimpleTaskProcessor(buffer0);
        SimpleTaskProcessor simpleTaskProcessor = new SimpleTaskProcessor(buffer);
        Assert.assertEquals(Integer.valueOf(6),simpleTaskProcessor.process());
        Assert.assertEquals(null,simpleTaskProcessor0.process());
    }
}
