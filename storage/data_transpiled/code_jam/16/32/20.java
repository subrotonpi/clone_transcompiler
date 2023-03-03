@ sys . exit public static String getString ( int length , int M ) {
  /* Get the string from the number of digits */
  StringBuffer resstr = new StringBuffer ( ) ;
  for ( int i = length - 1 ;
  i >= 0 ;
  i -- ) {
    int res = M / 2 * i ;
    resstr . append ( res ) ;
    M -= 2 * i * res ;
  }
  /* solve the number of digits */
  if ( M > 2 * ( B - 2 ) ) {
    System . out . println ( "Case #" + ( T + 1 ) + ": IMPOSSIBLE" ) ;
  }
  else if ( M == 2 * ( B - 2 ) ) {
    System . out . println ( "Case #" + ( T + 1 ) + ": POSSIBLE" ) ;
    System . out . println ( "0" + "1" * ( B - 1 ) ) ;
    for ( int i = 2 ;
    i <= B ;
    i ++ ) {
      String str = "" ;
      str += "0" * i + "1" * ( B - i ) ;
      System . out . println ( str ) ;
    }
  }
  else {
    System . out . println ( "Case #" + ( T + 1 ) + ": POSSIBLE" ) ;
    System . out . println ( "0" + getString ( B - 2 , M ) + "0" ) ;
    for ( int i = 2 ;
    i <= B ;
    i ++ ) {
      String str = "" ;
      str += "0" * i + "1" * ( B - i ) ;
      System . out . println ( str ) ;
    }
  }
  int cases = Integer . parseInt ( readLine ( ) ) ;
  for ( int T : xrange ( cases ) ) {
    String B , M ;
    B = Integer . parseInt ( readLine ( ) ) ;
    M = Integer . parseInt ( readLine ( ) ) ;
    solve ( T , B , M ) ;
  }
  return resstr . toString ( ) ;
}
