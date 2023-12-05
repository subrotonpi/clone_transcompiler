import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    static int mod=1000000007;
    public static void main(String[]$) {
        Scanner sc = new Scanner(in);
        //??:???????i?????????????????score[]???????????????????????
        //??i????????????i???????????????0????????????????????????????
        int n=sc.nextInt();
        int m=sc.nextInt();
        long[] score=new long[m+2];
        long sum=0;
        for (int i = 0; i <n; i++) {
            int l=sc.nextInt(),r=sc.nextInt(),s=sc.nextInt();
            score[l]+=s;
            score[r+1]-=s;
            sum+=s;
        }
        for (int i = 1; i <=m; i++) {
            score[i]+=score[i-1];
        }
        long ans=0;
        for (int i = 1; i <=m; i++) {
            ans=max(ans,sum-score[i]);
        }
        out.println(ans);
    }
}