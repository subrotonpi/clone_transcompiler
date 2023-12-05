public static void print ( String A ) {
  List < Character > B = new LinkedList < Character > ( ) ;
  List < Character > C = new LinkedList < Character > ( ) ;
  char turn = A . charAt ( 0 ) ;
  do {
    if ( turn == 'a' ) {
      if ( A . size ( ) == 0 ) {
        System . out . println ( "A" ) ;
        exit ( ) ;
      }
      turn = A . charAt ( 0 ) ;
      A . remove ( 0 ) ;
    }
    if ( turn == 'b' ) {
      if ( B . size ( ) == 0 ) {
        System . out . println ( "B" ) ;
        exit ( ) ;
      }
      turn = B . charAt ( 0 ) ;
      B . remove ( 0 ) ;
    }
    if ( turn == 'c' ) {
      if ( C . size ( ) == 0 ) {
        System . out . println ( "C" ) ;
        exit ( ) ;
      }
      turn = C . charAt ( 0 ) ;
      C . remove ( 0 ) ;
    }
  }
  while ( turn == 'a' ) ;
}
