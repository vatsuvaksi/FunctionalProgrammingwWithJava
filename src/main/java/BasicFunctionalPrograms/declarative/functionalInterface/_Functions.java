package BasicFunctionalPrograms.declarative.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Functions {
    public static void main(String[] args) {
        int inc =incrementByOne.apply(21);
//
//        int mul  = mulBy10.apply(inc);

        //This is chaining of functions
       Function<Integer,Integer> addthenmul = incrementByOne.andThen(mulBy10);

   System.out.println(addthenmul.apply(25));
   System.out.println(incThenMul.apply(25,100));
    }
    //functional programming
   static  Function<Integer,Integer> incrementByOne = number -> ++number;

    static Function<Integer,Integer> mulBy10 = number -> number*10;
    //Bi-Functional programming
    static BiFunction<Integer,Integer,Integer> incThenMul = (incBy1,mulBy) -> (++incBy1)*mulBy;

    //normal programming
    static int increment(int x){
        return ++x;
    }
}
