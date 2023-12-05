public static int T = Integer . parseInt ( Scanner in ) {
  for ( int x = xrange ( 1 , T + 1 ) ;
  x <= xrange ( 1 , T + 1 ) ;
  x ++ ) {
    int S_max = in . nextInt ( ) ;
    int [ ] levels = in . nextInt ( ) ;
    int n = 0 ;
    for ( int k = 0 ;
    k < levels . length ;
    k ++ ) {
      int m = map [ k ] ;
      if ( m > 0 && n < k ) n = k ;
      n += m ;
    }
    System . out . println ( "Case #" + x + ": " + ( n - Integer . numberOfLeadingZeros ( levels [ n ] ) ) ) ;
  }
  return T ;
}
