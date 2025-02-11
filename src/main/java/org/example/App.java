package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
            callStackArray();
           // callStakLinkedList();

    }

    public static void callStackArray(){
        StackArray stack = new StackArray(3);
        stack.push(new Employee("John","Smith",123));
        stack.push(new Employee("Bob","Max",456));
        stack.push(new Employee("Tim","Cook",789));
        stack.printStack();
    }

    public static void callStakLinkedList(){
    StackLinkedList stack = new StackLinkedList();
    stack.push(new Employee("John","Smith",123));
    stack.push(new Employee("Bob","Max",456));
    stack.push(new Employee("Tim","Cook",789));

    stack.printStack();
    System.out.println("Pooped:: "+ stack.pop());

    }
}
