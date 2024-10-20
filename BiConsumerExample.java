import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerExample {
    public static void main(String args[]){
        /*Consumer<String> con1 = (s)->{System.out.print(s.toUpperCase());};
        BiConsumer<Integer, Integer> con1 = (a,b) -> System.out.println("ADD: "+(a+b));
        con1.accept(4,5);

        List<Integer> list1= Arrays.asList(new Integer(10),new Integer(20),new Integer(30));
        List<Integer> list2= Arrays.asList(new Integer(20),new Integer(30));
        BiConsumer<List<Integer>,List<Integer>> con2 = (l1,l2) ->{
          if(l1.size()==l2.size()) System.out.println("TRUE");
          else System.out.println("FALSE");
        };

        con2.accept(list1,list2);*/
        BiConsumer<Integer, Integer> addConsumer = (a,b) -> System.out.println("ADD: "+(a+b));
        BiConsumer<Integer, Integer> subConsumer = (a,b) -> System.out.println("SUB: "+(a-b));
        BiConsumer<Integer, Integer> mulConsumer = (a,b) -> System.out.println("SUB: "+(a*b));
        addConsumer.accept(4,5);
    }
}
