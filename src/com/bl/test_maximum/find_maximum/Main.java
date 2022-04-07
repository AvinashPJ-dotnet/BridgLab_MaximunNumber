package com.bl.test_maximum.find_maximum;

public class Main {
    public static void main(String[] args) {
        Integer max=testMaximumNumber(9, 3, 6);
        System.out.println("maximum number is: "+max);
    }

    private static Integer testMaximumNumber(Integer first, Integer second, Integer third) {
        Integer max = first;
        if(second.compareTo(max)>0)
            max=second;
        if(third.compareTo(max)>0)
            max=third;
        return max;
    }
}
