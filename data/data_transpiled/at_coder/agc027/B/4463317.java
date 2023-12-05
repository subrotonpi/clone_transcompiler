public static int N = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) , X = Integer . parseInt ( input . nextLine ( ) ) ;
  int * xs , i ;
  int [ ] S = new int [ N + 1 ] ;
  int r = 0 ;
  for ( i = 0 ;
  i < N ;
  i ++ ) S [ i + 1 ] = r = xs [ i ] + r ;
  int ans = 10 * 30 ;
  for ( int k = 1 ;
  k <= N ;
  k ++ ) {
    r = ( S [ N ] - S [ N - k ] ) * 5 ;
    for ( int i = 1 ;
    i < ( N - 1 ) / k ;
    i ++ ) r += ( S [ N - k * i ] - S [ N - k * ( i + 1 ) ] ) * ( 2 * i + 3 ) ;
    int p = ( N - 1 ) / k ;
    r += ( S [ N - k * p ] ) * ( 2 * p + 3 ) ;
    ans = Math . min ( ans , r + ( k + N ) * X ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
