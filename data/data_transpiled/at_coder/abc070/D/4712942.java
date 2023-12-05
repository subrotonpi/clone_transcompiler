@ collections . collections . defaultdict public static void solve ( ) {
  class Edge {
    int i ;
    int x ;
    int y ;
    int cost ;
  }
  int N = Integer . parseInt ( input ) ;
  LinkedList < Edge > G = new LinkedList < > ( ) ;
  boolean [ ] P = new boolean [ N ] ;
  for ( i = 0 ;
  i < N ;
  i ++ ) {
    P [ i ] = false ;
  }
  int [ ] A = new int [ N ] ;
  for ( i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = - 100 ;
  }
  for ( i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    int c = Integer . parseInt ( input ) ;
    G . get ( a - 1 ) . add ( edge ( b - 1 , c ) ) ;
    G . get ( b - 1 ) . add ( edge ( a - 1 , c ) ) ;
  }
  int Q = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  A [ K - 1 ] = 0 ;
  P [ K - 1 ] = true ;
  solve ( G , K - 1 , P ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    int y = Integer . parseInt ( input ) ;
    System . out . println ( A [ x - 1 ] + A [ y - 1 ] ) ;
  }
}
