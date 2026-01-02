package day_24;
//https://www.geeksforgeeks.org/problems/implement-queue-using-array/1
class myQueue {
    int[] arr;
    int front;
    int rear;
    int capacity;

    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        arr = new int[n];
        front = -1;
        rear = -1;
        capacity = n;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return front == -1;
    }

    public boolean isFull() {
        // Check if queue is full
        if(isEmpty()) return false; // in case both are -1
        return (rear-front+1 == capacity); //1 == capacity
    }

    public void enqueue(int x) {
        // Enqueue
        if(isEmpty()){
            front = 0;
        }
        if(isFull()) return;
        arr[++rear] = x;
    }

    public void dequeue() {
        // Dequeue
        if(isEmpty()) return;
        // int val = arr[front];
        //if it is the last element
        if(front == rear){
            front = -1;
            rear = -1;
        }else{
            front++;
        }
        // return val;
    }

    public int getFront() {
        // Get front element
        if(isEmpty()) return -1;
        return arr[front];
    }

    public int getRear() {
        // Get last element
        if(isEmpty()) return -1;
        return arr[rear];
    }
}

