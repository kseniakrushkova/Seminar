package Base;

import java.util.Comparator;

public class SortElemByNames implements Comparator<Data> {

    @Override
    public int compare(Data data, Data data1) {
        return data.getName().compareTo(data1.getName());
    }

}
