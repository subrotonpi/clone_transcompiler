public static double [ ] [ ] parse ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  List < Integer > xy = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) xy . add ( Integer . parseInt ( input ) ) ;
  List < Integer > xs = new ArrayList < > ( ) ;
  List < Integer > ys = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) xy . add ( Integer . parseInt ( input ) ) ;
  Collections . sort ( xs ) ;
  Collections . sort ( ys ) ;
  int [ ] [ ] grid = new int [ N + 1 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) grid [ i ] [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) grid [ i ] [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) for ( int j = 0 ;
  j < N ;
  j ++ ) grid [ i ] [ j ] = grid [ i ] [ j ] ;
  for ( int h = 0 ;
  h < N + 1 ;
  h ++ ) for ( int w = 1 ;
  w < N + 1 ;
  w ++ ) grid [ h ] [ w ] += grid [ h - 1 ] [ w ] ;
  for ( int w = 0 ;
  w < N + 1 ;
  w ++ ) for ( int h = 1 ;
  h < N + 1 ;
  h ++ ) grid [ h ] [ w ] += grid [ h - 1 ] [ w ] ;
  double ans = Double . POSITIVE_INFINITY ;
  for ( int l = 0 ;
  l < N ;
  l ++ ) {
    for ( int r = l + 1 ;
    r < N ;
    r ++ ) {
      for ( int b = 0 ;
      b < N ;
      b ++ ) {
        for ( int t = b + 1 ;
        t < N ;
        t ++ ) {
          int cnt = grid [ t + 1 ] [ r + 1 ] - grid [ b ] [ r + 1 ] - grid [ t + 1 ] [ l ] + grid [ b ] [ l ] ;
          int xl = xs . get ( l ) , xr = xs . get ( r ) ;
          int yb = ys . get ( b ) , yt = ys . get ( t ) ;
          if ( cnt >= K ) ans