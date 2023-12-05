public static void input ( ) {
  String w = input ( ) ;
  Set < String > set_w = new HashSet < String > ( w ) ;
  for ( String i : set_w ) {
    if ( ( w . indexOf ( i ) % 2 ) != 0 ) {
      System . out . println ( "No" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "Yes" ) ;
}
