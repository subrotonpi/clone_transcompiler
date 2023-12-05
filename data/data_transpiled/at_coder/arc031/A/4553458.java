public static String print ( ) {
  String A = input . nextLine ( ) ;
  String B = A . substring ( 0 , A . length ( ) - 1 ) ;
  if ( A . equals ( B ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return A ;
}
