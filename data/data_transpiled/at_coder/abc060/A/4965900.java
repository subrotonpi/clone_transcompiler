public static String print ( String s , String t , String u ) {
  if ( s . charAt ( s . length ( ) - 1 ) == t . charAt ( 0 ) && t . charAt ( t . length ( ) - 1 ) == u . charAt ( 0 ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return s ;
}
