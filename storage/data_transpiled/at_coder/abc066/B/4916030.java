public static void print ( String s ) {
  StringBuilder sb = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    sb . setLength ( 0 ) ;
    sb . append ( s . charAt ( i ) ) ;
    if ( s . length ( ) > s . length ( ) / 2 * 2 == s . length ( ) ) {
      System . out . println ( s . length ( ) ) ;
      break ;
    }
    sb . setLength ( 0 ) ;
  }
}
