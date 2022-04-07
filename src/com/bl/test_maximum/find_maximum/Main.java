package com.bl.test_maximum.find_maximum;

public class Main {
    public static void main(String[] args) {
        Integer maxInt= testMaximum(9, 3, 6);
        Float maxFloat= testMaximum(9.4f, 3.5f, 9.9f);
        String maxString= testMaximum("Apple"  , "Peach", "Banana");
        System.out.println("maximum integer is: "+maxInt);
        System.out.println("maximum float is: "+maxFloat);
        System.out.println("maximum String is: "+maxString);
    }

    private static Integer testMaximum(Integer first, Integer second, Integer third) {
        Integer max = first;
        if(second.compareTo(max)>0)
            max=second;
        if(third.compareTo(max)>0)
            max=third;
        return max;
    }

    private static Float testMaximum(Float first, Float second, Float third) {
        Float max = first;
        if(second.compareTo(max)>0)
            max=second;
        if(third.compareTo(max)>0)
            max=third;
        return max;
    }

    private static String testMaximum(String first, String second, String third) {
        String max = first;
        if(second.compareTo(max)>0)
            max=second;
        if(third.compareTo(max)>0)
            max=third;
        return max;
    }
}
