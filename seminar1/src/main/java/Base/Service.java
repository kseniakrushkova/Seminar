package Base;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Service {
    public List getListByNames(String _name, List<Data> dataList) {
        List<Data> myList = new ArrayList<>();
        for (int i = 0; i < dataList.size(); i++) {
            if (dataList.get(i).getName().equals(_name)) {
                myList.add(dataList.get(i));
            }
        }
        return myList;
    }

    public List getListByValue(double level, List<Data> dataList) {
        List<Data> myList = new ArrayList<>();
        for (int i = 0; i < dataList.size(); i++) {
            if (Math.abs(dataList.get(i).getValue()) <= level) {
                myList.add(dataList.get(i));
            }
        }
        return myList;
    }

    public Set getSetValuesByNames(List<Data> dataList, Set<String> names) {
        Set<Double> mySet = new HashSet<>();
        for (int i = 0; i < dataList.size(); i++) {
            if (names.contains(dataList.get(i).getName())) {
                mySet.add(dataList.get(i).getValue());
            }
        }
        return mySet;
    }

    public String[] getNamesOfPositiveValueItems(List<Data> dataList) {
        String[] strings = new String[dataList.size()];
        Set<String> setOfPositiveNames = new HashSet<>();
        for (int i = 0; i < dataList.size(); i++) {
            if (dataList.get(i).getValue() > 0) {
                setOfPositiveNames.add(dataList.get(i).getName());
            }
        }
        strings = setOfPositiveNames.toArray(new String[0]);
        return strings;
    }

    public <T> Set combineSet(List<Set<T>> list) {
        Set<T> myNewSet = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(null)) {
                throw new IllegalArgumentException("list has null elem, cannot add it to set exception");
            }
            myNewSet.add((T) list.get(i));
        }
        return myNewSet;
    }

    public <T> Set crossSet(List<Set<T>> setList) {
        Set<T> setPar = new HashSet<>();
        for (int i = 0; i < setList.size() - 1; i++) {
            if (setList.get(i).equals(null) || setList.get(i + 1).equals(null)) {
                throw new IllegalArgumentException("Set is null exception");
            }
            setList.get(i).retainAll(setList.get(i + 1));
        }
        setPar.add((T) setList);
        return setPar;
    }

    public <T> List maxSet(List<Set<T>> setList) {
        int size = 0;
        List<Set<T>> mySetList = new ArrayList<>();
        for (int i = 0; i < setList.size(); i++) {
            if (setList.get(i).size() >= size) {
                size = setList.get(i).size();
            }
        }
        for (int i = 0; i < setList.size(); i++) {
            if (setList.get(i).size() == size) {
                if (setList.get(i).equals(null)){
                    throw new IllegalArgumentException("wanted to add null elem to set exception");
                }
                mySetList.add(setList.get(i));
            }
        }
        return mySetList;
    }

}
