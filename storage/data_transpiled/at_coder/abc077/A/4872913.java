public static String print ( String c ) {
  int i = 0 ;
  while ( i < c . length ( ) ) {
    if ( c . charAt ( i ) == 'YES' ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
  }
  return c ;
}
