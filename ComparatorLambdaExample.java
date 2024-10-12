import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String args[]){
       //Before
        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(c1.compare(10,20));

        //After
        Comparator<Integer> c2=(Integer x, Integer y)-> x.compareTo(y);
        System.out.println(c1.compare(10,10));

        //After
        Comparator<Integer> c3=(x,y)-> x.compareTo(y);
        System.out.println(c3.compare(110,10));

    }
}
