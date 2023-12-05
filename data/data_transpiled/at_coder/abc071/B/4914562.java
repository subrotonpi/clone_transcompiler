public static String S = String . valueOf ( input ) {
  String ascii_letters = "abcdefghijklmnopqrstuvwxyz" ;
  for ( int i = 0 ;
  i < ascii_letters . length ( ) ;
  i ++ ) {
    if ( ! ascii_letters . contains ( S ) ) {
      System . out . println ( ascii_letters ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "None" ) ;
  return null ;
}
