package com.zhengry.leetcode.leetcode.dynamicProgramming;

public class _746_min_cost_climbing_stairs {
    
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        if(len == 0 || len == 1) {
            return 0;
        }
        int[] pCost = new int[len];
        pCost[0] = cost[0];
        pCost[1] = cost[1];
        for(int i = 2; i < len; i++) {
            pCost[i] = Math.min(pCost[i - 1], pCost[i - 2]) + cost[i];
        }
        return Math.min(pCost[len - 1], pCost[len - 2]);
    }
    
    public static void main(String[] args) {
        _746_min_cost_climbing_stairs test = new _746_min_cost_climbing_stairs();
        int[] cost = {10, 15, 20};
        System.out.println(test.minCostClimbingStairs(cost));
    }
}
