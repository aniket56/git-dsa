package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StackArray stack = new StackArray(3);

        stack.push(new Employee("John","Smith",123));
        stack.push(new Employee("Bob","Max",456));
        stack.push(new Employee("Tim","Cook",789));

        stack.printStack();


    }
}
