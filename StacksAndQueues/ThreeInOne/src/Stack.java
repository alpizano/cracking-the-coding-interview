
// implementing generic stack class for three stacks with a simple array
public class Stack<E> {
    Object[] stack;
    int numOfStacks = 3;
    int size;
    int start;
    int end;
    int divisions;
    int s1Pointer;
    int s2Pointer;
    int s3Pointer;

    public Stack(int stackSize) {
        stack = new Object[stackSize];
        start = 0;
        end = stack.length-1;
        size = stack.length;
        divisions = size/numOfStacks;
    }

    // pop()
    // push(item)
    // peek
    // isEmpty()

    public void push(int stackNumber, int value) {
        int lowerLimit;
        int upperLimit;

        if(stackNumber == 1) {
            lowerLimit = start;
            upperLimit = divisions-1;
            s1Pointer = start;

            if(s1Pointer <= upperLimit) {
                stack[s1Pointer] = value;
                s1Pointer++;
            }
            else {
                System.out.println("Stack 1 is too small!");
            }
        }
        else if(stackNumber == 2) {
            lowerLimit = divisions;
            upperLimit = divisions*2-1;
            s2Pointer = divisions;

            if(s2Pointer <= upperLimit) {
                stack[s2Pointer] = value;
                s2Pointer++;
            }
            else {
                System.out.println("Stack 2 is too small!");
            }
        }
        else {
            lowerLimit = divisions*2;
            upperLimit = divisions*3-1;
            s3Pointer = divisions*2;

            if(s3Pointer <= upperLimit) {
                stack[s3Pointer] = value;
                s3Pointer++;
            }
            else {
                System.out.println("Stack 3 is too small!");
            }
        }
    }

    public <T> T pop(int stackNumber) {
        return (T) stack[0];
    }

    public void printStack() {
        for(Object i: stack) {
            System.out.printf("%d ", i);
        }
    }

    public static void main(String[] args) {
        Stack s1 = new Stack(30);
        System.out.println(s1.divisions);

        s1.push(2,55);
        s1.push(1,69)
    }

}
