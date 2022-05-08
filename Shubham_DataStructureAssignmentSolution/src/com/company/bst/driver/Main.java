package com.company.bst.driver;

import com.company.bst.BST;
import com.company.bst.Node;

import static com.company.bst.BST.*;

public class Main {

    public static void main(String[] args) {

        BST tree = new BST();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.right.left= new Node(55);

        // For Increasing order - 0
        // For Decreasing order - 1

        int order = 0;
        flattenedBSTToSkewed(node, order);
        traverseRightSkewed(headNode);
    }
}
