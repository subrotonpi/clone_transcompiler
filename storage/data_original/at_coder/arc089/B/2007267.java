import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[][] table = new int[2 * K][];
		for (int i = 0; i < 2 * K; i++) {
			table[i] = new int[2 * K];
		}
		for (int i = 0; i < N; i++) {
			{
				int x = sc.nextInt() % (K * 2);
				int y = sc.nextInt() % (K * 2);
				String c = sc.next();
				if (c.equals("B")) {
					x = (x + K) % (K * 2);
				}
				{
					table[Math.max(x - K, 0)][Math.max(y - K, 0)]++;
					table[x][Math.max(y - K, 0)]--;
					table[Math.max(x - K, 0)][y]--;
					table[x][y]++;
					if (y + K < 2 * K) {
						table[Math.max(x - K, 0)][y + K]++;
						table[x][y + K]--;
					}
					if (x + K < 2 * K) {
						table[x + K][Math.max(y - K, 0)]++;
						table[x + K][y]--;
						if (y + K < 2 * K) {
							table[x + K][y + K]++;
						}
					}
				}
				x = (x + K) % (K * 2);
				y = (y + K) % (K * 2);
				{
					table[Math.max(x - K, 0)][Math.max(y - K, 0)]++;
					table[x][Math.max(y - K, 0)]--;
					table[Math.max(x - K, 0)][y]--;
					table[x][y]++;
					if (y + K < 2 * K) {
						table[Math.max(x - K, 0)][y + K]++;
						table[x][y + K]--;
					}
					if (x + K < 2 * K) {
						table[x + K][Math.max(y - K, 0)]++;
						table[x + K][y]--;
						if (y + K < 2 * K) {
							table[x + K][y + K]++;
						}
					}
				}
			}
		}
		long max = 0L;
		for (int x = 0; x < 2 * K; x++) {
			for (int y = 1; y < 2 * K; y++) {
				table[x][y] += table[x][y - 1];
			}
		}
		for (int y = 0; y < 2 * K; y++) {
			for (int x = 1; x < 2 * K; x++) {
				table[x][y] += table[x - 1][y];
			}
		}
		for (int x = 0; x < 2 * K; x++) {
			for (int y = 0; y < 2 * K; y++) {
				max = Math.max(max, table[x][y]);
			}
		}
		System.out.println(max);
	}

	class BinaryIndexedTree2D {
		private long[][] array;

		public BinaryIndexedTree2D(int size) {
			this.array = new long[size + 1][];
			for (int i = 0; i <= size; i++) {
				this.array[i] = new long[size + 1];
			}
		}

		/**
		 * ?????????????
		 * ????O(logN)
		 * @param index_1 ?????????
		 * @param index_2 ?????????
		 * @param value ?????
		 */
		public void add(int index_1, int index_2, long value) {
			for (int i = index_1; i < array.length; i += (i & -i)) {
				for (int j = index_2; j < array.length; j += (j & -j)) {
					array[i][j] += value;
				}
			}
		}

		/**
		 * 1????????????????
		 * ????O(logN)
		 * @param index_1 ????
		 * @param index_2 ????
		 * @return 1?index????
		 */
		public long getSum(int index_1, int index_2) {
			long sum = 0L;
			for (int i = index_1; i > 0; i -= (i & -i)) {
				for (int j = index_2; j > 0; j -= (j & -j)) {
					sum += array[i][j];
				}
			}
			return sum;
		}
	}

	interface CombCalculator {
		long comb(int n, int m);
	}

	/**
	 * ??????????????????????(MOD??)
	 * ????O(N^2), comb?O(1)???????
	 * size?2 * 1e4????????????MLE?????????
	 */
	class TableCombCalculator implements CombCalculator {
		long[][] table;
		int size;

		public TableCombCalculator(int size, long mod) {
			this.size = size;
			table = new long[size + 1][];

			table[0] = new long[1];
			table[0][0] = 1L;
			for (int n = 1; n <= size; n++) {
				table[n] = new long[n + 1];
				table[n][0] = 1L;
				for (int m = 1; m < n; m++) {
					table[n][m] = (table[n - 1][m - 1] + table[n - 1][m]) % mod;
				}
				table[n][n] = 1L;
			}
		}

		@Override
		public long comb(int n, int m) {
			if (n > size) {
				throw new RuntimeException("n is greater than size.");
			}
			if (n < 0 || m < 0 || n < m) {
				return 0L;
			}
			return table[n][m];
		}
	}

	interface Graph {
		void link(int from, int to, long cost);
		Optional<Long> getCost(int from, int to);
		int getVertexNum();
	}

	interface FlowResolver {
		long maxFlow(int from, int to);
	}

	/**
	 * ???????????
	 * ??????????????MLE?????
	 */
	class ArrayGraph implements Graph {
		private Long[][] costArray;
		private int vertexNum;

		public ArrayGraph(int n) {
			costArray = new Long[n][];
			for (int i = 0; i < n; i++) {
				costArray[i] = new Long[n];
			}
			vertexNum = n;
		}

		@Override
		public void link(int from, int to, long cost) {
			costArray[from][to] = new Long(cost);
		}

		@Override
		public Optional<Long> getCost(int from, int to) {
			return Optional.ofNullable(costArray[from][to]);
		}

		@Override
		public int getVertexNum() {
			return vertexNum;
		}
	}

	/**
	 * DFS(??????)?????
	 * ????O(E*MaxFlow)??? (E:???, MaxFlow:?????)
	 */
	class DfsFlowResolver implements FlowResolver {
		private Graph graph;
		public DfsFlowResolver(Graph graph) {
			this.graph = graph;
		}

		/**
		 * ?????(?????)????
		 * @param from ??(source)?ID
		 * @param to ??(target)?ID
		 * @return ?????(?????)
		 */
		public long maxFlow(int from, int to) {
			long sum = 0L;
			long currentFlow;
			do {
				currentFlow = flow(from, to, Long.MAX_VALUE / 3, new boolean[graph.getVertexNum()]);
				sum += currentFlow;
			} while (currentFlow > 0);
			return sum;
		}

		/**
		 * ?????? ?????????
		 * @param from ???????ID
		 * @param to ??(target)?ID
		 * @param current_flow ???????
		 * @param passed ?????????????????
		 * @return ??(target)??????/?????????
		 */
		private long flow(int from, int to, long current_flow, boolean[] passed) {
			passed[from] = true;
			if (from == to) {
				return current_flow;
			}
			for (int id = 0; id < graph.getVertexNum(); id++) {
				if (passed[id]) {
					continue;
				}
				Optional<Long> cost = graph.getCost(from, id);
				if (cost.orElse(0L) > 0) {
					long nextFlow = current_flow < cost.get() ? current_flow : cost.get();
					long returnFlow = flow(id, to, nextFlow, passed);
					if (returnFlow > 0) {
						graph.link(from, id, cost.get() - returnFlow);
						graph.link(id, from, graph.getCost(id, from).orElse(0L) + returnFlow);
						return returnFlow;
					}
				}
			}
			return 0L;
		}
	}

	/**
	 * 1-indexed?BIT??
	 */
	class BinaryIndexedTree {
		private long[] array;

		public BinaryIndexedTree(int size) {
			this.array = new long[size + 1];
		}

		/**
		 * ?????????????
		 * ????O(logN)
		 * @param index ?????????
		 * @param value ?????
		 */
		public void add(int index, long value) {
			for (int i = index; i < array.length; i += (i & -i)) {
				array[i] += value;
			}
		}

		/**
		 * 1????????????????
		 * ????O(logN)
		 * @param index ????
		 * @return 1?index????
		 */
		public long getSum(int index) {
			long sum = 0L;
			for (int i = index; i > 0; i -= (i & -i)) {
				sum += array[i];
			}
			return sum;
		}
	}

	interface UnionFind {
		void union(int A, int B);
		boolean judge(int A, int B);
		Set<Integer> getSet(int id);
	}

	/**
	 * ArrayUnionFind???
	 * MapSet??????????????????????????????
	 * getSet?????O(logN * logN)?????????
	 * ???union?????2???????????????(????????????)
	 */
	class SetUnionFind extends ArrayUnionFind {
		Map<Integer, Set<Integer>> map;
		public SetUnionFind(int size) {
			super(size);
			map = new HashMap<>();
			for (int i = 0; i < size; i++) {
				map.put(i, new HashSet<>());
				map.get(i).add(i);
			}
		}

		@Override
		protected void unionTo(int source, int dest) {
			super.unionTo(source, dest);
			map.get(dest).addAll(map.get(source));
		}

		@Override
		public Set<Integer> getSet(int id) {
			return map.get(root(id));
		}
	}

	/**
	 * ?????UnionFind???
	 * getSet?????O(NlogN)???TLE???
	 */
	class ArrayUnionFind implements UnionFind {
		int[] parent;
		int[] rank;
		int size;
		public ArrayUnionFind(int size) {
			parent = new int[size];
			for (int i = 0; i < size; i++) {
				parent[i] = i;
			}
			rank = new int[size];
			this.size = size;
		}

		@Override
		public void union(int A, int B) {
			int rootA = root(A);
			int rootB = root(B);
			if (rootA != rootB) {
				if (rank[rootA] < rank[rootB]) {
					unionTo(rootA, rootB);
				} else {
					unionTo(rootB, rootA);
					if (rank[rootA] == rank[rootB]) {
						rank[rootA]++;
					}
				}
			}
		}

		protected void unionTo(int source, int dest) {
			parent[source] = dest;
		}

		@Override
		public boolean judge(int A, int B) {
			return root(A) == root(B);
		}

		@Override
		public Set<Integer> getSet(int id) {
			Set<Integer> set = new HashSet<>();
			IntStream.range(0, size).filter(i -> judge(i, id)).forEach(set::add);
			return set;
		}

		protected int root(int id) {
			if (parent[id] == id) {
				return id;
			}
			parent[id] = root(parent[id]);
			return parent[id];
		}
	}

	/**
	 * ??????????
	 */
	class PrimeNumberUtils {
		boolean[] isPrimeArray;
		List<Integer> primes;

		/**
		 * ???????????????????????????
		 * @param limit ???????(?????????????????)
		 */
		public PrimeNumberUtils(int limit) {
			if (limit > 10000000) {
				System.err.println("?????????????????????????TLE????????????");
			}
			primes = new ArrayList<>();
			isPrimeArray = new boolean[limit];
			if (limit > 2) {
				primes.add(2);
				isPrimeArray[2] = true;
			}

			for (int i = 3; i < limit; i += 2) {
				if (isPrime(i, primes)) {
					primes.add(i);
					isPrimeArray[i] = true;
				}
			}
		}

		public List<Integer> getPrimeNumberList() {
			return primes;
		}

		public boolean isPrime(int n) {
			return isPrimeArray[n];
		}

		private boolean isPrime(int n, List<Integer> primes) {
			for (int prime : primes) {
				if (n % prime == 0) {
					return false;
				}
				if (prime > Math.sqrt(n)) {
					break;
				}
			}
			return true;
		}
	}

	interface BitSet {
		void set(int index, boolean bit);
		boolean get(int index);
		void shiftRight(int num);
		void shiftLeft(int num);
		void or(BitSet bitset);
		void and(BitSet bitset);
	}

	/**
	 * Long??????BitSet???
	 * get/set?O(1)
	 * shift/or/and?O(size / 64)
	 */
	class LongBit implements BitSet {
		long[] bitArray;

		public LongBit(int size) {
			bitArray = new long[((size + 63) / 64)];
		}

		@Override
		public void set(int index, boolean bit) {
			int segment = index / 64;
			int inIndex = index % 64;
			if (bit) {
				bitArray[segment] |= 1L << inIndex;
			} else {
				bitArray[segment] &= ~(1L << inIndex);
			}
		}

		@Override
		public boolean get(int index) {
			int segment = index / 64;
			int inIndex = index % 64;
			return (bitArray[segment] & (1L << inIndex)) != 0L;
		}

		@Override
		public void shiftRight(int num) {
			int shiftSeg = num / 64;
			int shiftInI = num % 64;
			for (int segment = 0; segment < bitArray.length; segment++) {
				int sourceSeg = segment + shiftSeg;
				if (sourceSeg < bitArray.length) {
					bitArray[segment] = bitArray[sourceSeg] >>> shiftInI;
					if (shiftInI > 0 && sourceSeg + 1 < bitArray.length) {
						bitArray[segment] |= bitArray[sourceSeg + 1] << (64 - shiftInI);
					}
				} else {
					bitArray[segment] = 0L;
				}
			}
		}

		@Override
		public void shiftLeft(int num) {
			int shiftSeg = num / 64;
			int shiftInI = num % 64;
			for (int segment = bitArray.length - 1; segment >= 0; segment--) {
				int sourceSeg = segment - shiftSeg;
				if (sourceSeg >= 0) {
					bitArray[segment] = bitArray[sourceSeg] << shiftInI;
					if (shiftInI > 0 && sourceSeg > 0) {
						bitArray[segment] |= bitArray[sourceSeg - 1] >>> (64 - shiftInI);
					}
				} else {
					bitArray[segment] = 0L;
				}
			}
		}

		public long getLong(int segment) {
			return bitArray[segment];
		}

		@Override
		public void or(BitSet bitset) {
			if (!(bitset instanceof LongBit)) {
				return;
			}
			for (int segment = 0; segment < bitArray.length; segment++) {
				bitArray[segment] |= ((LongBit)bitset).getLong(segment);
			}
		}

		@Override
		public void and(BitSet bitset) {
			if (!(bitset instanceof LongBit)) {
				return;
			}
			for (int segment = 0; segment < bitArray.length; segment++) {
				bitArray[segment] &= ((LongBit)bitset).getLong(segment);
			}
		}
	}

}