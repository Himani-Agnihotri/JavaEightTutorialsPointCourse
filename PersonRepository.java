import java.util.Arrays;
import java.util.List;

public class PersonRepository {

    public static List<Person> getAllPersons(){
        Person p1 = new Person("John",165, 2000, "Male", 2, Arrays.asList("Cricket","Swimming","Tennis"));
        Person p2 = new Person("Angel",158, 5000, "Female", 2, Arrays.asList("Cricket","Football"));
        Person p3 = new Person("Dean",140, 5700, "Male", 2, Arrays.asList("Cricket","Music","Tennis"));
        Person p4 = new Person("Nancy",130, 4900, "Female", 2, Arrays.asList("Swimming","Music"));
        Person p5 = new Person("Harper",125, 9000, "Female", 2, Arrays.asList("Cricket","Swimming","Shopping"));
        Person p6 = new Person("Alen",110, 9500, "Male", 2, Arrays.asList("Cricket","Shopping","Tennis"));
        return List.of(p1,p2,p3,p4,p5,p6);
    }

    public static Person getPerson(){
        return new Person("John",165, 2000, "Male", 2, Arrays.asList("Cricket","Swimming","Tennis"));
    }
}
