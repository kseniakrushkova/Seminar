package ru.imit.omsu.seminar3;

import java.util.ArrayList;
import java.util.List;

public class ReferenceAboutTheStudiedDisciplines {
    private List<TablesString> tablesString;
    private String  FIO;
    private String  university;
    private String  faculty;
    private String startAndEnd;

    public List<TablesString> getTablesString() {
        return tablesString;
    }

    public void addTablesString(TablesString stringToAdd){
        tablesString.add(stringToAdd);
    }

    public void setTablesString(List<TablesString> tablesString) {
        this.tablesString = tablesString;
    }

    public ReferenceAboutTheStudiedDisciplines(String FIO, String university, String faculty, String startAndEnd) {
        tablesString = new ArrayList<TablesString>();
        this.FIO = FIO;
        this.university = university;
        this.faculty = faculty;
        this.startAndEnd = startAndEnd;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getStartAndEnd() {
        return startAndEnd;
    }

    public void setStartAndEnd(String startAndEnd) {
        this.startAndEnd = startAndEnd;
    }


}
