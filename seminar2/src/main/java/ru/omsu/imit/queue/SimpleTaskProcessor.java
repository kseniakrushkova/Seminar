package ru.omsu.imit.queue;

public class SimpleTaskProcessor implements ITaskProcessor {
    private SimpleBuffer<ITask> buffer;

    public SimpleTaskProcessor(SimpleBuffer<ITask> buffer) {
        this.buffer = buffer;
    }

    @Override
    public Integer process() {
        if (buffer.checkEmpty()) {
            return null;
        }
        int sumElem = 0;
        Task task =  (Task) buffer.getElem();
        for (int i : task.getArray()) {
            sumElem += i;
        }
        return sumElem;
    }
}
