static int [ ] [ ] solve ( ) {
  final int N = 500 ;
  final int P = 100003 ;
  int [ ] [ ] c = new int [ N + 1 ] [ N + 1 ] ;
  int [ ] [ ] f = new int [ N + 1 ] [ N + 1 ] ;
  int [ ] s = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    c [ i ] [ 0 ] = c [ i ] [ i ] = 1 ;
    for ( int j = 1 ;
    j < i ;
    j ++ ) {
      c [ i ] [ j ] = c [ i - 1 ] [ j ] + c [ i - 1 ] [ j - 1 ] ;
      if ( c [ i ] [ j ] >= P ) {
        c [ i ] [ j ] -= P ;
      }
    }
  }
  for ( int i = 2 ;
  i < N + 1 ;
  i ++ ) {
    s [ i ] = f [ i ] [ 1 ] = 1 ;
    for ( int j = 2 ;
    j < i ;
    j ++ ) {
      f [ i ] [ j ] = 0 ;
      for ( int k = 1 ;
      k < j ;
      k ++ ) {
        f [ i ] [ j ] += c [ i - j - 1 ] [ j - k - 1 ] * f [ j ] [ k ] ;
        f [ i ] [ j ] %= P ;
      }
      s [ i ] += f [ i ] [ j ] ;
      s [ i ] %= P ;
    }
  }
  int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( ;
  t <= t ;
  t ++ ) {
    int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    System . out . println ( "Case #" + t + ": " + s [ n ] ) ;
  }
  return s ;
}
