package oil.stone.lv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PreOrderTest {

////    List<Integer> result = new ArrayList<Integer>();
//
//    public static void main(String[] args) {
//        Integer[] data = {0, null, 1, 2};
//        TreeNode[] tree = new TreeNode[4];
////        if(){
//            ArrayList<Integer> result = new ArrayList<>();
////        }
//        for (int i = 0; i < 4; i++) {
//            //赋值左子树
//            tree[i] = new TreeNode();
//            if (i * 2 + 1 < 4) {
//                tree[i].left = new TreeNode(data[i * 2 + 1]);
//            }
//            //赋值右子树
//            if (i * 2 + 2 < 4) {
//                tree[i].right = new TreeNode(data[i * 2 + 2]);
//            }
//            System.out.println(new PreOrderTest().preorderTraversal(tree[0]));
//        }
//    }
//
//    public List<Integer> preorderTraversal(TreeNode root) {
//        System.out.println("本结点的值为：" + root.val);
//        if(root.val != null){
//            result.add(root.val);
//        }
//        TreeNode leftTree = root.left;
//        if(leftTree != null){
//            preorderTraversal(leftTree);
//        }
//        TreeNode rightTree = root.right;
//        if(rightTree != null){
//            preorderTraversal(rightTree);
//        }
//        return result;
//    }
//
//
//    static class TreeNode{
//        Integer val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode(){
//        }
//
//        TreeNode(Integer val){
//            this.val = val;
//        }
//    }
}
