public static void print ( String a ) {
  if ( a . equals ( "a" ) ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  if ( a . length ( ) > 1 ) {
    System . out . println ( a . charAt ( 0 ) ) ;
  }
  else {
    System . out . println ( "a" ) ;
  }
}
