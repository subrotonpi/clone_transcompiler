public static final Pattern compile ( ) {
  Pattern pattern = Pattern . compile ( "^(?:\\.*)(#+)(?:\\.*)$" ) ;
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  char [ ] [ ] board = new char [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    board [ i ] = input . charAt ( i ) ;
  }
  int c = 0 ;
  for ( char [ ] row : board ) {
    result = pattern . matcher ( row ) . matches ( ) ;
    if ( result == null || result . start ( 1 ) != c ) {
      System . out . println ( "Impossible" ) ;
      exit ( ) ;
    }
    else {
      c = result . end ( 1 ) - 1 ;
    }
  }
  System . out . println ( "Possible" ) ;
  return pattern ;
}
