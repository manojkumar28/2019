package com.hcl.lamda.use.sol;

import java.util.function.BiFunction;
import java.util.function.Function;

public class TestMain {
public static void main(String[] args) {
	
	/*BiFunction<BiFunction, Double, Double> factHelper =(f, x) -> (x == 0) ? 1.0 : x*(double)f.apply(f,x-1);
	Function<Double, Double> fact =x -> factHelper.apply(factHelper, x);
    System.out.println(fact.apply(4.5));
    */
    
    /*
    Function<Double, Double> fact1 = x -> {
        BiFunction<BiFunction, Double, Double> factHelper1 =
            (f, d) -> (d == 0) ? 1.0 : d*(double)f.apply(f,d-1);
        return factHelper1.apply(factHelper1, x);
    };
    System.out.println(fact1.apply(4.5));*/
    
    
    //factorial using function interface
    Function<Integer, Double> fact =Recursable.recurse(
    	    (i, f) -> 0 == i ? 1 : i * f.apply(i - 1, f));
    System.out.println(fact.apply(4));
}
}
