import Base.Data;
import org.junit.Assert;
import org.junit.Test;
import Base.Service;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestService {
    @Test
    public void testGetListByNames(){
        Service a = new Service();
        String name = "aaa";
        Data data = new Data("aaa",123);
        Data data1 = new Data("aab",123);
        Data data2 = new Data("aaa",124);
        List<Data> actual = new ArrayList<>();
        actual.add(data);
        actual.add(data1);
        actual.add(data2);
        List<Data> expected = new ArrayList<>();
        expected.add(data);
        expected.add(data2);

        Assert.assertEquals(expected,a.getListByNames(name,actual));
    }

    @Test
    public  void  testGetListByValue(){
        Service a = new Service();
        double level = 123;
        Data data = new Data("aaa",123);
        Data data1 = new Data("aab",123);
        Data data2 = new Data("aaa",124);
        List<Data> actual = new ArrayList<>();
        actual.add(data);
        actual.add(data1);
        actual.add(data2);
        List<Data> expected = new ArrayList<>();
        expected.add(data);
        expected.add(data1);

        Assert.assertEquals(expected,a.getListByValue(level,actual));
    }

    @Test
    public void testGetSetValuesByNames(){
        Service a = new Service();
        Set<String> stringSet = new HashSet<>();
        stringSet.add("bob");
        stringSet.add("jon");
        stringSet.add("вася");
        Data data = new Data("aaa",123);
        Data data1 = new Data("bob",123);
        Data data2 = new Data("вася",124);
        List<Data> actual = new ArrayList<>();
        actual.add(data);
        actual.add(data1);
        actual.add(data2);
        Set<Double> expected = new HashSet<>();
        expected.add(data2.getValue());
        expected.add(data1.getValue());

        Assert.assertEquals(expected,a.getSetValuesByNames(actual,stringSet));
    }

    @Test
    public void testGetNamesOfPositiveValueItems(){
        Service a = new Service();
        Data data = new Data("aaa",123);
        Data data1 = new Data("aab",123);
        Data data2 = new Data("abc",-34);
        List<Data> actual = new ArrayList<>();
        actual.add(data);
        actual.add(data1);
        actual.add(data2);
        List<String> expected = new ArrayList<>();
        expected.add(data.getName());
        expected.add(data1.getName());
        Assert.assertEquals(expected.toArray(),a.getNamesOfPositiveValueItems(actual));
    }

    @Test
    public void testCombineSet(){


    }

    @Test
    public void testMaxSet(){
        Service a = new Service();
        List<Set<Data>> setList  = new ArrayList<>();
        Data data = new Data("aaa",123);
        Data data1 = new Data("aab",123);
        Data data2 = new Data("abc",-34);
        Set<Data> stringSet = new HashSet<>();
        stringSet.add(data);
        stringSet.add(data1);
        stringSet.add(data2);
        setList.add(stringSet);
        Set<Data> stringSet1 = new HashSet<>();
        stringSet.add(data1);
        stringSet.add(data2);
        setList.add(stringSet1);
        Set<Data> stringSet2 = new HashSet<>();
        stringSet.add(data);
        stringSet.add(data1);
        setList.add(stringSet2);
        List<Set<Data>> actual = new ArrayList<>();
        actual.add(stringSet);
        actual.add(stringSet1);
        actual.add(stringSet2);
        List<Set<Data>> expected = new ArrayList<>();
        expected.add(stringSet);

        Assert.assertEquals(expected,a.maxSet(actual));
    }
  }
