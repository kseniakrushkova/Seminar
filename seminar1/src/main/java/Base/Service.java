package Base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Service {
    public List getList(String _name, List<Data> dataList) {
        List<Data> myList = new ArrayList<>();
        for (int i = 0; i < dataList.size(); i++) {
            if (dataList.get(i).getName().equals(_name)) {
                myList.add(dataList.get(i));
            }
        }
        return myList;
    }

    public List getListLevel(double level, List<Data> dataList) {
        List<Data> myList = new ArrayList<>();
        for (int i = 0; i < dataList.size(); i++) {
            if (Math.abs(dataList.get(i).getValue()) <= level) {
                myList.add(dataList.get(i));
            }
        }
        return myList;
    }

    public Set getSet(List<Data> dataList, Set<String> names) {
        Set<Double> mySet = new HashSet<>();

        for (int i = 0; i < dataList.size(); i++) {
            if (names.contains(dataList.get(i).getName())) {
                mySet.add(dataList.get(i).getValue());
            }
        }
        return mySet;
    }

    public String[] getArray(List<Data> dataList) {
        String[] strings = new String[dataList.size()];
        List<String> myList = new ArrayList<>();
        for (int i = 0; i < dataList.size(); i++) {
            if (dataList.get(i).getValue() > 0) {
                strings[i] = dataList.get(i).getName();
                myList.add(dataList.get(i).getName());
            }
        }
        for (int i = 0; i < myList.size(); i++) {
            if (myList.contains(strings[i]))
                myList.remove(i);
        }
        strings = myList.toArray(new String[0]);
        return strings;
    }

    public Set newSet(List<Set<Type>> setList) {
        Set<Type> myNewSet = new HashSet<>();
        for (int i = 0; i < setList.size(); i++) {
            myNewSet.add((Type) setList.get(i));
        }
        return myNewSet;
    }

    public Set crossSet(List<Set<Type>> setList) {
        for (int i = 0; i < setList.size(); i++){
        }
    }

    public List maxSet(List<Set<Type>> setList) {
        int size = 0;
        List<Set<Type>> mySetList = new ArrayList<>();
        for (int i = 0; i < setList.size(); i++) {
            if (setList.get(i).size() >= size) {
                size = setList.get(i).size();
            }
        }
        for (int i = 0; i < setList.size(); i++) {
            if (setList.get(i).size() == size) {
                mySetList.add(setList.get(i));
            }
        }
        return mySetList;
    }

}
