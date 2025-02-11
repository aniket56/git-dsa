package org.example;

import java.util.LinkedList;

public class StackPalindrome {

    private LinkedList<Character> stack = new LinkedList<>();

    public boolean palindromeCheck(String str){

        str = str.replaceAll("[^a-zA-Z0-9]", "");

        str.chars().mapToObj(c ->(char)c).forEach(c->stack.push(c));



        return str.chars().mapToObj(c->(char)c).allMatch(c->c.equals(stack.pop()));

    }
}
