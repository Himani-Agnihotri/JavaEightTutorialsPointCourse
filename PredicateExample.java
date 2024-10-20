import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String args[]){
        Predicate<Integer> lessThan = (a) -> (a>=50);
        Predicate<Integer> greaterThan = (a) -> (a>=50);
        Predicate<Integer> equalTo = (a) -> (a==0);
        boolean result = lessThan.test(6);
        System.out.println("RESULT: "+result);
        System.out.println("GREATER THAN: "+greaterThan.test(150));
        System.out.println("EQUAL TO: "+equalTo.test(0));
        boolean andResult=lessThan.and(greaterThan).and(equalTo).test(100);
        System.out.println("AND RESULT IS: "+andResult);
        boolean orResult=lessThan.or(greaterThan).test(100);
        System.out.println("OR RESULT IS: "+orResult);
        boolean negateResult=lessThan.or(greaterThan).negate().test(100);
        System.out.println("NEGATE RESULT IS: "+negateResult);
    }
}
