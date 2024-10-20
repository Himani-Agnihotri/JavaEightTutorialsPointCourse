import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String args[]){
        Consumer<String> con1 = (s)->{System.out.print(s.toUpperCase());};
        //con1.accept("java8");

        Consumer<String> con2 = (s)->{System.out.println(" "+s.toLowerCase());};
        //con2.accept("features");

        con1.andThen(con2).accept("himani");

    }
}
