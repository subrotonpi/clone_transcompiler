public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  _A1 = Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  _A2 = Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] A1 = new int [ N ] ;
  int [ ] A2 = new int [ N ] ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    if ( i == 0 ) {
      A1 [ i ] = _A1 [ i ] ;
      A2 [ i ] = _A2 [ i ] ;
    }
    else {
      A1 [ i ] = A1 [ i - 1 ] + _A1 [ i ] ;
      A2 [ i ] = A2 [ i - 1 ] + _A2 [ i ] ;
    }
  }
  int sum = 0 ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    int u = A1 [ i ] ;
    int d ;
    if ( i == 0 ) {
      d = A2 [ N - 1 ] ;
    }
    else {
      d = A2 [ N - 1 ] - A2 [ i - 1 ] ;
    }
    sum = Math . max ( u + d , sum ) ;
  }
  System . out . println ( sum ) ;
  return A1 ;
}
