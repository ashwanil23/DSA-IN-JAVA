package com.dsa.lecture.code.stack;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String str){
        ListImplementation stack = new ListImplementation();
        char[] result = str.toCharArray();
        for (char c : result) {
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if (stack.isEmpty()) return false;
                else{
                    char temp = (char) stack.peek();
                    if( c == ')' && temp == '(' || c == '}' && temp == '{' || c == ']' && temp == '[' ){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("[([{()}])"));
        System.out.println(isValid("([{()}])"));
    }
}
