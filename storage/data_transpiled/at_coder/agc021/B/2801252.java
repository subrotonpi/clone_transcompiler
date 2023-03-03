static final int [ ] [ ] getPoints ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> H = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    H . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  List < List < Integer >> [ ] P = new List [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( i == j ) {
        continue ;
      }
      double rad = Math . atan2 ( H . get ( i ) . y - H . get ( j ) . y , H . get ( i ) . x - H . get ( j ) . x ) ;
      double mi = ( rad - Math . PI / 2 ) % ( 2 * Math . PI ) ;
      double ma = ( rad + Math . PI / 2 ) % ( 2 * Math . PI ) ;
      if ( ma > mi ) {
        if ( P [ i ] [ 0 ] >= P [ i ] [ 1 ] ) {
          if ( mi < P [ i ] [ 1 ] ) {
            P [ i ] = new List < > ( ) ;
          }
          else if ( ma > P [ i ] [ 0 ] ) {
            P [ i ] = new List < > ( ) ;
          }
          else {
            P [ i ] = new List < > ( ) ;
          }
          P [ i ] . add ( 0 , 0 ) ;
          break ;
        }
      }
      else {
        if ( P [ i ] [ 0 ] >= P [ i ] [ 1 ] ) {
          P [ i ] = new List < > ( ) ;
        }
        else if ( P [ i ] [ 0 ] == 0 && 2 * Math . PI ) {
          P [ i ] = new List < > ( ) ;
        }
        else {
          P [ i ] = new List < > ( ) ;
        }
      }
    }
  }
  for ( List < Integer > p : P ) {
    System . out . println ( ( p . get ( 1 ) - p . get ( 0 ) ) / ( 2 * Math . PI ) % 1 ) ;
  }
  return P ;
}
