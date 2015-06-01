package com.kenvifire;

/**
 * Created by hannahzhang on 15/6/1.
 */
public class TailCalls {

    public static <T> TailCall<T> call(final TailCall<T> nextCall){
        return nextCall;
    }

    public static <T> TailCall<T> done(final TailCall<T> T value){
        return new TailCall<T>() {

            @Override
            public boolean isComplete() {
                return true;
            }

            @Override
            public TailCall<T> apply() {
                throw new Error("not implemented");
            }

            @Override
            public T result() {
                return value;
            }
        };
    }
}
