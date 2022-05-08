package com.company.bst;

public class Node {
    int key;
    public Node left;
    public Node right;

    public Node(int data) {
        key = data;
        left = right = null;
    }
}
