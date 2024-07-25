import java.util.*;
/*
 I have done it without using 2 stacks. However,
 Using 2 stacks will in turn make it a queue since
 inserting elements into stack S1 removining and inserting same
 elements into stack 2. So, now
 stack 2 will be similar to queue. as the top of stack will contain the
 first element we inserted(stack 1).
*/
class MyQueue {
    int top;
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public MyQueue() {
    }

    public void push(int x) {
        if (s1.empty())
            top = x;

        while (!s1.isEmpty())
            s2.push(s1.pop());
        s2.push(x);
//        System.out.println(s2+" s2 Push" + s1);
        while (!s2.isEmpty())
            s1.push(s2.pop());
//        System.out.println(s1+" s2 Push" + s2);
    }

    public int pop() {
//        while ( queue.size() > 1){
//            top = queue.remove(queue.size()-1);
//        }

        top = s1.pop();
        return top;
    }

    public int peek() {

        return s1.peek();
    }

    public boolean empty() {
        return s1.empty();
    }

    public void print(){
        System.out.println(s1+" s1 Queue");
        System.out.println(s2+" s2 Queue");
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
public class Main {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(12);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.print();
        int param_2 = obj.pop();
        System.out.println(param_2+ " Pop First Element");
        int param_3 = obj.peek();
        System.out.println(param_3+ " Peek First Element");
        boolean param_4 = obj.empty();
        System.out.println(param_4);
        obj.print();
    }
}