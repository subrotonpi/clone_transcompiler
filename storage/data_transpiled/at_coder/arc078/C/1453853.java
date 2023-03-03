public static void print ( int k ) {
  for ( int k = 1 ;
  k <= 10 ;
  k ++ ) {
    System . out . print ( "?" + 10 * k ) ;
    if ( input . charAt ( k ) == 'N' ) {
      int i = 10 * ( k - 1 ) + 1 ;
      int j = 10 * k - 1 ;
      while ( i < j ) {
        int m = ( i + j ) / 2 ;
        System . out . print ( "?" + m * 10 ) ;
        if ( input . charAt ( k ) == 'Y' ) {
          j = m ;
        }
        else {
          i = m + 1 ;
        }
      }
      System . out . print ( "!" + i ) ;
      break ;
    }
  }
  else {
    for ( int k = 0 ;
    k < 10 ;
    k ++ ) {
      System . out . print ( "?" + 10 * ( k + 1 ) - 1 ) ;
      if ( input . charAt ( k ) == 'Y' ) {
        System . out . print ( "!" + 10 * k ) ;
        break ;
      }
    }
  }
}
