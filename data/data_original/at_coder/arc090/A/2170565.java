/*
 * 2�N ????????????? i ?????? j ?? (1?i?2, 1?j?N) ?????? (i,j) ??????????
 * 
 * ????????????? (1,1) ????? ????????????????????????????? (2,N) ?????????????
 * 
 * ?? (i,j) ?? Ai,j ????????????? ??????????????????????????????? 
 * ????????????????????????????????????????????????
 * 
 * ??????????????????????????????????
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //??
            int n = Integer.parseInt(sc.next());
            int[][] candies = new int[2][n];
            int[][] dp = new int[2][n];
            
            for(int i=0; i<2*n; i++){
            	candies[i/n][i%n] = Integer.parseInt(sc.next());
            }
            dp[0][0] = candies[0][0];
            dp[1][0] = dp[0][0] + candies[1][0];
            for(int i=1; i<n; i++){
            	dp[0][i] = dp[0][i-1] + candies[0][i];
            	dp[1][i] = candies[1][i] + Math.max(dp[0][i], dp[1][i-1]);
            }
            
            //??
            System.out.println(dp[1][n-1]);
            sc.close();
        }
    }