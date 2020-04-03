package com.company.generics;

/**
 * @author lobachev.nikolay
 */

public interface GenericCalc <E extends Number>{
    E getSum(E first, E second);
    E getSub(E first, E second);
    E getMult(E first, E second);
    E getDiv(E first, E second);
}
