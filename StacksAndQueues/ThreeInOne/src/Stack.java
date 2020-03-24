
// implementing generic stack class for three stacks with a simple array
public class Stack<E> {
    Object[] stack;
    int numOfStacks = 3;
    int start;
    int end;

    public Stack(int stackSize) {
        stack = new Object[stackSize];
        start = 0;
        end = stack.length-1;
    }


    // common stack operations:
    // pop()
    // push(item)
    // peek
    // isEmpty()

    public void push(int stackNumber, int value) {

    }

    public <T> T pop(int stackNumber) {

    }

    public static void main(String[] args) {

    }

}
