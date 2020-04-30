package ru.imit.omsu.seminar3;

import java.util.HashMap;
import java.util.Map;

public enum MarkState {
    TESTED(1, "ЗАЧТЕНО"), SATISFACTORILY(3,"УДОВЛЕТВОРИТЕЛЬНО"),
    GOOD(4,  "ХОРОШО"), EXCELLENT(5, "ОТЛИЧНО");

    private int value;
    private String russianEquivalent;
    private static Map map = new HashMap<>();
    private static Map mapOfRussianEquivalent = new HashMap<>();



    private MarkState(int value, String russianEquivalent) {
        this.value = value;
        this.russianEquivalent = russianEquivalent;
    }

    static {
        for (MarkState mark : MarkState.values()) {
            map.put(mark, mark.getValue());
        }
    }

    static {
        for (MarkState mark: MarkState.values()){
            mapOfRussianEquivalent.put(mark.getRussianEquivalent(), mark);
        }
    }

    public static MarkState valueOf(MarkState mark) {
        return (MarkState) map.get(mark);
    }

    public static MarkState valueOfString(String mark) {
        return (MarkState) mapOfRussianEquivalent.get(mark);
    }

    public int getValue() {
        return value;
    }

    public String getRussianEquivalent(){
        return russianEquivalent;
    }
}
