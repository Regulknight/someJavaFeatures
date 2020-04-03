package com.company.squaring;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lobachev.nikolay
 */
public class SquaringMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list = list.stream().map(a -> a*a).collect(Collectors.toList());
        for(Integer number: list){
            System.out.println(number);
        }
    }
}
