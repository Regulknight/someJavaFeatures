package com.company.bintree;

/**
 * @author lobachev.nikolay
 */
public class BinTreeMain {

    public static void main(String[] args) {
        BinTree tree = new BinTree(Integer::compareTo, 10);
        tree.add(15);
        tree.add(12);
        tree.add(7);
        tree.add(4);
        tree.add(23);
        tree.add(1);
        System.out.println(tree.getSumOfAllElements());
    }
}
