public static void input ( ) {
  String s = input . nextLine ( ) ;
  s = s . replace ( "ch" , "" ) . replace ( "o" , "" ) . replace ( "k" , "" ) . replace ( "u" , "" ) ;
  if ( s . equals ( "" ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
