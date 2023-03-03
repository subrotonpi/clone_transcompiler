public static int [ ] [ ] readInput ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] relationMap = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int x = Integer . parseInt ( input . readLine ( ) ) ;
    int y = Integer . parseInt ( input . readLine ( ) ) ;
    relationMap [ x - 1 ] [ y - 1 ] = 1 ;
    relationMap [ y - 1 ] [ x - 1 ] = 1 ;
  }
  int member = 0 ;
  for ( int b = 1 ;
  b < 2 * N ;
  b ++ ) {
    String binary = Integer . toBinaryString ( b ) ;
    int [ ] candidate = new int [ N ] ;
    for ( int i = 0 ;
    i < list . length ( ) ;
    i ++ ) {
      candidate [ i ] = Integer . parseInt ( binary . substring ( 2 ) ) ;
    }
    boolean flag = true ;
    int cnt = 0 ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      if ( candidate [ i ] == 0 ) {
      }
      else {
        for ( int j = i + 1 ;
        j < N ;
        j ++ ) {
          if ( candidate [ j ] == 0 ) {
          }
          else {
            flag = relationMap [ i ] [ j ] == 1 ? true : false ;
          }
          if ( flag == false ) {
            break ;
          }
        }
      }
      if ( flag == false ) {
        break ;
      }
    }
    if ( flag == false ) {
      member = Math . max ( member , cnt ) ;
    }
    else {
      cnt = Arrays . stream ( candidate ) . mapToInt ( Integer :: intValue ) . sum ( ) ;
      member = Math . max ( member , cnt ) ;
    }
  }
  System . out . println ( member ) ;
  return relationMap ;
}
