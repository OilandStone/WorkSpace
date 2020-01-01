package oil.stone.lv;

/*
    循环队列实现
    Author: oil
    Date : 2019.10.25
*/

public class MyCircularQueue {

        int[] datas;
        int frontPointer;
        int rearPointer;
        int count;

        /** Initialize your data structure here. Set the size of the queue to be k. */
        public MyCircularQueue(int k) {
            datas = new int[k];
            count = 0;
            frontPointer = -1;
            rearPointer = -1;
        }

        /** Insert an element into the circular queue. Return true if the operation is successful. */
        public boolean enQueue(int value) {
            if (isFull()){
                return false;
            }
            if (frontPointer == -1){
                frontPointer++;
            }
            rearPointer = (rearPointer + 1) % datas.length;
            datas[rearPointer] = value;
            count++;
            return true;
        }

        /** Delete an element from the circular queue. Return true if the operation is successful. */
        public boolean deQueue() {
            if (isEmpty()){
                return false;
            }
            frontPointer = (frontPointer + 1) % datas.length;
            count--;
            return true;
        }

        /** Get the front item from the queue. */
        public int Front() {
            if (isEmpty()){
                return -1;
            }
            return datas[frontPointer];
        }

        /** Get the last item from the queue. */
        public int Rear() {
            if (isEmpty()){
                return -1;
            }
            return datas[rearPointer];
        }

        /** Checks whether the circular queue is empty or not. */
        public boolean isEmpty() {
            if (count == 0) {
                return true;
            }else{
                return false;
            }
        }

        public boolean isFull() {
            if (count == datas.length) {
                return true;
            } else {
                return false;
            }
        }


    public static void main(String[] args){
        MyCircularQueue queue = new MyCircularQueue(5);

    }
}
 /*
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
