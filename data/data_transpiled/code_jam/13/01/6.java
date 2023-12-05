@ VisibleForTesting static String nextLine ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  String s = scanner . nextLine ( ) ;
  while ( s . equals ( "" ) ) {
    s = scanner . nextLine ( ) ;
  }
  /* didwin */
  final boolean isGood = true ;
  final char c = 'T' ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    if ( Arrays . binarySearch ( grid . get ( i ) , c ) >= 0 ) {
      return "X won" ;
    }
    else if ( Arrays . binarySearch ( grid . get ( y ) , c ) >= 0 ) {
      return "O won" ;
    }
    else if ( Character . isDigit ( grid . get ( 4 - i - 1 ) , c ) ) {
      return "Game has not completed" ;
    }
    else {
      return "Draw" ;
    }
  }
  /* solve */
  final Object [ ] [ ] grid = new Object [ 4 ] [ 4 ] ;
  for ( int i = 0 ;
  i < grid . length ;
  i ++ ) {
    grid [ i ] = scanner . nextLine ( ) ;
  }
  /* if (didwin == X) return "X won"; else if (didwin == O) return "O won";/* if any of the grid has not completed */
  for ( int i = 0 ;
  i < grid . length ;
  i ++ ) {
    if ( grid [ i ] [ i ] == '.' ) {
      return "Game has not completed" ;
    }
    else {
      return "Draw" ;
    }
  }
  final int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final String sol = solve ( ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + sol ) ;
  }
  return s ;
}
