public static String input ( ) {
  String x = input . toString ( ) ;
  if ( x . replace ( "ch" , "" ) . replace ( "o" , "" ) . replace ( "k" , "" ) . replace ( "u" , "" ) . isEmpty ( ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return x ;
}
