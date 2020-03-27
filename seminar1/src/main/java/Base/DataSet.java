package Base;

import java.util.*;

import static java.util.Collections.*;

public class DataSet {
    private List<Data> dataList = new ArrayList<>();

    public List<Data> getDataList() {
        return dataList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataSet dataSet = (DataSet) o;
        return Objects.equals(dataList, dataSet.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataList);
    }

    public DataSet(List<Data> dataList) {
        this.dataList = dataList;
    }

    public List sortDataSetList(List<Data> dataList) {
        for(Data data:dataList){

        }
        return dataList;
    }
}
