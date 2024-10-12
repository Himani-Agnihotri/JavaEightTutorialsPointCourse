import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java7VersusJava8Example2 {
    public static void main(String args[]){

        List<String> names = Arrays.asList("Sam","himani","himani");

        //Before
        List<String> uniqueList=new ArrayList<>();
        for(String name: names){
            if(!uniqueList.contains(name)){
                uniqueList.add(name);
            }
        }
        System.out.println("UNIQUE LIST IS: "+uniqueList);

        //After
        List<String> uniqueValues1=names.stream().distinct().collect(Collectors.toUnmodifiableList());
        System.out.println("UNIQUE LIST IS: "+uniqueValues1);
    }
}
