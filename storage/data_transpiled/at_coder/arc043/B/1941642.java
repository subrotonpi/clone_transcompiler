static final int [ ] [ ] binarySearch ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] src = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) src [ i ] = Integer . parseInt ( input ( ) ) ;
  Arrays . sort ( src ) ;
  if ( src [ 0 ] * 8 > src [ src . length - 1 ] ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  final int MOD = 10 * 9 + 7 ;
  int [ ] [ ] dp = new int [ 4 ] [ 4 ] ;
  for ( int j = 0 ;
  j < 4 ;
  j ++ ) dp [ 0 ] [ N - j ] = j ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) dp [ 0 ] [ N - i ] = i ;
  for ( int i = 1 ;
  i < 4 ;
  i ++ ) for ( int j = N - 1 ;
  j >= 0 ;
  j -- ) {
    if ( src [ j ] * ( 2 * i ) > src [ src . length - 1 ] ) continue ;
    int k = binarySearch ( src , src [ j ] * 2 ) ;
    dp [ i ] [ j ] = dp [ i ] [ j + 1 ] + dp [ i - 1 ] [ k ] ;
  }
  System . out . println ( dp [ 3 ] [ 0 ] % MOD ) ;
  return dp ;
}
