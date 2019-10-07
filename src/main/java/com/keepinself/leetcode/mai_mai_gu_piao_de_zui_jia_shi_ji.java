package com.keepinself.leetcode;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 *
 * 注意你不能在买入股票前卖出股票。
 *
 *
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 *
 *
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 *
 */
public class mai_mai_gu_piao_de_zui_jia_shi_ji {
    public static void main(String[] args) {
        int [] prices={7,1,5,3,6,4};
        long start = System.currentTimeMillis();
        int solution = solution2(prices);
        int solution2 = solution(prices);
        long end = System.currentTimeMillis();
        System.out.println(solution);
        System.out.println(solution2);
        System.out.println("执行时间:"+(start-end));
    }

    /**
     * 暴力破解
     * @param prices
     * @return
     */
    public static int solution(int[] prices){
        int length = prices.length;
        int maxPrice=0;

        for (int i = 0; i < length; i++) {
            //遍历当前值后面每个price的利润 如果大于之前的利润就替换掉
            for (int j = i+1; j < length ; j++) {
                int diff = prices[j] - prices[i];
                if(maxPrice < diff){
                    maxPrice = diff;
                }
            }
        }
        return maxPrice;
    }

    /**
     *  动态规划 一次遍历
     * @param prices
     * @return int
     */
    public static int solution2(int[] prices){

        int minPrice = Integer.MAX_VALUE;
        int profits = 0;
        for (int i=0;i<prices.length;i++) {
            if(prices[i]<minPrice){//先判断当前price是不是最低
                minPrice = prices[i];//如果是最低就记录当前值
            }else{
                int diff= prices[i]-minPrice;
                if(profits<diff){//如果利润比之前高就记录当前利润
                    profits=diff;
                }
            }
        }
        return profits;
    }

}
