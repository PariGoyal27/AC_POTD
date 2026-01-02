package day_28;
import java.util.*;
// https://www.geeksforgeeks.org/problems/stack-using-two-queues/1

class myStack {
    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        int size = q.size();
        q.offer(x);
        while(size != 0){
            int popped = q.poll();
            q.offer(popped);
            size--;
        }
    }

    void pop() {
        if(q.isEmpty()) return;
        q.poll();
    }

    int top() {
        if(q.isEmpty()) return -1;
        return q.peek();
    }

    int size() {
        return q.size();
    }
}
public class StackUsingQueue {
    
}
