static final double inf = Double . MAX_VALUE ;
/* for each edge in the dist */
for ( int i = 0 ;
i < N ;
i ++ ) {
  for ( int v = 0 ;
  v < edges . length ;
  v ++ ) {
    int nv = edges [ v ] ;
    int w = edges [ v ] ;
    if ( dist [ nv ] > dist [ v ] + w ) {
      dist [ nv ] = dist [ v ] + w ;
      if ( i == N - 1 && nv == N - 1 ) {
        return false ;
      }
    }
  }
  /* return true */
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
  /* return true */
  return true ;
}
