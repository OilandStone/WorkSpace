package oil.array;

/*
 *  力扣747
 *  至少是其他数字两倍的最大数
 *  方法 :
 *  声明两个变量----
 *    1> 当前最大数索引(所有数字中的最大数)
 *    2> 当前最大数索引(大于等于所有其他数两倍)
 *  (具体逻辑见循环)
 *  Author: oil
 *  Date : 2020.1.8
 *  逻辑有些绕,但是只需要遍历一次,效率高
 * */

public class DominantIndex {

    public static int dominantIndex(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int max = 0;
        int dominant = 0;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[max] == nums[i])
                continue;

            if(nums[max] > nums[i]) {
                if (nums[max] < nums[i] * 2)
                    dominant = -1;
            }else{
                if(nums[i] >= nums[max] * 2)
                    dominant = i;
                else
                    dominant = -1;
                max = i;
            }
        }
        return dominant;
    }

    public static void main(String[] args){
        int[] a = {1,2,5,3};
        System.out.println(dominantIndex(a));

    }
}
