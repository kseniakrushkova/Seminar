package ru.omsu.imit.queue;

public class SimpleTaskGenerator implements ITaskGenerator {
    private SimpleBuffer<ITask> buffer;
    private int startValue;
    private int amount;

    public SimpleTaskGenerator(SimpleBuffer<ITask> buffer, int startValue, int amount) {
        this.buffer = buffer;
        this.startValue = startValue;
        this.amount = amount;
    }

    public SimpleBuffer<ITask> getBuffer() {
        return buffer;
    }

    public int getStartValue() {
        return startValue;
    }

    public int getAmount() {
        return amount;
    }

    public SimpleTaskGenerator withStartValue(int startValue) {
        this.startValue = startValue;
        return this;
    }

    public SimpleTaskGenerator withAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public void generate() {
        int[] array = new int[amount];
        for (int i = 0; i < array.length; i++) {
            array[i] = startValue + i;
        }
        buffer.setElem(array);
    }
}
