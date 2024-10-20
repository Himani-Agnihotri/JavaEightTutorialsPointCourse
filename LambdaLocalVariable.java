import java.util.function.Consumer;

public class LambdaLocalVariable {
    String x ="Hello";
    static int k=0;
    public static void main(String args[]){
        int i=10;
        Consumer<Integer> c1 = (j) -> {
            //i++;
            k=25;
            System.out.println("Value is: "+k);
            System.out.println("Value is: "+(i+j));
        };
        c1.accept(15);
        System.out.println("Value is: "+k);
    }
}
