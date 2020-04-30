package ru.imit.omsu.seminar3;

import java.util.Objects;

public class TablesString {
    private String disciplineName;
    private int disciplineHours;
    private MarkState mark;

    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    public int getDisciplineHours() {
        return disciplineHours;
    }

    public void setDisciplineHours(int disciplineHours) {
        this.disciplineHours = disciplineHours;
    }


    public TablesString(String disciplineName, int disciplineHours, MarkState mark) {
        this.disciplineName = disciplineName;
        this.disciplineHours = disciplineHours;
        this.mark = mark;
    }

    public MarkState getMark() {
        return mark;
    }

    public void setMark(MarkState mark) {
        if (!mark.equals(MarkState.values())) {
            throw new IllegalArgumentException();
        }
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TablesString that = (TablesString) o;
        return disciplineHours == that.disciplineHours &&
                Objects.equals(disciplineName, that.disciplineName) &&
                Objects.equals(mark, that.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disciplineName, disciplineHours, mark);
    }
}
