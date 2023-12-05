static final long [ ] S ( int n , int m , int X , int Y , int Z ) {
  for ( int testCase = 0 ;
  testCase < n ;
  testCase ++ ) {
    int n = Integer . parseInt ( readLine ( ) ) ;
    int m = Integer . parseInt ( readLine ( ) ) ;
    int X = Integer . parseInt ( readLine ( ) ) ;
    int Y = Integer . parseInt ( readLine ( ) ) ;
    int Z = Integer . parseInt ( readLine ( ) ) ;
    int [ ] A = new int [ m ] ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      A [ i ] = Integer . parseInt ( readLine ( ) ) ;
    }
    int [ ] L = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      L [ i ] = Integer . parseInt ( A [ i % m ] ) ;
      A [ i % m ] = ( X * A [ i % m ] + Y * ( i + 1 ) ) % Z ;
    }
    long count = 0 ;
    long [ ] S = new long [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      S [ i ] = 1 ;
    }
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < i ;
      j ++ ) {
        if ( L [ j ] < L [ i ] ) {
          S [ i ] += S [ j ] ;
        }
      }
      count += S [ i ] ;
    }
    count = count % 1000000007 ;
    System . out . println ( "Case #" + ( testCase + 1 ) + ": " + count ) ;
  }
  return null ;
}
