public static int cases = Integer . parseInt ( readLine ( ) ) {
  for ( int tc = 0 ;
  tc < xrange ( cases ) ;
  tc ++ ) {
    int n = Integer . parseInt ( readLine ( ) ) ;
    List < Integer > num = new ArrayList < > ( ) ;
    for ( String i : readLine ( ) . split ( " " ) ) {
      num . add ( Integer . parseInt ( i ) ) ;
    }
    int res = 0 ;
    while ( num . size ( ) > 0 ) {
      int i = num . indexOf ( min ( num ) ) ;
      res += min ( i , num . size ( ) - i - 1 ) ;
      num = num . subList ( 0 , i ) + num . subList ( i + 1 , num . size ( ) ) ;
    }
    System . out . println ( "Case #" + ( tc + 1 ) + ": " + res ) ;
  }
  return res ;
}
