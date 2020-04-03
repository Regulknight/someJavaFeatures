package com.company.bintree;

import java.util.Comparator;

/**
 * @author lobachev.nikolay
 */
public class BinTree {
    private Node root;
    private final Comparator<Integer> comparator;

    public BinTree(Comparator<Integer> comparator, int value) {
        this.comparator = comparator;
        this.root = new Node(value);
    }

    public Node add(Integer value){
        return add(root, value);
    }

    private Node add(Node node, Integer value) {
        if (node == null) {
            return new Node(value);
        }

        int compareResult = comparator.compare(node.getValue(), value);

        if (compareResult < 0) {
            node.setLeftChild(add(node.getLeftChild(), value));
        } else if (compareResult > 0) {
            node.setRightChild(add(node.getRightChild(), value));
        }

        return node;
    }

    public Integer getSumOfAllElements(){
        return getSumOfAllElements(root);
    }

    private Integer getSumOfAllElements(Node node){
        if (node == null) {
            return 0;
        }
        return node.getValue() + getSumOfAllElements(node.getLeftChild()) + getSumOfAllElements(node.getRightChild());
    }
}
