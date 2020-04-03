package com.company.generics;

/**
 * @author lobachev.nikolay
 */
public class GenericsMain {
    public static void main(String[] args) {
        GenericMath<Integer> math = new GenericMath<>(IntegerCalc.INSTANCE);
        Integer a = 10;
        Integer b = 10;
        System.out.println(math.getSum(a, b));
        System.out.println(math.getSub(a, b));
        System.out.println(math.getMult(a, b));
        System.out.println(math.getDiv(a, b));
    }
}
