public static int K = Integer . parseInt ( input ) {
  if ( K == 1 ) {
    System . out . println ( 1 ) ;
    System . out . println ( 1 ) ;
  }
  else {
    int n = ( ( K + 3 ) / 4 ) * 2 ;
    System . out . println ( n ) ;
    for ( int r = 0 ;
    r < n ;
    r ++ ) {
      int [ ] line = new int [ n ] ;
      for ( int c = 0 ;
      c < n ;
      c ++ ) {
        int t ;
        if ( r % 2 == 0 ) t = ( r + c ) % n + 1 ;
        else t = n + ( r + c ) % n + 1 ;
        if ( t > K ) t -= n ;
        line [ c ] = t ;
      }
      System . out . println ( ( int ) line [ c ] ) ;
    }
  }
  return 0 ;
}
