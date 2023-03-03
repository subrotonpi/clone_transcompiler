static private int dfs ( int v , int t , int f ) {
  final int V = v ;
  final int inf = 1000000007 ;
  final Dinic < Integer > G = new Dinic < Integer > ( 2 + M * 2 ) ;
  final Set < Integer > [ ] nodes = new Set [ v ] ;
  for ( int i = 0 ;
  i < V ;
  i ++ ) {
    nodes [ i ] = new Set < Integer > ( ) ;
  }
  final int M = 20 * 3 ;
  final Dinic < Integer > dinic = new Dinic < Integer > ( 2 + M * 2 ) ;
  final Set < Integer > [ ] nodes = new Set [ V ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    nodes [ i ] = new Set < Integer > ( ) ;
  }
  for ( int i = 1 ;
  i < x ;
  i ++ ) {
    int s0 = j * y * z ;
    int s1 = ( i - 1 ) * y * z ;
    dinic . addEdge ( 2 + s0 , 1 , s1 ) ;
    nodes [ i ] . add ( s0 ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input ( ) ) ;
    int y = Integer . parseInt ( input ( ) ) ;
    int z = Integer . parseInt ( input ( ) ) ;
    addXYZ ( x , y , z ) ;
    addXYZ ( y , z , x ) ;
    addXYZ ( z , x , y ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    dinic . addEdge ( 0 , 2 + n - 1 , 1 ) ;
    dinic . addEdge ( 2 + M + n - 1 , 1 , 1 ) ;
  }
  int f = dinic . maxFlow ( 0 , 1 ) ;
  System . out . println ( ( nodes . length - f ) * 2 + f ) ;
  return f ;
}
