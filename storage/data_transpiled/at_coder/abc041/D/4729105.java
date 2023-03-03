static final int [ ] G ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  Set < Integer > [ ] G = new Set [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    x -- ;
    y -- ;
    G [ y ] . add ( x ) ;
  }
  int [ ] F = new int [ 2 * N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int [ ] seq = new int [ 2 ] ;
    Set < Integer > S = new HashSet < Integer > ( ) ;
    int T = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( seq [ j ] == 1 ) {
        S . add ( i ) ;
        T += 2 * i ;
      }
    }
    if ( T == 0 ) {
      F [ T ] = 1 ;
      continue ;
    }
    for ( int k = 0 ;
    k < S . size ( ) ;
    k ++ ) {
      if ( S . get ( k ) & G [ k ] . size ( ) == 0 ) {
        F [ T ] += F [ T ^ ( 2 * k ) ] ;
      }
    }
  }
  System . out . println ( F [ F . length - 1 ] ) ;
}
