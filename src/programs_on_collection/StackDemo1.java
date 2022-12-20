package programs_on_collection;

import java.util.Stack;

public class StackDemo1 {

	// Design method which return stack object
	public Stack getStackDemo() {
		Stack stack = new Stack();
		stack.add(10);
		stack.add(20);
		stack.add(30);
		return stack;
	}

	public static void main(String[] args) {
		StackDemo1 stackDemo1 = new StackDemo1();
		Stack s = stackDemo1.getStackDemo();
		System.out.println(s);
	}
}