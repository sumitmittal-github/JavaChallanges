package com.sumit;

import java.util.LinkedList;
import java.util.List;

/*
    Problem Statement
    - Implement Stack (LIFO)
    - It should have a method min() which should return the minimum element of stack in O(1)
*/

class MyStack{
    private List<Integer> stack = new LinkedList<>();
    private List<Integer> minStack = new LinkedList<>();

    public void push(Integer element){
        stack.add(element);

        // if minStack was empty then directly add the element
        if(minStack.size()==0)
            minStack.add(element);
        else {
            // add elements in minStack only if the element is less then the last element of minStack
            Integer lastElement = minStack.get(minStack.size()-1);
            if(element <= lastElement)
                minStack.add(element);
        }
    }

    public Integer pop(){
        if(stack.size()==0)
            return null;

        Integer element = stack.remove(stack.size()-1);
        // if removing element is the last element of minStack then pop it from min stack also
        if(minStack.size()>0){
            Integer lastElement = minStack.get(minStack.size()-1);
            if(element == lastElement)
                minStack.remove(minStack.size()-1);
        }
        return element;
    }

    public Integer min(){
        if(minStack.size()==0)
            return null;
        else
            return minStack.get(minStack.size()-1);
    }

    public String toString(){
        return this.stack.toString();
    }
}
public class Program2 {

    public static void main(String[] args) {

        // Example-1 : [5, 1, 2, 3, 2, 4]
        MyStack stack = new MyStack();

        stack.push(5);
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.push(1);
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.push(2);
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.push(3);
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.push(2);
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.push(4);
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.pop();
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.pop();
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.pop();
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.pop();
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.pop();
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.pop();
        System.out.println(stack.toString() + " -> Min : "+stack.min());

        System.out.println("----------------------------");

        // Example-2 : [5, 2, 3, 2, 1, 4]
        stack.push(5);
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.push(2);
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.push(3);
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.push(2);
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.push(1);
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.push(4);
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.pop();
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.pop();
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.pop();
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.pop();
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.pop();
        System.out.println(stack.toString() + " -> Min : "+stack.min());
        stack.pop();
        System.out.println(stack.toString() + " -> Min : "+stack.min());
    }

}