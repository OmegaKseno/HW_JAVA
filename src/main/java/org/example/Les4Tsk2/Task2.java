package org.example.Les4Tsk2;

import java.util.Stack;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("{}()[]");
        System.out.println(isValid("{}()[]"));
        System.out.print("{)");
        System.out.println(isValid("{)"));
        System.out.print("[[[]");
        System.out.println(isValid("[[[]"));
        System.out.print("({[]})");
        System.out.println(isValid("({[]})"));
        System.out.print("()");
        System.out.println(isValid("()"));
        System.out.print("({})[]");
        System.out.println(isValid("({})[]"));
    }

    public static boolean isValid(String st) {
        String []array = st.split("");
        Stack<String> stk = new Stack<>();
        for (String s : array) {
            if(s.equals("{") || s.equals("(") || s.equals("[")) {
                stk.push(s);
            }
            else {
                if (!stk.isEmpty()&&s.equals(")")&&stk.peek().equals("(")){
                    stk.pop();
                }
                else if(!stk.isEmpty()&&s.equals("]")&&stk.peek().equals("[")){
                    stk.pop();
                }
                else if(!stk.isEmpty()&&s.equals("}")&&stk.peek().equals("{")){
                    stk.pop();
                }
                else {
                    return false;
                }
            }
        }
        if(stk.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
