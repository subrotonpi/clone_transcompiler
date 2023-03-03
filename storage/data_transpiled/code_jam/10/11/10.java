@ VisibleForTesting static int [ ] [ ] solve ( int [ ] [ ] b ) {
  int testNr = 0 ;
  int n = b . length ;
  int [ ] [ ] c = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    c [ i ] = b [ i ] [ 0 ] ;
  }
  int t = Integer . parseInt ( System . in . readLine ( ) ) ;
  for ( int testNr = 1 ;
  testNr < t + 1 ;
  testNr ++ ) {
    n = b . length ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a = new String [ n ] ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        c [ i ] = a [ j ] ;
      }
      String sol = solve ( b , k ) ;
      System . out . println ( "Case #" + testNr + ":" + sol ) ;
      System . out . println ( sol ) ;
    }
  }
  return b ;
}
