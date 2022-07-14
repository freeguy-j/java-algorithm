package com.study.leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Number_589 {
    public static void main(String[] args) {
    }

    public static List<Integer> preorder(Node root) {
        List<Integer> answerList = new ArrayList<>();
        recursive(root ,answerList);
        return answerList;
    }

    private static void recursive(Node root, List<Integer> answerList) {
        if (root == null) {
            return;
        }

        answerList.add(root.val);

        for (Node child : root.children) {
            recursive(child, answerList);
        }
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
