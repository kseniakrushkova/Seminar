import org.junit.Assert;
import org.junit.Test;
import ru.imit.omsu.seminar3.MarkState;
import ru.imit.omsu.seminar3.ReferenceAboutTheStudiedDisciplines;
import ru.imit.omsu.seminar3.Service;
import ru.imit.omsu.seminar3.TablesString;

import java.util.*;

public class TestService {
    @Test
    public  void testGetLearnedDiscipline(){
        List<TablesString> stringList = new ArrayList<>();
        ReferenceAboutTheStudiedDisciplines ref = new ReferenceAboutTheStudiedDisciplines
                ("bob","omsu","imit","2018-2020");
        Service service = new Service();
        TablesString ts = new TablesString("ЯМПы", 90, MarkState.valueOfString("ОТЛИЧНО"));
        TablesString ts2 = new TablesString("Тервер", 100, MarkState.valueOfString("ХОРОШО"));
        stringList.add(ts);
        stringList.add(ts2);
        ref.setTablesString(stringList);
        List<String> expected = new ArrayList<>();
        expected.add(ts.getDisciplineName());
        expected.add(ts2.getDisciplineName());
        Assert.assertEquals(expected, service.getLearnedDiscipline(ref));
    }

    @Test
    public void testSumOfAllDisciplines(){
        List<TablesString> stringList = new ArrayList<>();
        Service service = new Service();
        ReferenceAboutTheStudiedDisciplines ref = new ReferenceAboutTheStudiedDisciplines
                ("bob","omsu","imit","2018-2020");
        TablesString ts = new TablesString("ЯМПы", 90, MarkState.valueOfString("ОТЛИЧНО"));
        TablesString ts2 = new TablesString("Тервер", 100, MarkState.valueOfString("ХОРОШО"));
        stringList.add(ts);
        stringList.add(ts2);
        ref.setTablesString(stringList);
        Assert.assertEquals(190, service.sumOfAllDisciplines(ref));
    }

    @Test
    public void testAverageRating(){
        List<TablesString> stringList = new ArrayList<>();
        Service service = new Service();
        ReferenceAboutTheStudiedDisciplines ref = new ReferenceAboutTheStudiedDisciplines
                ("bob","omsu","imit","2018-2020");
        TablesString ts = new TablesString("ЯМПы", 90, MarkState.valueOfString("ОТЛИЧНО"));
        TablesString ts2 = new TablesString("Тервер", 100, MarkState.valueOfString("ХОРОШО"));
        TablesString ts3 = new TablesString("Дифуры", 100, MarkState.valueOfString("УДОВЛЕТВОРИТЕЛЬНО"));
        TablesString ts4 = new TablesString("Экономика", 100, MarkState.valueOfString("ЗАЧТЕНО"));
        stringList.add(ts);
        stringList.add(ts2);
        stringList.add(ts3);
        stringList.add(ts4);
        ref.setTablesString(stringList);
        Assert.assertEquals(4, service.averageRating(ref), 1e10);
    }

    @Test
    public void testDisciplineWithRating(){
        List<TablesString> stringList = new ArrayList<>();
        Service service = new Service();
        ReferenceAboutTheStudiedDisciplines ref = new ReferenceAboutTheStudiedDisciplines
                ("bob","omsu","imit","2018-2020");
        TablesString ts = new TablesString("ЯМПы", 90, MarkState.valueOfString("ОТЛИЧНО"));
        TablesString ts2 = new TablesString("Тервер", 100, MarkState.valueOfString("ХОРОШО"));
        TablesString ts3 = new TablesString("Дифуры", 100, MarkState.valueOfString("УДОВЛЕТВОРИТЕЛЬНО"));
        TablesString ts4 = new TablesString("Экономика", 100, MarkState.valueOfString("ЗАЧТЕНО"));
        stringList.add(ts);
        stringList.add(ts2);
        stringList.add(ts3);
        stringList.add(ts4);
        ref.setTablesString(stringList);
        Map<String,MarkState> map = new HashMap<>();
        map.put("ЯМПы", MarkState.valueOfString("ОТЛИЧНО"));
        map.put("Тервер", MarkState.valueOfString("ХОРОШО"));
        map.put("Дифуры", MarkState.valueOfString("УДОВЛЕТВОРИТЕЛЬНО"));
        map.put("Экономика", MarkState.valueOfString("ЗАЧТЕНО"));
        Assert.assertEquals(map, service.disciplineWithRating(ref));
    }

    @Test
    public void testDisciplineByRating(){
        List<TablesString> stringList = new ArrayList<>();
        Service service = new Service();
        ReferenceAboutTheStudiedDisciplines ref = new ReferenceAboutTheStudiedDisciplines
                ("bob","omsu","imit","2018-2020");
        TablesString ts = new TablesString("ЯМПы", 90, MarkState.valueOfString("ОТЛИЧНО"));
        TablesString ts5 = new TablesString("Алгем", 90, MarkState.valueOfString("ОТЛИЧНО"));
        TablesString ts2 = new TablesString("Тервер", 100, MarkState.valueOfString("ХОРОШО"));
        TablesString ts6 = new TablesString("Матан", 100, MarkState.valueOfString("ХОРОШО"));
        TablesString ts3 = new TablesString("Дифуры", 100, MarkState.valueOfString("УДОВЛЕТВОРИТЕЛЬНО"));
        TablesString ts4 = new TablesString("Экономика", 100, MarkState.valueOfString("ЗАЧТЕНО"));
        stringList.add(ts);
        stringList.add(ts2);
        stringList.add(ts3);
        stringList.add(ts4);
        stringList.add(ts5);
        stringList.add(ts6);
        ref.setTablesString(stringList);
        Map<MarkState, List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("ЯМПы");
        list.add("Алгем");
        List<String> list1 = new ArrayList<>();
        list1.add("Тервер");
        list1.add("Матан");
        List<String> list2 = new ArrayList<>();
        list2.add("Дифуры");
        List<String> list3 = new ArrayList<>();
        list3.add("Экономика");
        map.put(MarkState.valueOfString("ОТЛИЧНО"), list);
        map.put(MarkState.valueOfString("ХОРОШО"), list1);
        map.put(MarkState.valueOfString("УДОВЛЕТВОРИТЕЛЬНО"), list2);
        map.put(MarkState.valueOfString("ЗАЧТЕНО"), list3);
        Assert.assertEquals(map, service.disciplineByRating(ref));
    }
}
