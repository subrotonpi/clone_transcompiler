import java.util.*;

public class Main {
	public static void main(String[] args) {
		C();
		return;
	}
	
	public static void A() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(A==B) System.out.println(C);
		else if(B==C) System.out.println(A);
		else System.out.println(B);
	}

	// #????????????????
	// -1?#????? ??O(n)
	//???????????????????O(n)???O(1?
	
	public static void calc8(char[][] cell ,int h, int w) {
		if(cell[h][w] == '#') System.out.print('#');
		else {
			int[] hs = new int[] {h-1,h,h+1};
			int[] ws = new int[] {w-1,w,w+1};
			int sum = 0;
			for(int nh: hs) {
				for(int nw : ws) {
					if(nh<cell.length && nh>=0 && nw >=0 && nw < cell[0].length) {
						if(cell[nh][nw]=='#') sum++;
					}
				}
			}
			System.out.print(sum);
		}
		if(w == cell[0].length-1) System.out.println("");
	}
	
	public static void B() {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] cell = new char[H][W];
		for(int i=0;i<H;i++) {
			String s = sc.next();
			for(int j=0; j<W;j++) {
				cell[i][j] = s.charAt(j);
			}
		}
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				calc8(cell,i,j);
			}
		}
	}
	
	
	//???????????????????
	//????????????
	// ????mat?????i?j????????WFS
	public static boolean connect(int[][] mat, int i, int j) {
		boolean[] visit = new boolean[mat.length];
		LinkedList<Integer> que = new LinkedList<Integer>();
		que.add(i);
		while(!que.isEmpty()) {
			int check = que.removeFirst();
			if(check == j) return true;
			//System.out.println(check + " check");
			visit[check] = true;
			for(int w=0;w<mat.length;w++) {
				if (mat[check][w] == 1 && (!visit[w])) {
					//System.out.println(mat[check][w] + "e");
					que.add(w);
					visit[w] = true;
				}
			}
		}
		return false;
	}
	public static void C() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] mat = new int[N][N];
		int[][] edge = new int[M][2];
		for(int i=0;i<M;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			mat[a][b] = mat[b][a] = 1;
			edge[i] = new int[] {a,b};
		}
		int count = 0;
		for(int i=0;i<M;i++) {
			int a = edge[i][0];
			int b = edge[i][1];
			mat[a][b] = mat[b][a] = 0;
			if(!connect(mat,a,b)) count++;
			mat[a][b] = mat[b][a] = 1;
		}
		System.out.println(count);
	}

}