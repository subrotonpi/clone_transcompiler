public static void print ( String w ) {
  HashSet < String > h = new HashSet < String > ( ) ;
  h . add ( w ) ;
  for ( String i : h ) {
    if ( w . indexOf ( i ) % 2 != 0 ) {
      System . out . println ( "No" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "Yes" ) ;
}
