package com.zhengry.leetcode.leetcode.dynamicProgramming;

public class _121_best_time_sell_stock {
    public int maxProfit(int[] prices) {
        int max = 0;
        int len = prices.length;
        if(len <= 0) {
            return 0;
        }
        int[] buyPrice = new int[len];
        buyPrice[0] = prices[0];
        for(int i = 1; i < len; i++ ) {
            if(prices[i] < buyPrice[i-1]) {
                buyPrice[i] = prices[i];
            } else {
                buyPrice[i] = buyPrice[i-1];
                max = Math.max(prices[i] - buyPrice[i], max);
            }
            
            
        }
        return max;
    }
    public static void main(String[] args) {
        _121_best_time_sell_stock test = new _121_best_time_sell_stock();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(test.maxProfit(prices));
    }
}
