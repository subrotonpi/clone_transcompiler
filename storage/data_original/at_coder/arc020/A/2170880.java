/*
 * ??? Ant ??? Bug ???????????????????????????????????????? 2 ????????????
 * ????? 1 ????????? ?1,000 ?? 1,000?????????????????
 * 
 * ??? 2???????? 1 ????????????2 ????????????????????????
 * ???????????????? 0 ??????????????????????????????????2 ???? 0?????????????????????????
 * 
 * Ant ??? Bug ???????2??????????????????????????????????????????????? 
 */

import java.util.*;
	public class Main{
		public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // ??
            int a = Math.abs(Integer.parseInt(sc.next()));
            int b = Math.abs(Integer.parseInt(sc.next()));
            
            // ??
            if(a<b){
            	System.out.println("Ant");
            }else if(a>b){
            	System.out.println("Bug");
            }else{
            	System.out.println("Draw");
            }
            sc.close();
        }
    }