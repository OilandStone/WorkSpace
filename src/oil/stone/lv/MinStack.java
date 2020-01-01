package oil.stone.lv;

import java.util.Stack;

/*
*   力扣155
*   最小栈
*   方法: 双栈，一栈数据，一栈最小值
*   author: Oil
*   Date: 2019.11.14
* */


public class MinStack {

    public Stack<Integer> dataStack;
    public Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        dataStack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int x) {
        if(dataStack.empty() || minStack.peek() >= x){
            minStack.push(x);
        }
        dataStack.push(x);
    }

    public void pop() {
        if(minStack.peek().equals(dataStack.peek())){
            minStack.pop();
        }
        if(dataStack.size() > 0){
            dataStack.pop();
        }
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args){
         MinStack obj = new MinStack();
         obj.push(512);
         obj.push(-1024);
         obj.push(-1024);
         obj.push(512);
         obj.pop();
         obj.pop();
         obj.pop();
         int param_4 = obj.getMin();

         System.out.println(param_4);

    }
}

/*
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
