@ Sys public static int [ ] riadok ( ) throws IOException {
  /* Enter the number of times to do the next test */
  int cas = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int cas = 0 ;
  cas < Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  cas ++ ) {
    int n = riadok ( ) ;
    int k = riadok ( ) ;
    double b = riadok ( ) ;
    double t = riadok ( ) ;
    double [ ] x = riadok ( ) ;
    double [ ] v = riadok ( ) ;
    int [ ] res = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int cnt = 0 ;
      for ( int j = i + 1 ;
      j < n ;
      j ++ ) if ( b - x [ j ] > t * v [ j ] ) cnt ++ ;
      if ( b - x [ i ] <= t * v [ i ] ) res [ i ] = cnt ;
    }
    String s = "IMPOSSIBLE" ;
    if ( res . length >= k ) {
      Arrays . sort ( res ) ;
      s = "" + Integer . toString ( res . length - k ) ;
    }
    System . out . println ( "Case #" + ( cas + 1 ) + ": " + s ) ;
  }
  return res ;
}
