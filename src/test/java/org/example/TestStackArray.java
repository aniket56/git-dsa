package org.example;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStackArray {

    @Test
    public void testPushPop(){
        StackArray stack = new StackArray(3);
        Employee e1 = new Employee("John","Smith",123);
        Employee e2 = new Employee("Bob","Max",456);
        Employee e3 = new Employee("Tim","Cook",789);

        stack.push(e1);
        stack.push(e2);
        stack.push(e3);

        assertEquals(e3,stack.pop());
        assertEquals(e2,stack.pop());
        assertEquals(e1,stack.pop());
    }


    @Test
    public void testPeek(){
        StackArray stack = new StackArray(3);
        Employee e1 = new Employee("John","Smith",123);
        Employee e2 = new Employee("Bob","Max",456);
        Employee e3 = new Employee("Tim","Cook",789);

        stack.push(e1);
        stack.push(e2);
        stack.push(e3);

        assertEquals(e3,stack.peek());
        assertEquals(e3,stack.peek());

    }
}
