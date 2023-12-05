public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] a = new int [ 2 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) a [ i ] [ 0 ] = i ;
  int [ ] [ ] dp = new int [ N + 1 ] [ N + 1 ] ;
  for ( int y = 1 ;
  y < 3 ;
  y ++ ) for ( int x = 1 ;
  x < N + 1 ;
  x ++ ) dp [ y ] [ x ] = Math . max ( dp [ y - 1 ] [ x ] , dp [ y ] [ x - 1 ] ) ;
  return dp [ dp . length - 1 ] [ dp [ y - 1 ] ] ;
}
