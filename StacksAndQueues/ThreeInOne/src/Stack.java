
// implementing generic stack class for three stacks with a simple array
public class Stack<E> {
    Object[] stack;
    int numOfStacks = 3;
    int divisions;
    int s1;
    int s1_top;
    int s2;
    int s2_top;
    int s3;
    int s3_top;

    public Stack(int stackSize) {
        stack = new Object[stackSize];
        divisions = stack.length/numOfStacks;
        s1 = 0;
        s1_top = divisions-1;
        s2 = divisions;
        s2_top = divisions*2-1;
        s3 = divisions*2;
        s3_top = stack.length-1;

    }

    // pop()
    // push(item)
    // peek
    // isEmpty()

    public void push(int stackNumber, int value) {
        int lowerLimit;
        int upperLimit;

        if(stackNumber == 1) {
            if(s1 <= s1_top) {
                stack[s1] = value;
                s1++;
            }
            else {
                System.out.println("Stack 1 is too small!");
            }
        }
        else if(stackNumber == 2) {
            if(s2 <= s2_top) {
                stack[s2] = value;
                s2++;
            }
            else {
                System.out.println("Stack 2 is too small!");
            }
        }
        else {
            if(s3 <= s3_top) {
                stack[s3] = value;
                s3++;
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
        s1.push(1,69);

        s1.printStack();
    }

}
