package com.thoughtworks.tw101.exercises.exercise9;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Node {
    Node left;
    Node right;
    private String name;
    List<String> names = new ArrayList<>();

    public Node(String name) {
        this.name = name;
        left = null;
        right = null;
    }

    public void add(String name) {
        if (left == null) {
            left = new Node(name);
        } else if( right == null){
            right = new Node(name);
        } else {
            if(countNodes(left) <= countNodes(right)){
                left.add(name);
            } else {
                right.add(name);
            }
        }
    }
    private static int countNodes( Node root ) {
        if ( root == null ){
            return 0;
        }else {
            int count = 1;
            count += countNodes(root.left);
            count += countNodes(root.right);
            return count;
        }
    }

    public List<String> names() {
        traverse(this);
        Collections.sort(names);
        return names;
    }


    private void traverse (Node root){
        names.add(root.name);
        if (root.right != null) {
            traverse(root.right);
        }
        if (root.left != null){
            traverse(root.left);
        }
    }
}
