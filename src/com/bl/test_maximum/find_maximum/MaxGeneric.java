package com.bl.test_maximum.find_maximum;

public class MaxGeneric<E extends Comparable<E>> {
    E first;
    E second;
    E third;

    public MaxGeneric(E first, E second, E third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    <E> E testMaximum() {
        return (E) testMaximum(this.first, this.second, this.third);
    }

    // used generic class extends comparable to take any Wrapper class as parameter
    static <E extends Comparable<E>> E testMaximum(E first, E second, E third) {
        E max = first;
        if (second.compareTo(max) > 0)
            max = second;
        if (third.compareTo(max) > 0)
            max = third;
        return max;
    }
}
