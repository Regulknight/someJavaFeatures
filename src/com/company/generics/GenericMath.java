package com.company.generics;


public class GenericMath <E extends Number> {
    GenericCalc<E> calc;

    public GenericMath(GenericCalc<E> calc) {
        this.calc = calc;
    }

    public E getSum(E first, E second){
        return calc.getSum(first, second);
    }

    public E getSub(E first, E second){
        return calc.getSub(first, second);
    }

    public E getMult(E first, E second){
        return calc.getMult(first, second);
    }

    public E getDiv(E first, E second){
        return calc.getDiv(first, second);
    }
}
