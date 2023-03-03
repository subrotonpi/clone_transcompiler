static int test ( ) throws IOException {
  final int [ ] [ ] found = new int [ M ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    found [ i ] [ 0 ] = i ;
  }
  final PriorityQueue < Integer > q = new PriorityQueue < Integer > ( ) ;
  int r = test ( 0 ) ;
  System . out . println ( "Case #" + ( T + 1 ) + ": " + r ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int N = Integer . parseInt ( f . readLine ( ) ) ;
    final int K = Integer . parseInt ( f . readLine ( ) ) ;
    grid = new int [ N ] [ M ] ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      if ( grid [ i ] [ j ] == 0 ) {
        found [ i ] [ j ] = 1 ;
        tot ++ ;
        q . add ( new Integer ( j ) ) ;
      }
      if ( N > 1 ) {
        if ( grid [ N - 1 ] [ j ] == 0 ) {
          found [ N - 1 ] [ j ] = 1 ;
          tot ++ ;
          q . add ( new Integer ( N - 1 ) ) ;
        }
      }
    }
    while ( q . size ( ) > 0 ) {
      int r = q . poll ( ) ;
      int c = q . poll ( ) ;
      for ( int dr = 0 , dc = 1 ;
      dr < N ;
      dr ++ , dc ++ ) {
        final int nr = r + dr , nc = c + dc ;
        if ( nr < 0 || nr >= N || nc < 0 || nc >= M ) continue ;
        if ( grid [ nr ] [ nc ] == 0 && found [ nr ] [ nc ] == 0 ) {
          found [ nr ] [ nc ] = 1 ;
          tot ++ ;
          q . add ( new Integer ( nr ) ) ;
        }
      }
    }
    return N * M - tot >= K ;
  }
  int r , c ;
  if ( N * M > 0 ) {
    if ( works ( ) ) return Integer . MAX_VALUE ;
    return 10000 ;
  }
  r = idx / M ;
  c = idx % M ;
  grid [ r ] [ c ] = 0 ;
  int a = test ( idx + 1 ) ;
  grid [ r ] [ c ] = 1 ;
  int b = test ( idx + 1 ) ;
  return Math . min ( a , b ) ;
}
