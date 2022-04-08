package com.bl.test_maximum.find_maximum;

public class Main {

    public static void main(String[] args) {
        MaxGeneric<Integer> mainFirst = new MaxGeneric<>(9, 3, 6);
        MaxGeneric<Float> mainSecond = new MaxGeneric<>(9.4f, 3.5f, 9.9f);
        MaxGeneric<String> mainThird = new MaxGeneric<>("Apple", "Peach", "Banana");
        Integer maxInt = mainFirst.testMaximum();
        Float maxFloat = mainSecond.testMaximum();
        String maxString = mainThird.testMaximum();
        System.out.println("maximum integer is: " + maxInt);
        System.out.println("maximum float is: " + maxFloat);
        System.out.println("maximum String is: " + maxString);
    }
}
