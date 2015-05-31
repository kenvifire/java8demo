package com.kenvifire;

/**
 * Created by hannahzhang on 15/5/31.
 */
@FunctionalInterface
public interface UseInstance<T, X extends Throwable> {
    void accept(T instance) throws X;

}
