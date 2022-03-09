package com.ocheejeh.algorithms;

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
}
