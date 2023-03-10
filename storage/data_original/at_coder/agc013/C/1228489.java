import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		long L = sc.nextLong();
		long T = sc.nextLong();
		int[] x = new int[N];
		boolean[] w = new boolean[N];
		ArrayList<Integer> cw = new ArrayList<>();
		ArrayList<Integer> ccw = new ArrayList<>();
		for(int i=0; i<N; i++) {
			x[i] = sc.nextInt();
			w[i] = sc.nextInt()==1;
			if(w[i])
				cw.add(x[i]);
			else
				ccw.add(x[i]);
		}
		Collections.reverse(cw);
		
		if(cw.size()==0 || ccw.size()==0) {
			for(int i=0; i<N; i++) {
				pw.println((x[i]+(w[i]? T%L : L-(T%L)))%L);
			}
		} else {
			long t=0;
			boolean dirCW = true;
			int cwIdx=0;
			int ccwIdx=0;
			int lane1 = -1, lane2 = -1;
			boolean dir1=false;
			while(t<2*L) {
				if(cwIdx==0 && ccwIdx==0) {
					t += (ccw.get(0)-cw.get(0)+L) % L;
					cwIdx++;
					ccwIdx++;
				} else if(dirCW) {
					int next = ccw.get(ccwIdx%ccw.size()) - ccw.get((ccwIdx-1)%ccw.size());
					if(next<=0)
						next += L;
					t += next;
					ccwIdx++;
				} else {
					int next = cw.get((cwIdx-1)%cw.size()) - cw.get(cwIdx%cw.size());
					if(next<=0)
						next += L;
					t += next;
					cwIdx++;
				}
				if(lane1==-1 && t>=2*(T%L)) {
					lane1 = dirCW ? cw.get((cwIdx-1)%cw.size()) : ccw.get((ccwIdx-1)%ccw.size());
					dir1 = dirCW;
				}
				if(lane2==-1 && t>=2*L) {
					lane2 = dirCW ? cw.get((cwIdx-1)%cw.size()) : ccw.get((ccwIdx-1)%ccw.size());
				}
				dirCW ^= true;
			}
			int gap2 = Arrays.binarySearch(x, lane2) - Arrays.binarySearch(x, cw.get(0));
			
			int[] pos = new int[N];
			for(int i=0; i<N; i++)
				pos[i] = (int)((x[i]+(w[i]? T%L : L-(T%L)))%L);
			Arrays.sort(pos);
			
			lane1 = (int)((lane1 + (dir1 ? T : L-(T%L)))%L);
			int idx = Arrays.binarySearch(pos, lane1);
			if(idx<N-1 && pos[idx]==pos[idx+1] && !dir1)
				idx++;
			idx = (idx - Arrays.binarySearch(x, cw.get(0)) + N)%N;
			idx = (int)((idx + ((long)gap2+N)*(T/L))%N);
			
			
			long cnt = 0;
			for(int ccwx : ccw) {
				long dis = (ccwx-cw.get(0)+L)%L;
				cnt = (cnt + (2*T + L-dis)/L)%N;
			}
			
			int cidx = (Arrays.binarySearch(pos, (int)((cw.get(0)+T)%L)) - Arrays.binarySearch(x, cw.get(0)) - (int)cnt + N + N)%N;
			
			for(int i=0; i<N; i++)
				pw.println(pos[(cidx+i)%N]);
		}
		
		sc.close();
		pw.close();
	}
}