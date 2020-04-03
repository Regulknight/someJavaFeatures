package com.company.generics;

/**
 * @author lobachev.nikolay
 */
public class IntegerCalc implements GenericCalc<Integer> {
    public final static IntegerCalc INSTANCE = new IntegerCalc();

    private IntegerCalc(){}

    @Override
    public Integer getSum(Integer first, Integer second) {
        return first + second;
    }

    @Override
    public Integer getSub(Integer first, Integer second) {
        return first - second;
    }

    @Override
    public Integer getMult(Integer first, Integer second) {
        return first * second;
    }

    @Override
    public Integer getDiv(Integer first, Integer second) {
        return first / second;
    }
}
