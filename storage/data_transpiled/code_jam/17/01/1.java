public static void print ( String input ) {
  int t = Integer . parseInt ( input ) ;
  for ( int tc = 1 ;
  tc <= t ;
  tc ++ ) {
    System . out . print ( "Case #" + tc + ": " ) ;
    String line , k ;
    line = input . trim ( ) . split ( " " ) ;
    k = Integer . parseInt ( k ) ;
    Arrays . fill ( line . toCharArray ( ) , 0 ) ;
    int r = 0 ;
    for ( int i = 0 ;
    i < line . length ( ) - k + 1 ;
    i ++ ) {
      if ( ! line . charAt ( i ) ) {
        r ++ ;
        for ( int j = 0 ;
        j < k ;
        j ++ ) {
          line . setCharAt ( i + j , ! line . charAt ( i + j ) ) ;
        }
      }
    }
    if ( Arrays . equals ( line . toCharArray ( ) , line . toCharArray ( ) ) ) System . out . println ( r ) ;
    else System . out . println ( "IMPOSSIBLE" ) ;
  }
}
