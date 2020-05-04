package ru.omsu.imit.testQueue;

import org.junit.Assert;
import org.junit.Test;
import ru.omsu.imit.queue.*;

import java.util.LinkedList;
import java.util.Queue;

public class TestSimpleTaskGenerator {
    @Test
    public void testGenerate() {
        Task task = new Task(1, 2, 3);
        Queue<ITask> integerQueue = new LinkedList<ITask>();
        integerQueue.add(task);
        SimpleBuffer buffer = new SimpleBuffer(integerQueue);
        SimpleTaskGenerator simpleTaskGenerator = new SimpleTaskGenerator(buffer, 1, 3);
        simpleTaskGenerator.generate();
        Task task1 = (Task) buffer.getElem();
        Assert.assertArrayEquals(task.getArray(), task1.getArray());

    }
}
