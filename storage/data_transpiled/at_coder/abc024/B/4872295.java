public static int N ( ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] times = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) times [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = N * T ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    if ( times [ i + 1 ] - times [ i ] < T ) ans -= T - ( times [ i + 1 ] - times [ i ] ) ;
  }
  return ans ;
}
