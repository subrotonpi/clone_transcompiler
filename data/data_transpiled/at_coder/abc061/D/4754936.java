static final double inf = Double . MAX_VALUE ;
/* Bellmanford */
for ( int i = 0 ;
i < N ;
i ++ ) {
  for ( int v = 0 ;
  v < edges . length ;
  v ++ ) {
    int nv = i ;
    int w = i * 2 ;
    if ( dist [ nv ] > dist [ v ] + w ) {
      dist [ nv ] = dist [ v ] + w ;
      if ( i == N - 1 && nv == end ) {
        return false ;
      }
    }
  }
  /* Bellmanford */
  int N = Integer . parseInt ( input ( ) ) ;
  int M = Integer . parseInt ( input ( ) ) ;
  int [ ] info = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    a -- ;
    b -- ;
    c = - c ;
    info [ i ] = ( a == b ) ? a : b ;
  }
  dist = new int [ N ] ;
  dist [ 0 ] = inf ;
  boolean flag = bellmanford ( dist , info , N , N - 1 ) ;
  String ans = flag ? - dist [ N - 1 ] : "inf" ;
  System . out . println ( ans ) ;
}
