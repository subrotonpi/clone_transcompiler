public static int [ ] [ ] acc2 ( int [ ] [ ] grid ) {
  int H = grid . length ;
  int W = grid [ 0 ] . length ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W - 1 ;
    j ++ ) {
      grid [ i ] [ j + 1 ] += grid [ i ] [ j ] ;
    }
  }
  for ( int j = 0 ;
  j < W ;
  j ++ ) {
    for ( int i = 0 ;
    i < H - 1 ;
    i ++ ) {
      grid [ i + 1 ] [ j ] += grid [ i ] [ j ] ;
    }
  }
  int [ ] [ ] ngrid = new int [ W + 1 ] [ H + 1 ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    int [ ] line = new int [ W + 1 ] ;
    line [ 0 ] = 0 ;
    line [ 1 ] = grid [ i ] [ j ] ;
    ngrid [ i ] = line ;
  }
  return ngrid ;
}
@ SuppressWarnings ( "unused" ) int N = Integer . parseInt ( input ( ) ) ;
int K = Integer . parseInt ( input ( ) ) ;
int [ ] X = new int [ N ] ;
int [ ] Y = new int [ N ] ;
int [ ] [ ] info = new int [ N ] [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  int x = Integer . parseInt ( input ( ) ) ;
  int y = Integer . parseInt ( input ( ) ) ;
  X [ i ] = x ;
  Y [ i ] = y ;
  info [ i ] = new int [ N ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    X [ j ] = X [ i ] ;
    Y [ j ] = Y [ i ] ;
    acc [ i ] [ j ] ++ ;
  }
}
acc = acc2 ( acc ) ;
int ans = Integer . MIN_VALUE ;
for ( int t = 0 ;
t < N - 1 ;
t ++ ) {
  for ( int b = t + 1 ;
  b < N ;
  b ++ ) {
    for ( int l = 0 ;
    l < N - 1 ;
    l ++ ) {
      for ( int r = l + 1 ;
      r < N ;
      r ++ ) {
        int num = acc [ b + 1 ] [ r + 1 ] - acc [ b + 1 ] [ l ] - acc