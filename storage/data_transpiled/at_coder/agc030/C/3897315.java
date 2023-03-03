public static int [ ] [ ] getans ( ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( k == 1 ) {
    System . out . println ( 1 ) ;
    System . out . println ( 1 ) ;
  }
  else {
    int n = ( k + 3 ) / 4 * 2 ;
    int [ ] [ ] ans = new int [ n ] [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( i % 2 == 0 ) {
          ans [ i ] [ j ] = ( i + j ) % n + 1 ;
        }
        else {
          if ( ( i + j ) % n + n + 1 > k ) {
            ans [ i ] [ j ] = ( i + j ) % n + 1 ;
          }
          else {
            ans [ i ] [ j ] = ( i + j ) % n + n + 1 ;
          }
        }
      }
    }
    System . out . println ( n ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      System . out . println ( ( int [ ] [ ] ) ans [ i ] ) ;
    }
  }
  return ans ;
}
