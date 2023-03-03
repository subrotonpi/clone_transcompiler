public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] B = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) B [ i ] = new int [ N ] ;
  int [ ] [ ] A = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A [ i ] [ i ] = 0 ;
  for ( int x = 0 ;
  x < N - 2 ;
  x ++ ) for ( int y = 0 ;
  y < M ;
  y ++ ) A [ x ] [ y ] -= t ;
  return 0 ;
}
