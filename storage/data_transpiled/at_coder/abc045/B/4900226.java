public static String print ( String a ) {
  String b = input . next ( ) ;
  String c = input . next ( ) ;
  String d = "a" ;
  String win = "no" ;
  while ( ( win = input . next ( ) ) == "no" ) {
    if ( d . equals ( "a" ) ) {
      d = a . substring ( 0 , 1 ) ;
      a = a . substring ( 1 ) ;
    }
    else if ( d . equals ( "b" ) ) {
      d = b . substring ( 0 , 1 ) ;
      b = b . substring ( 1 ) ;
    }
    else if ( d . equals ( "c" ) ) {
      d = c . substring ( 0 , 1 ) ;
      c = c . substring ( 1 ) ;
    }
    if ( ( ( d == "a" ) && ( a . length ( ) == 0 ) ) ) win = "A" ;
    else if ( ( ( d == "b" ) && ( b . length ( ) == 0 ) ) ) win = "B" ;
    else if ( ( ( d == "c" ) && ( c . length ( ) == 0 ) ) ) win = "C" ;
  }
  System . out . println ( win ) ;
  return win ;
}
