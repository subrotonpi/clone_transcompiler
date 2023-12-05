public static int R = Integer . parseInt ( input ) {
  int X = Integer . parseInt ( input . readLine ( ) ) ;
  int Y = Integer . parseInt ( input . readLine ( ) ) ;
  int D = Integer . parseInt ( input . readLine ( ) ) ;
  int L = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] factorial = new int [ N + 1 ] ;
  /* mem factorial */
  factorial [ 0 ] = 1 ;
  factorial [ 1 ] = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    factorial [ i ] = factorial [ i - 1 ] * i ;
  }
  /* comb n */
  for ( int n = 0 ;
  n < Y + 1 ;
  n ++ ) {
    factorial [ n ] = factorial [ n ] / ( factorial [ r ] * factorial [ n - r ] ) ;
  }
  int [ ] [ ] table = new int [ Y + 1 ] [ X + 1 ] ;
  for ( int j = 0 ;
  j < X + 1 ;
  j ++ ) {
    for ( int i = 0 ;
    i < X + 1 ;
    i ++ ) {
      table [ j ] [ i ] = 0 ;
    }
  }
  /* calc */
  if ( x * y < D + L ) {
    return 0 ;
  }
  else if ( table [ x ] [ y ] == 0 ) {
    if ( x > 0 ) calc ( x - 1 , y ) ;
    if ( y > 0 ) calc ( x , y - 1 ) ;
    int sum = comb ( x * y , D + L ) * comb ( D + L , L ) ;
    for ( int i = 0 ;
    i < X + 1 ;
    i ++ ) {
      for ( int j = 0 ;
      j < Y + 1 ;
      j ++ ) {
        sum -= ( x - i + 1 ) * ( y - j + 1 ) * table [ i ] [ j ] ;
      }
    }
    table [ x ] [ y ] = sum ;
    return sum ;
  }
  else {
    return table [ x ] [ y ] ;
  }
}
