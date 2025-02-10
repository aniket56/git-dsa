package org.example;

import java.util.EmptyStackException;

public class StackArray {

    private Employee [] stack;
    private int top;

    public StackArray (int capacity){
        stack = new Employee[capacity];
    }

    public void push(Employee employee){
        if(top==stack.length){
            Employee [] newStack = new Employee[2*stack.length];
            System.arraycopy(stack,0,newStack,0,stack.length);
            stack=newStack;
        }
        stack[top++]=employee;
    }

    public Employee pop(){

        if(top==0){
            throw  new EmptyStackException();
        }
        Employee employee = stack[--top];
        stack[top]=null;
        return employee;
    }

    public Employee peek(){
        if(top==0){
            throw  new EmptyStackException();
        }
        return stack[top-1];
    }

    public void printStack(){
        for(int i= top-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}
