package com.company.bst;

import java.io.*;

public class BST {
    public static Node node;
    static Node prevNode = null;
    public static Node headNode = null;


    public static void flattenedBSTToSkewed(Node root, int order){

        if(root == null)
        {
            return;
        }

        if(order > 0){
            flattenedBSTToSkewed(root.right, order);
        }
        else {
            flattenedBSTToSkewed(root.left, order);
        }

        Node rightNode = root.right;
        Node leftNode = root.left;

        // check if the root Node of the skewed tree is not defined

        if(headNode == null)
        {
            headNode = root;
            root.left = null;
            prevNode = root;
        }
        else
        {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }

        if(order > 0)
        {
            flattenedBSTToSkewed(leftNode, order);
        }
        else
        {
            flattenedBSTToSkewed(rightNode, order);
        }
    }

    // Function to traverse the right skewed tree using recursion
 public static  void traverseRightSkewed(Node root)
{
    if(root == null)
    {
        return;
    }
    System.out.print(root.key + " ");
    traverseRightSkewed(root.right);
}
}
