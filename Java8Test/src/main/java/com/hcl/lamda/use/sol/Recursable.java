package com.hcl.lamda.use.sol;

import java.util.function.Function;
@FunctionalInterface
public interface Recursable<T, U> {
    U apply(T t, Recursable<T, U> r);
    
    public static <T, U>Function<T, U> recurse(Recursable<T, U> f) {
        return t -> f.apply(t, f);
    }
}


