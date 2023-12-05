/*
 * ??????????????????????????????????????? n ??????????????
 * ????????????????????????????????????????????????????????????????????????
 * 
 * ????????????????????????????? 2 ???????????????????????????????????????????????
 * 
 * ??????????????????????? n ??1 ??????????????????????????? c ?????????
 * ???????????????????????????????????????? ????????????????? 1 ? 10 ? 10 ??????????????
 * ??????????????????? 10 ??????? 
 */

import java.util.*;
	public class Main{
		public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // ??
            int n = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            int[][] variation = new int[2][10];
            
            for(int i=0; i<10; i++){
            	variation[0][i] = 0;
            	variation[1][i] = 0;
            }
            
            for(int i=0; i<n; i++){
            	int a = Integer.parseInt(sc.next())-1;
            	variation[i%2][a]++;
            }
           
            int[] max0 = max(variation[0], 10);
            int[] max1 = max(variation[1], 10);
            
            if(max0[1]==max1[1]){
                int[] max20 = max2(variation[0], 10);
                int[] max21 = max2(variation[1], 10);
                
                // ??
                if((n+1)/2 - max20[0] + n/2 - max1[0]<(n+1)/2 - max0[0] + n/2 - max21[0]){
                	System.out.println(((n+1)/2 - max20[0] + n/2 - max1[0]) * c);
                }else{
                	System.out.println(((n+1)/2 - max0[0] + n/2 - max21[0]) * c);
                }
            }else{
            	// ??
            	System.out.println(((n+1)/2 - max0[0] + n/2 - max1[0]) * c);
            }
            
            sc.close();
        }
		public static int[] max(int[] a, int n){
			int[] ret = new int[2];
			ret[0] = a[0];
			ret[1] = 0;
			for(int i=1; i<n; i++){
				if(ret[0]<a[i]){
					ret[0] = a[i];
					ret[1] = i;
				}
			}
			return ret;
        }
		
		public static int[] max2(int[] a, int n){
			int[] temp = new int[2];
			int[] ret = new int[2];
			if(a[0]<a[1]){
				temp[0] = a[1];
				temp[1] = 1;
				
				ret[0] = a[0];
				ret[1] = 0;
			}else{
				temp[0] = a[0];
				temp[1] = 0;
				
				ret[0] = a[1];
				ret[1] = 1;
			}

			for(int i=2; i<n; i++){
				if(temp[0]<a[i]){
					ret[0] = temp[0];
					ret[1] = temp[1];
					temp[0] = a[i];
					temp[1] = i;
				}else if(ret[0]<a[i]){
					ret[0] = a[i];
					ret[1] = i;
				}
			}
			return ret;
        }
    }