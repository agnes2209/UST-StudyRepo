public class TwoStacks {
    int[] arr;
    int top1, top2;
    int size;

    TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = n;
    }

    void push1(int x) {
        if (top1 < top2 - 1) {
            arr[++top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    void push2(int x) {
        if (top1 < top2 - 1) {
            arr[--top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    int pop1() {
        if (top1 >= 0) {
            return arr[top1--];
        }
        System.out.println("Stack Underflow");
        return -1;
    }

    int pop2() {
        if (top2 < size) {
            return arr[top2++];
        }
        System.out.println("Stack Underflow");
        return -1;
    }

    public static void main(StringProblems[] args) {
        TwoStacks ts = new TwoStacks(10);

        ts.push1(10);
        ts.push1(20);
        ts.push2(30);
        ts.push2(40);

        System.out.println("Pop from Stack1: " + ts.pop1());
        System.out.println("Pop from Stack2: " + ts.pop2());
    }
}
 
