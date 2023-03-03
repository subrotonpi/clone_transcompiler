static final String getInput ( ) {
  final String input = "Enter a list of integers: " ;
  final double INF = Double . POSITIVE_INFINITY ;
  final int N = Integer . parseInt ( input ) ;
  final int M = Integer . parseInt ( input ) ;
  final int R = Integer . parseInt ( input ) ;
  final List < Integer > r = Lists . newArrayList ( ) ;
  final Set < Integer > adjCost = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int a = Integer . parseInt ( input ) ;
    final int b = Integer . parseInt ( input ) ;
    final int c = Integer . parseInt ( input ) ;
    adjCost . add ( a - 1 , ( b - 1 ) , ( c - 1 ) ) ;
    adjCost . add ( b - 1 , ( a - 1 ) , ( c - 1 ) ) ;
  }
  return "" ;
  /* dijkstra(v) {
  final int d[] = {INF};
  d[v] = 0;
  final PriorityQueue<Integer> hq = new PriorityQueue<>();
  hq.add(new Integer(0));
  while(hq.size()>0){
  final int u = heapheappop(hq).get(1);
  final Iterator<Integer> it = adjCost.get(u).iterator();
  if (it.hasNext()) {
  d[v] = d[u] + it.next();
  hq.add(new Integer(d[u] + it.next()));
  }
  }
  return d;
  }*/
}
