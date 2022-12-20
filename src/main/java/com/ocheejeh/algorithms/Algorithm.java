package com.ocheejeh.algorithms;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;

import java.util.Stack;

public class Algorithm {


    public String matchingBrackets(String brackets){
        String[] input = brackets.split("");
        if(brackets.contains("[") || brackets.contains("]")){
            int plus = 0;
            int neg = 0;
            for (String s : input) {
                if (s.equals("[")) plus++;
                if (s.equals("]")) neg++;
            }
            if(plus != neg) return "invalid";
        }

        if(brackets.contains("(") || brackets.contains(")")){
            int plus = 0;
            int neg = 0;
            for (String s : input) {
                if (s.equals("(")) plus++;
                if (s.equals(")")) neg++;
            }
            if(plus != neg) return "invalid";
        }

        if(brackets.contains("{") || brackets.contains("}")){
            int plus = 0;
            int neg = 0;
            for (String s : input) {
                if (s.equals("{")) plus++;
                if (s.equals("}")) neg++;
            }
            if(plus != neg) return "invalid";
        }

        return "valid";
    }


    public String matchingBracketsStack(String s) {
        if(s.isEmpty() || s.length() % 2 != 0) return "invalid";
        Stack<Character> characterStack = new Stack<>();
        for (char ch: s.toCharArray()) {
            if(ch == '{' || ch == '[' || ch == '('){
                characterStack.addElement(ch);
            } else if (!characterStack.empty() && (
                       characterStack.peek() == '{' && ch == '}' ||
                       characterStack.peek() == '(' && ch == ')' ||
                       characterStack.peek() == '[' && ch == ']')
            ){
                characterStack.pop();
            } else return "invalid";
        }
        if(characterStack.empty()) return "valid";
        return "invalid";
    }

    public void testTree(){
        BinaryTree binaryTree = new BinaryTree() {
            @Override
            public ExpressionTree getLeftOperand() {
                return null;
            }

            @Override
            public ExpressionTree getRightOperand() {
                return null;
            }

            @Override
            public Kind getKind() {
                return null;
            }

            @Override
            public <R, D> R accept(TreeVisitor<R, D> visitor, D data) {
                return null;
            }
        };

    }

}
