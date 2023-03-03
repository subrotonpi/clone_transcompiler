public static String print ( ) {
  String s = input . next ( ) ;
  String S = s . substring ( 0 , s . length ( ) - 1 ) ;
  if ( s . equals ( S ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return s ;
}
