package oil.stone.lv;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 *  力扣739
 *  每日温度
 *  方法 : 遍历温度列表
 *         栈,存储未处理的天数
 *  Author: oil
 *  Date : 2020.1.6
 *  (效率略低)
 * */


public class DailyTemperatures {

    public int[] dailyTemperatures(int[] T)
    {
        Stack<Integer> tmpStack = new Stack<Integer>();
        int[] dayArr = new int[T.length];
        for(int i = 0; i < T.length; i++)
        {
            int step = 0;
            while (!tmpStack.empty() && T[i] > T[tmpStack.peek()])
            {
                int index = tmpStack.pop();
                dayArr[index] = i - index;
                step++;
            }
            tmpStack.push(i);
        }
        return dayArr;
    }

    public static void main(String[] args){
        DailyTemperatures dt = new DailyTemperatures();
        int[] ints = {73,74,75,71,69,72,76,73};
        int[] result = dt.dailyTemperatures(ints);
        for(int i : result) {
            System.out.print(i + "  ");
        }
    }

}

