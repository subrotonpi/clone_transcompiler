import java.io.IOException;
import java.util.Arrays;
import java.util.NoSuchElementException;

 
public class Main{

	
	public static void main(String args[])throws Exception{
		FastScanner sc = new FastScanner();
		
		int N = sc.nextInt();
		
		int[] a = new int[N];

		for(int i=0;i<N;i++){
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		int low = a[0];
		if(a[N-1]>low+1){
			System.out.println("No");
			return;
		}
		
		int lower = 0;
		for(int i=0;i<N;i++){
			if(a[i]==low){
				lower++;
			}
		}
		int higher = N - lower;
		if(higher==1){
			System.out.println("No");
			return;
		}
		if(higher==0){
			if(low==N-1||low<=N/2){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}else{
			
		
		int max = lower + (higher/2);
		int min = lower+1;
		if(min<=low+1&&low+1<=max){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		}
	}
	

	
}









class FastScanner {
    private final java.io.InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public int nextInt() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return (int) (minus ? -n : n);
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
}