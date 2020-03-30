import Base.Data;
import Base.DataSet;
import Base.Service;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestDataSet {
    @Test
    public  void testSortDataSetList(){
        List<Data> dataList = new ArrayList<>();
        DataSet a = new DataSet(dataList);
        Data data = new Data("aaa",123);
        Data data1 = new Data("aba",123);
        Data data2 = new Data("aab",124);
        Data data3 = new Data("aaa",124);
        List<Data> actual = new ArrayList<>();
        actual.add(data);
        actual.add(data1);
        actual.add(data2);
        actual.add(data3);
        List<Data> expected = new ArrayList<>();
        expected.add(data);
        expected.add(data3);
        expected.add(data2);
        expected.add(data1);
        Assert.assertEquals(expected,a.sortDataSetList(actual));

    }
}
