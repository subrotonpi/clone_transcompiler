public static String A = input ( ) {
  String B = input ( ) ;
  String C = input ( ) ;
  String win = "" ;
  char turn = 'A' ;
  while ( win . equals ( "" ) ) {
    if ( turn == 'A' ) {
      if ( A . isEmpty ( ) ) win = "A" ;
      turn = A . substring ( 0 , 1 ) . toUpperCase ( ) ;
      A = A . substring ( 1 ) ;
    }
    if ( turn == 'B' ) {
      if ( B . isEmpty ( ) ) win = "B" ;
      turn = B . substring ( 0 , 1 ) . toUpperCase ( ) ;
      B = B . substring ( 1 ) ;
    }
    if ( turn == 'C' ) {
      if ( C . isEmpty ( ) ) win = "C" ;
      turn = C . substring ( 0 , 1 ) . toUpperCase ( ) ;
      C = C . substring ( 1 ) ;
    }
  }
  System . out . println ( win ) ;
  return win ;
}
