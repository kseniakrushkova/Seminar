package ru.imit.omsu.seminar3;

import java.util.*;

public class Service {
    public List<String> getLearnedDiscipline(ReferenceAboutTheStudiedDisciplines ref) {
        List<String> stringList = new ArrayList<String>();
        for (int i = 0; i < ref.getTablesString().size(); i++) {
            stringList.add(ref.getTablesString().get(i).getDisciplineName());
        }
        return stringList;
    }

    public int sumOfAllDisciplines(ReferenceAboutTheStudiedDisciplines ref) {
        int sum = 0;
        for (int i = 0; i < ref.getTablesString().size(); i++) {
            sum += (ref.getTablesString().get(i).getDisciplineHours());
        }
        return sum;
    }

    public double averageRating(ReferenceAboutTheStudiedDisciplines ref) {
        double mult = 1;
        for (int i = 0; i < ref.getTablesString().size(); i++) {
            if (ref.getTablesString().get(i).getMark().equals(MarkState.УДОВЛЕТВОРИТЕЛЬНО)) {
                mult *= 3;
            }
            if (ref.getTablesString().get(i).getMark().equals(MarkState.ХОРОШО)) {
                mult *= 4;
            }
            if (ref.getTablesString().get(i).getMark().equals(MarkState.ОТЛИЧНО)) {
                mult *= 5;
            }
        }
        return mult / ref.getTablesString().size();
    }

    public Map<String, MarkState> disciplineWithRating(ReferenceAboutTheStudiedDisciplines ref) {
        Map<String, MarkState> stringMap = new HashMap<String, MarkState>();
        for (int i = 0; i < ref.getTablesString().size(); i++) {
            stringMap.put(ref.getTablesString().get(i).getDisciplineName(), ref.getTablesString().get(i).getMark());
        }
        return stringMap;
    }

    public Map<MarkState, List<String>> disciplineByRating(ReferenceAboutTheStudiedDisciplines ref) {
        Map<MarkState, List<String>> stringMap = new HashMap<MarkState, List<String>>();
        for (int i = 0; i < ref.getTablesString().size(); i++) {
            List<String> stringList = new ArrayList<>();
            if (!stringMap.containsKey(ref.getTablesString().get(i).getMark())) {
                stringList.add(ref.getTablesString().get(i).getDisciplineName());
                stringMap.put(ref.getTablesString().get(i).getMark(), stringList);
            } else {
                stringList = stringMap.get(ref.getTablesString().get(i).getMark());
                stringList.add(ref.getTablesString().get(i).getDisciplineName());
                stringMap.put(ref.getTablesString().get(i).getMark(), stringList);
            }
        }
        return stringMap;
    }
}
