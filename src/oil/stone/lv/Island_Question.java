package oil.stone.lv;

import javafx.util.Pair;

import javax.management.Query;
import java.util.*;

/*
*  力扣200
*  岛屿数量问题
*  方法 : 队列
*  Author: oil
*  Date : 2019.11.05
*  (此写法极其的没有效率)
* */

public class Island_Question {

    int IslandCount = 0;
    Queue<String> root = new LinkedList<>();
    Set<String> used = new HashSet<>();

    public int numIslands(char[][] grid) {
        for(int i = 0; i < grid.length; i++ ){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1' && !used.contains(Integer.toString(i) + " "+ Integer.toString(j))){
                    BorderFind(grid,i,j);
                    IslandCount++;
                }
            }
        }
        return IslandCount;
    }



    public void BorderFind(char[][] rec, int row, int col){
        String pair = Integer.toString(row) + " " +Integer.toString(col);
        root.offer(pair);
        used.add(pair);
        while(!root.isEmpty()) {

            String first = root.poll();
            String[] strs = first.split(" ");
            row = Integer.valueOf(strs[0]);
            col = Integer.valueOf(strs[1]);

            if(rec[row][col] == '1') {
                if (row - 1 >= 0){
                    String pair1 = Integer.toString(row - 1) + " " + Integer.toString(col);
                    if (used.add(pair1))
                    root.offer(pair1);
                }
                if (row + 1 < rec.length){
                    String pair1 = Integer.toString(row + 1) + " " + Integer.toString(col);
                    if (used.add(pair1))
                    root.offer(pair1);
                }
                if (col - 1 >= 0){
                    String pair1 = Integer.toString(row) + " " + Integer.toString(col - 1);
                    if (used.add(pair1))
                    root.offer(pair1);
                }
                if (col + 1 < rec[0].length){
                    String pair1 = Integer.toString(row) + " " + Integer.toString(col + 1);
                    if (used.add(pair1))
                    root.offer(pair1);
                }
            }
        }
    }

    public static void main(String[] args) {

        Island_Question is = new Island_Question();
        char [][] isLand = {{'1', '1', '0', '0', '0'},{'1', '1', '0', '0', '0'},{'0', '0', '1', '0', '0'},{'0', '0', '0', '1', '1'}};
        int count = is.numIslands(isLand);
        System.out.println("一共探索到" + count + "座岛屿");

    }
}
