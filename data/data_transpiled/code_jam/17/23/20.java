public static int T = Integer . parseInt ( readLine ( ) ) {
  for ( int K = 0 ;
  K < T ;
  K ++ ) {
    int n = Integer . parseInt ( readLine ( ) ) ;
    int q = Integer . parseInt ( readLine ( ) ) ;
    int [ ] e = new int [ n ] , s = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int ei = Integer . parseInt ( readLine ( ) ) ;
      int si = Integer . parseInt ( readLine ( ) ) ;
      e [ i ] = ei ;
      s [ i ] = si ;
    }
    int [ ] [ ] dist = new int [ n ] [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) dist [ i ] [ i ] = Integer . parseInt ( readLine ( ) ) ;
    int [ ] [ ] nochange = new int [ n ] [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) for ( int j = 0 ;
    j < n ;
    j ++ ) nochange [ i ] [ j ] = dist [ i ] [ j ] ;
    for ( int k = 0 ;
    k < n ;
    k ++ ) for ( int i = 0 ;
    i < n ;
    i ++ ) if ( nochange [ i ] [ k ] > - 1 ) for ( int j = 0 ;
    j < n ;
    j ++ ) if ( ( i == j ) && ( j == i ) ) nochange [ i ] [ j ] = - 1 ;
    else if ( ( k = n ) > - 1 ) {
      int r = nochange [ i ] [ k ] + nochange [ k ] [ j ] ;
      if ( ( nochange [ i ] [ j ] == - 1 ) || ( r < change [ i ] [ j ] ) ) change [ i ] [ j ] = nochange [ i ] [ j ] * 1.0 / s [ i ] ;
    }
  }
  int [ ] [ ] change = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int j = 0 ;
  j < n ;
  j ++ ) {
    int r = change [ i ] [ k ] + change [ k ] [ j ] ;
    if ( ( i != j ) && ( change [ i ] [ k ] > - 1 ) && ( change [ i ] [ j ] > - 1 ) ) change [ i ] [ j ]