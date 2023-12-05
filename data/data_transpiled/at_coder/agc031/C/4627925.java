public static int [ ] [ ] parse ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int A = Integer . parseInt ( input ) ;
  int B = Integer . parseInt ( input ) ;
  int M = 2 * ( N - 1 ) ;
  if ( N == 1 ) {
    System . out . println ( "YES" ) ;
    System . out . println ( A + " " + B ) ;
    exit ( ) ;
  }
  int [ ] gray = new int [ M ] ;
  gray [ 0 ] = 0 ;
  for ( int i = 1 ;
  i < M ;
  i ++ ) gray [ i ] = gray [ gray . length - 1 ] ^ ( i & ( - i ) ) ;
  int [ ] [ ] grid = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) grid [ i ] = gray [ i ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) grid [ i ] [ 0 ] = i + M ;
  int sx = grid [ i ] [ 0 ] ;
  int sy = grid [ i ] [ 1 ] ;
  int gx = grid [ i ] [ 2 ] ;
  int gy = grid [ i ] [ 3 ] ;
  if ( ( Math . abs ( sx - gx ) + Math . abs ( sy - gy ) ) % 2 != 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
    exit ( ) ;
  }
  List ans = new ArrayList ( ) ;
  ans . add ( A ) ;
  int x = sx , y = sy ;
  while ( ( gx - x ) % M != 1 ) ans . add ( grid [ y ] [ x ] ) ;
  y = 1 - y ;
  ans . add ( grid [ y ] [ x ] ) ;
  if ( x == gx ) break ;
  return ans . toArray ( ) ;
}
