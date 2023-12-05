public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] inputs = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    inputs [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = - 1 ;
  for ( int i = 0 ;
  i < N - 2 ;
  i ++ ) {
    if ( inputs [ i ] + inputs [ i + 1 ] + inputs [ i + 2 ] < K ) {
      ans = i + 3 ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
