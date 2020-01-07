package oil.array;


/*
 *  力扣724
 *  寻找数组的中心索引
 *  方法 : 从0开始,从左至右遍历
 *  左边增加,右边减少
 *  Author: oil
 *  Date : 2020.1.8
 * */
public class CentralIndexOfArray {

    public int pivotIndex(int[] nums)
    {
        if(nums.length == 0)
            return -1;

        int index = 0;
        int leftTotal = 0;
        int rightTotal = 0;
        for (int i = 1; i < nums.length; i++){
            rightTotal += nums[i];
        }


        while((index + 1) < nums.length && leftTotal != rightTotal){
//            System.out.println("当前索引为:" + index);
//            System.out.println("left:" + leftTotal);
//            System.out.println("right:" + rightTotal);
            leftTotal += nums[index];
            rightTotal -= nums[index + 1];
            index++;
        }
        if(leftTotal == rightTotal)
            return index;
        else
            return -1;
    }


    public static void main(String[] args){
        CentralIndexOfArray instance = new CentralIndexOfArray();
        int[] nums = {0, -1, -1, -1, -1, -1};
        int index = instance.pivotIndex(nums);
        System.out.println("中心索引为:" + index);
    }
}
