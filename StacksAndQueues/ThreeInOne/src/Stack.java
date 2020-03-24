
// implementing three stacks with a simple array
public class Stack {
    int[] stack;
    int numOfStacks = 3;
    int start;
    int end;

    public Stack(int stackSize) {
        stack = new int[stackSize];
        start = 0;
        end = stack.length-1;
    }


    // common stack operations:
    // pop()
    // push(item)
    // peek
    // isEmpty()

    public static void main(String[] args) {

    }

}
