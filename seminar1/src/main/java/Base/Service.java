package Base;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Service {
    public List getListByNames(String _name, List<Data> dataList) {
        List<Data> myList = new ArrayList<>();
        for (Data data : dataList
        ) {
            if (data == null) {
                throw new IllegalArgumentException("elem does not exist");
            }
            if (data.getName().equals(_name)) {
                myList.add(data);
            }
        }
        return myList;
    }

    public List getListByValue(double level, List<Data> dataList) {
        List<Data> myList = new ArrayList<>();
        for (Data data : dataList
        ) {
            if (data == null) {
                throw new IllegalArgumentException("elem does not exist");
            }
            if (Math.abs(data.getValue()) <= level) {
                myList.add(data);
            }
        }
        return myList;
    }

    public Set getSetValuesByNames(List<Data> dataList, Set<String> names) {
        Set<Double> mySet = new HashSet<>();
        for (Data data : dataList
        ) {
            if (data == null) {
                throw new IllegalArgumentException("elem does not exist");
            }
            if (names.contains(data.getName())) {
                mySet.add(data.getValue());
            }
        }
        return mySet;
    }

    public String[] getNamesOfPositiveValueItems(List<Data> dataList) {
        Set<String> setOfPositiveNames = new HashSet<>();
        for (Data data : dataList
        ) {
            if (data == null) {
                throw new IllegalArgumentException("elem does not exist");
            }
            if (data.getValue() > 0) {
                setOfPositiveNames.add(data.getName());
            }
        }
        return setOfPositiveNames.toArray(new String[0]);
    }

    public <T> Set combineSet(List<Set<T>> list) {
        Set<T> myNewSet = new HashSet<>();
        for (Set<T> set : list
        ) {
            if (set == null) {
                throw new IllegalArgumentException("list has null elem, cannot add it to set exception");
            }
            myNewSet.add((T) set);
        }
        return myNewSet;
    }

    public <T> Set crossSet(List<Set<T>> setList) {
        Set<T> setPar = new HashSet<>();
        for (int i = 1; i < setList.size() ; i++) {
            if (setList.get(i) == null) {
                throw new IllegalArgumentException("Set is null exception");
            }
            setList.get(0).retainAll(setList.get(i));
        }
        setPar.add((T) setList);
        return setPar;
    }

    public <T> List maxSet(List<Set<T>> setList) {
        int size = 0;
        List<Set<T>> mySetList = new ArrayList<>();
        for (int i = 0; i < setList.size(); i++) {
            if (setList.get(i) == null) {
                throw new IllegalArgumentException("wanted to add null elem to set exception");
            }
            if (setList.get(i).size() >= size) {
                size = setList.get(i).size();
            }
        }
        for (int i = 0; i < setList.size(); i++) {
            if (setList.get(i).size() == size) {
                if (setList.get(i) == null) {
                    throw new IllegalArgumentException("wanted to add null elem to set exception");
                }
                mySetList.add(setList.get(i));
            }
        }
        return mySetList;
    }

}
