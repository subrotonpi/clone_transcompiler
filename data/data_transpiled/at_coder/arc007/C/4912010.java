public static int input ( ) {
  String C = input ( ) . replace ( 'o' , '1' ) . replace ( 'x' , '0' ) ;
  int P = Integer . parseInt ( C , 2 ) ;
  int N = C . length ( ) ;
  int ans = N ;
  int mask = 2 * ( 2 * N - 1 ) - 2 * ( N - 1 ) ;
  for ( int b = 1 ;
  b < 2 * N ;
  b ++ ) {
    int ptn = 0 ;
    int cnt = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( ( b & ( 1 << i ) ) == 0 ) continue ;
      cnt ++ ;
      ptn |= ( P << i ) ;
      ptn |= ( P << ( i + N ) ) ;
    }
    if ( ( ptn & mask ) == mask ) ans = Math . min ( ans , cnt ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
