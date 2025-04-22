package Collections;

import java.util.Stack;

public class StackSample {

    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<>();

        stack.push("Newly Added");

        stack.addFirst("Start \t");
        for(int i=1;i<=10;i++)
        {
            stack.add(i,"Hello "+i+"\t");
        }
        stack.addLast("End \t");
        stack.add(6,"InsertAt 2");

        // Pushing five Elements
        for(int i=1;i<=5;i++)
            stack.push("Hi");

        // Popping five elements
        for(int i=1;i<=5;i++)
            stack.pop();

        //Allows null Values
        stack.push(null);

        for (String s : stack)
            System.out.println(s);

        System.out.println("This is stack peek: "+ stack.peek());

        String inputStr ="This is vishvas Trikutkar";
        Stack<Character> charStack = new Stack<>();
        for(char c:inputStr.toCharArray()) {
            charStack.push(c);
        }
        System.out.println(inputStr);
        while (!charStack.empty())
        {
            System.out.print(charStack.pop());
        }

    }
}
