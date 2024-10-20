import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class BiFunctionExample {
    static BiFunction<String,String,String> f1= (a,b)-> (a+" "+b);
    static Predicate<Person> p1= per->per.getHeight()>=100;
    static Predicate<Person> p2=per->per.getGender().equals("Male");
    static BiFunction<List<Person>,Predicate<Person>,Map<String,Double>> f2 = (listofPersons,predicate)->{
      Map<String,Double> map = new HashMap<>();
      listofPersons.forEach(per->{
          if(p1.and(predicate).test(per)){
              map.put(per.getGender(),per.getSalary());
          }
      });
        return map;
    };
    public static void main(String args[]){
        List<Person> personList =PersonRepository.getAllPersons();
        Map<String,Double> map =f2.apply(personList,p2);
        System.out.println("RESULT: "+map);
    }
}
