public static void input ( ) {
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  if ( s . equals ( t . substring ( 0 , t . length ( ) - 1 ) ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
