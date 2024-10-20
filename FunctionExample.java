import java.util.function.Function;

public class FunctionExample {
    static Function<String,String> f1=name->name.toUpperCase();
    static Function<String,String> f2=name->name.toUpperCase().concat("team lead");
    public static void main(String args[]){
        //System.out.println("RESULT "+f1.apply("himani agnihotri"));
        //System.out.println("RESULT "+f2.apply("himani agnihotri"));
        //System.out.println("RESULT "+f1.andThen(f2).apply("BEST "));
        System.out.println("RESULT1 "+f1.compose(f2).apply("himani agnihotri"));
    }
}
