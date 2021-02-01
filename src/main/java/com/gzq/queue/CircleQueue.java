package com.gzq.queue;


/**
 * @Auther: gzq
 * @Date: 2021/1/31 - 01 - 31 - 19:39
 * @Description: com.gzq
 */
public class CircleQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] circleQueue;

    public CircleQueue(int maxSize) {
        this.maxSize = maxSize;
        this.front = 0;
        this.rear = 0;
        this.circleQueue = new int[maxSize];
    }

    public boolean isEmpty() {
        if (this.front == this.rear) {
            return true;
        } else
            return false;
    }

    public boolean isFull() {
        if ((this.rear + 1) % maxSize == front) {
            throw new RuntimeException("数组越界");
        } else return false;
    }

    public int queueLen() {
        int len = (this.rear + this.maxSize - this.front) % maxSize;
        return len;
    }

    public void addElem(int num) {
        isFull();
        circleQueue[rear] = num;
        rear++;
    }

    public Integer getElem() {
        if (!isEmpty()) {
            int tmp = front;
            front++;
            return circleQueue[tmp];
        } else return null;
    }

    public void getWholeQueue() {
        for (int i = front; i < front + queueLen(); i++) {
            System.out.println("位置:" + i % maxSize + "当前位置值" + circleQueue[i % maxSize]);
        }
    }

    public static void main(String[] args) {
        CircleQueue circleQueue = new CircleQueue(6);
        circleQueue.addElem(1);
        circleQueue.addElem(2);
        circleQueue.addElem(3);
        circleQueue.addElem(3);
        circleQueue.addElem(3);
        circleQueue.getElem();
        circleQueue.addElem(4);
        circleQueue.getWholeQueue();
        Integer elem = circleQueue.getElem();
        System.out.println(elem);


    }
}


