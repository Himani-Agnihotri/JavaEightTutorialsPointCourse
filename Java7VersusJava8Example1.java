import java.util.stream.IntStream;

public class Java7VersusJava8Example1 {
    public static void main(String args[]){
        //Before
        int total=0;
        for(int i=0;i<=50;i++){
            total+=i;
        }
        System.out.println("TOTAL IS: "+total);

        //After
        int total1= IntStream.rangeClosed(0,50).
                map(Integer::new)
                .sum();
        System.out.println("TOTAL IS: "+total1);
    }
}
