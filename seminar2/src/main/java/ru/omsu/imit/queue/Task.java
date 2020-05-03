package ru.omsu.imit.queue;

import java.util.Arrays;

public class Task implements ITask {
    private int[] array;

    public Task(int... array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Arrays.equals(array, task.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    public int[] getData() {
        return array;
    }
}
