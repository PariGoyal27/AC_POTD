package day_26;
//https://leetcode.com/problems/design-circular-queue/

class CircularQueue {
    int[] arr;
    int front;
    int rear;
    int capacity;

    public CircularQueue(int k) {
        arr = new int[k];
        front = -1;
        rear = -1;
        capacity = k;
    }

    public boolean enQueue(int value) {
        if (isFull())
            return false;
        if (front == -1)
            front = 0;
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty())
            return false;

        //If there is a single element left
        if (front == rear) {
            front = rear = -1;
        } else
            front = (front + 1) % capacity;
        return true;
    }

    public int Front() {
        if (front == -1)
            return -1;
        return arr[front];
    }

    public int Rear() {
        if (rear == -1)
            return -1;
        return arr[rear];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }
}
