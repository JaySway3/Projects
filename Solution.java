package code;

import java.util.*;

public class Solution{

	// To print the elements of the stack
	public static void Print(Stack s)
	{

		// If stack is empty
		// Base condition
		if (s.isEmpty())
		return;

		// To store the top element of the stack
		int t = s.peek();

		// Pop the top element
		s.pop();

		// Print the variable 't'
		System.out.print(t + " ");

		// Print the remaining stack
		Print(s);

		// Push the element back to restore the stack
		s.push(t);
	}

	// Main function
	public static void main(String[] args)
	{
		Stack s = new Stack();

		// Given stack s
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);

		// Recursive Function call
		Print(s);
	}
}