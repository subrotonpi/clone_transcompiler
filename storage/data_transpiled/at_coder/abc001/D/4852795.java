public static void inputRailList ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    inputRailList . add ( new LinkedList < String > ( ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < 2 ;
    j ++ ) {
      int fixValue = Integer . parseInt ( inputRailList . get ( i ) . get ( j ) . substring ( inputRailList . get ( i ) . get ( j ) . length ( ) - 2 ) ) % 5 ;
      if ( j == 1 && fixValue != 0 ) {
        fixValue = - ( 5 - fixValue ) ;
      }
      inputRailList . set ( i , j , Integer . parseInt ( inputRailList . get ( i ) . get ( j ) ) - fixValue ) ;
      if ( inputRailList . get ( i ) . get ( j ) . toString ( ) . substring ( inputRailList . get ( i ) . toString ( ) . length ( ) - 2 ) . equals ( "60" ) ) {
        inputRailList . set ( i , j , 40 ) ;
      }
    }
  }
  ArrayList < String > rain_list = new ArrayList < String > ( inputRailList ) ;
  int i = 0 ;
  while ( i < rain_list . size ( ) - 1 ) {
    if ( rain_list . get ( i ) . get ( 0 ) . compareTo ( rain_list . get ( i + 1 ) . get ( 0 ) ) <= 0 && rain_list . get ( i + 1 ) . get ( 0 ) . compareTo ( rain_list . get ( i ) . get ( 1 ) . get ( 1 ) ) < 0 ) {
      if ( rain_list . get ( i ) . get ( 1 ) . compareTo ( rain_list . get ( i + 1 ) . get ( 1 ) ) < 0 ) {
        rain_list . set ( i , rain_list . get ( i + 1 ) . get ( 1 ) ) ;
      }
      rain_list . remove ( i + 1 ) ;
    }
    else {
      i ++ ;
    }
  }
  for ( String [ ] rain : rain_list ) {
    System . out . println ( rain [ 0 ] + "-" + rain [ 1 ] ) ;
  }
}
