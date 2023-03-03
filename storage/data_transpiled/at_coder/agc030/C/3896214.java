public static int k = Integer . parseInt ( input ) {
  int mx = 500 ;
  if ( k <= mx ) {
    System . out . println ( k ) ;
    for ( int i = 1 ;
    i <= k ;
    i ++ ) {
      System . out . print ( ( new Integer ( i ) ) . toString ( ) + " " ) ;
    }
  }
  else {
    int [ ] [ ] cv = new int [ mx ] [ k ] ;
    for ( int i = 0 ;
    i < mx ;
    i ++ ) {
      for ( int j = 0 ;
      j < mx ;
      j ++ ) {
        cv [ i ] [ ( i + j ) % mx ] = j + 1 ;
        if ( i % 2 == 1 && j + 1 + mx <= k ) {
          cv [ i ] [ ( i + j ) % mx ] += mx ;
        }
      }
    }
    System . out . println ( mx ) ;
    for ( int i = 0 ;
    i < mx ;
    i ++ ) {
      System . out . print ( ( new Integer ( cv [ i ] [ i ] ) ) . toString ( ) + " " ) ;
    }
  }
  return mx ;
}
