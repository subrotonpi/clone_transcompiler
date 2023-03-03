public static int mod ( int mod ) {
  int nx = 500 ;
  int [ ] [ ] C = new int [ nx + 1 ] [ n ] ;
  C [ 0 ] [ 0 ] = 1 ;
  for ( int n = 1 ;
  n <= nx ;
  n ++ ) {
    C [ n ] = new int [ n ] ;
    C [ n ] [ 0 ] = 1 ;
    for ( int k = 1 ;
    k <= n ;
    k ++ ) {
      C [ n ] [ k ] = ( C [ n - 1 ] [ k - 1 ] + C [ n - 1 ] [ k ] ) % mod ;
    }
    C [ n ] [ k ] = 1 ;
  }
  int [ ] [ ] Tot = new int [ n ] [ n ] ;
  int [ ] [ ] T = new int [ n ] [ n ] ;
  for ( int n = 1 ;
  n <= nx ;
  n ++ ) {
    T [ n ] = new int [ n ] ;
    T [ n ] [ 0 ] = 0 ;
    T [ n ] [ 1 ] = 1 ;
    for ( int k = 2 ;
    k <= n ;
    k ++ ) {
      T [ n ] [ k ] = sum ( T [ k ] [ l ] * C [ n - 1 - k ] [ k - 1 - l ] ) ;
    }
    Tot [ n ] [ k ] = sum ( T [ n ] [ k ] ) % mod ;
  }
  int t = input . nextInt ( ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    int n = input . nextInt ( ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + Tot [ n ] ) ;
  }
  return t ;
}
