package JCF;

import java.util.*;

public class Service {
    public List<String> getLearnedDiscipline (ReferenceAboutTheStudiedDisciplines ref){
        List<String> stringList = new ArrayList<String>();
        for(int i = 0; i < ref.getTablesString().size();i++){
            stringList.add(ref.getTablesString().get(i).getNameDiscipline());
        }
        return stringList;
    }

    public int sumOfAllDisciplines (ReferenceAboutTheStudiedDisciplines ref){
        int sum = 0;
        for(int i = 0; i < ref.getTablesString().size();i++){
            sum+=(ref.getTablesString().get(i).getHard());
        }
        return sum ;
    }
    public double averageRating (ReferenceAboutTheStudiedDisciplines ref){
        double sum = 1;
        for(int i = 0; i < ref.getTablesString().size();i++){
            if(ref.getTablesString().get(i).getRating().equals("удовлетворительно")){
                sum*=3;
            }
            if(ref.getTablesString().get(i).getRating().equals("хорошо")){
                sum*=4;
            }
            if(ref.getTablesString().get(i).getRating().equals("отлично")){
                sum*=5;
            }
        }
        return sum/ref.getTablesString().size() ;
    }
    public Map<String,String> disciplineWithRating (ReferenceAboutTheStudiedDisciplines ref){
        Map<String,String> stringMap = new HashMap<String, String>();

        for(int i = 0; i < ref.getTablesString().size();i++){
            stringMap.put(ref.getTablesString().get(i).getNameDiscipline(),ref.getTablesString().get(i).getRating());
        }
        return stringMap;
    }
    public Map<String, List<String>> disciplineByRating (ReferenceAboutTheStudiedDisciplines ref){
        Map<String,List<String>> stringMap = new HashMap<String, List<String>>();
        List<String> stringList3 = new ArrayList<String>();
        List<String> stringList4 = new ArrayList<String>();
        List<String> stringList5 = new ArrayList<String>();
        List<String> stringListOk = new ArrayList<String>();
        for(int i = 0; i < ref.getTablesString().size();i++) {
            if (ref.getTablesString().get(i).getRating().equals("удовлетворительно")) {
                stringList3.add(ref.getTablesString().get(i).getNameDiscipline());
            }
            if (ref.getTablesString().get(i).getRating().equals("хорошо")) {
                stringList4.add(ref.getTablesString().get(i).getNameDiscipline());
            }
            if (ref.getTablesString().get(i).getRating().equals("отлично")) {
                stringList5.add(ref.getTablesString().get(i).getNameDiscipline());
            }
            if (ref.getTablesString().get(i).getRating().equals("зачтено")) {
                stringListOk.add(ref.getTablesString().get(i).getNameDiscipline());
            }
        }
        stringMap.put("удовлетворительно", stringList3);
        stringMap.put("хорошо", stringList4);
        stringMap.put("отлично", stringList5);
        stringMap.put("зачтено", stringListOk);
        return stringMap;
    }
}
