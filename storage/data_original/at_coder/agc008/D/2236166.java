import java.io.*;
import java.util.*;
public class Main {
    //static long mod=1000000007;
    public static void main(String[] args){
        int n=ni();
        int[] x=nia(n);
        
        int[] res=new int[n*n];
        for(int i=0;i<n;i++){
            res[x[i]-1]=i+1;
        }
        
        Integer[] ind=sortedIndex(x);
        
        int k=0;
        for(int i=0;i<n;i++){
            int target=ind[i];
            for(int j=0;j<target;j++){
                while(res[k]>0)k++;
                res[k]=target+1;
            }
        }
        
        k=n*n-1;
        for(int i=n-1;i>=0;i--){
            int target=ind[i];
            for(int j=n-target-1;j>0;j--){
                while(res[k]>0)k--;
                res[k]=target+1;
            }
        }
        boolean bo=true;
        int[] count=new int[n];
        for(int i=0;i<res.length;i++){
            count[res[i]-1]++;
            if(count[res[i]-1] == res[i]){
                if((i+1) != x[res[i]-1])bo=false;
            }
        }
        if(bo){
            pl("Yes");
            for(int i=0;i<n*n;i++) pr(res[i]+(i==(n*n-1)?"\n":" "));
        }else{
            pl("No");
        }
        flush();
        //try{Thread.sleep(20);}catch(Exception e){}
    }
    
    
    
    
    
    
	//static{Runtime.getRuntime().addShutdownHook(new Thread(()->flush()));}
	private static final byte[] buffer = new byte[1024];
	private static int ptr = 0;
	private static int buflen = 0;
	private static boolean hasNextByte() {
		if (ptr < buflen)  return true;
		else{
			ptr = 0;
			try {
				buflen = System.in.read(buffer);
			} catch (IOException e) {e.printStackTrace();}
			if (buflen <= 0)  return false;
		}
		return true;
	}
	private static int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	private static void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	public static boolean hasNext() { skipUnprintable(); return hasNextByte();}
	public static String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		for(int b = readByte();isPrintableChar(b);b = readByte()) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}
	public static int nextInt() {return (int)nextLong();}
	public static long nextLong() {
		if (!hasNext()) throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b)  throw new NumberFormatException();
		while(true){
			if ('0' <= b && b <= '9') n = n * 10 + b-'0';
			else if(b == -1 || !isPrintableChar(b)) return minus ? -n : n;
			else throw new NumberFormatException();
			b = readByte();
		}
	}
	public static long[] nextLongArray(int i){
		long[] result=new long[i];
		for(int j=0;j<i;j++)  result[j]=nextLong();
		return result;
	}
	public static void nextLongArray(long[]... arrays){
		for(int j=0;j<arrays[0].length;j++)
			for(long[] array:arrays) array[j]=nextLong();
	}
	public static int[] nextIntArray(int i){
		int[] result=new int[i];
		for(int j=0;j<i;j++)  result[j]=nextInt();
		return result;
	}
	public static void nextIntArray(int[]... arrays){
		for(int j=0;j<arrays[0].length;j++)
			for(int[] array:arrays)  array[j]=nextInt();
	}
	public static int ni(){return nextInt();}
	public static long nl(){return nextLong();}
	public static int[] nia(int n){return nextIntArray(n);}
	public static long[] nla(int n){return nextLongArray(n);}
	public static String ne(){return next();}
	
	static StringBuilder sb=new StringBuilder();
	public static void flush(){
		System.out.print(sb);
		sb=new StringBuilder();
	}
	public static void pr(Object o){sb.append(o);}
	public static void pl(Object o){sb.append(o).append("\n");}
	public static void pl(){sb.append("\n");}
	public static int[] prefSum(int[] la){
		int[] result=new int[la.length];
		for(int i=0;i<la.length;i++) result[i]=(i==0)?la[i]:result[i-1]+la[i];
		return result;
	}
	public static long[] prefSum(long[] la,long mod){
		long[] result=new long[la.length];
		for(int i=0;i<la.length;i++) result[i]=(i==0)?(la[i]+mod)%mod:(result[i-1]+la[i]+mod)%mod;
		return result;
	}
	public static int lastLowerIndex(long[] array,long lo){return lastLowerOrEqualIndex(array,lo-1);}
	public static int lastLowerOrEqualIndex(long[] array,long lo){
		int res=Arrays.binarySearch(array,lo);
		return res<0?-res-2:res;
	}
	public static long gcd(long a,long b){
		if(a>b)a%=b;
		while(a>0){
			b%=a;
			if(b==0)return a;
			a%=b;
		}
		return b;
	}
	public static long modPow(long a,long b,long mod){
		long c=1;
		while(b>0){
			if(b%2==1)  c=(c*a)%mod;
			a=(a*a)%mod;
			b/=2;
		}
		return c;
	}
	public static long inv(long a,long mod){
		long b=mod;
		long p = 1, q = 0;
		while (b > 0) {
			long c = a / b;
			long d=a;
			a = b;
			b = d % b;
			d = p;
			p = q;
			q = d - c * q;
		}
		return p < 0 ? p + mod : p;
	}
	static long time=0;
	public static void time(){
		if(time==0) time=System.nanoTime();
		else{
			long t=System.nanoTime();
			pl((t-time)/1000000000.0+"sec");
			time=t;
		}
	}
	public static Integer[] sortedIndex(int[] a){
            Integer[] res=new Integer[a.length];
            for(int i=0;i<a.length;i++)	res[i]=i;
            mergesortIndex(res,a,0,a.length);
            return res;
        }
        private static Integer[] stem=new Integer[200005];
        private static void mergesortIndex(Integer[] index,int[] a, int s, int e){//uwi's
            if(e - s <= 1)return;
            int h = s+e>>1;
            mergesortIndex(index,a, s, h);
            mergesortIndex(index,a, h, e);
            int p = 0;
            int i= s, j = h;
            for(;i < h && j < e;)stem[p++] = a[(int)index[i]] < a[(int)index[j]] ? index[i++] : index[j++];
            while(i < h)stem[p++] = index[i++];
            while(j < e)stem[p++] = index[j++];
            System.arraycopy(stem, 0, index, s, e-s);
        }
}