package org.example;

import java.util.Iterator;
import java.util.LinkedList;

public class StackLinkedList {
    private LinkedList<Employee> stack = new LinkedList<Employee>();

    public void push(Employee employee){
      stack.push(employee);
    }

    public Employee pop(){
        return stack.pop();
    }

    public Employee peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void printStack(){
        Iterator<Employee> itr = stack.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
