/*
* @Author Silviase(@silviasetitech)
* For ProCon
*/

import java.util.*;
import java.lang.*;
import java.math.*;

class Main{

        

        // for dfs
        static int n;
        static int ansi;
        static int[] w;
        static int[] ww;
        static boolean[] isvisited;
        //
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            
        int n = sc.nextInt();
        int[] timefornext = new int[n-1];
        int[] kankaku = new int[n-1];
        int[] kaitsu = new int[n-1];
        int time = 0;
        for (int i = 0; i < n-1; i++) {
            timefornext[i] = sc.nextInt();
            kaitsu[i] = sc.nextInt();
            kankaku[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            time = 0;
            for (int j = i; j < n-1; j++) {
                if (time < kaitsu[j]) {
                    time  = kaitsu[j];
                }else if(time % kankaku[j] == 0){

                }else{
                    time = time/kankaku[j]*kankaku[j]+kankaku[j];
                }
                time+= timefornext[j];
            }
            System.out.println(time);
        }
        

        


        sc.close();
    }


        public static int gcd_int(int a, int b) {
        
            if (a < b) {
                int tmpp = a;
                a = b;
                b = tmpp;
            }
            if (b == 0) {
                return a;
            }else{
                return gcd_int(b, a%b);
            }
        } 

        public static long gcd_long(long a, long b) {
        
            if (a < b) {
                long tmpp = a;
                a = b;
                b = tmpp;
            }
            if (b == 0) {
                return a;
            }else{
                return gcd_long(b, a%b);
            }
        }

        public static int lcm_int(int a, int b) {
            int gcd = gcd_int(a,b);
            return a/gcd*b;
        }

        public static long lcm_long(long a, long b) {
            long gcd = gcd_long(a,b);
            return a/gcd*b;
        }

        public static void dfs(int placenow) {
            // if went all -> success! 
            // if not went all -> fail...
            
            /*
            dfs    
            Go All Place that there is way to and not having been yet. 

             if island 1 is start point, dfs(1);
            if there is way to island 2 and island 3,
            - island 2 changes non-visited -> visited, and dfs(2).
            - island 3 changes non-visited -> visited, and dfs(3).
    
            */

            isvisited[placenow] = true;
            boolean success = true;
            for (int i = 0; i < n; i++) {
                if (isvisited[i] == false) { // not go all place
                    success = false;
                    break;
                }
            }
            if (success) {
                ansi++;
                isvisited[placenow] = false;
                return;
            }

            for (int i = 0; i < n; i++) {
                if (w[i] == placenow && isvisited[ww[i]] == false ) {
                    dfs(ww[i]);
                }else if(ww[i] == placenow && isvisited[w[i]] == false){
                    dfs(w[i]);
                }else{
                    continue;
                }
            }
            isvisited[placenow] = false;
            return;
        }

}