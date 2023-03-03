public static int [ ] readInput ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int K = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] h = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    h [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int [ ] h2 = new int [ N ] ;
  h2 [ N ] = h ;
  int ans = 10 * 9 ;
  for ( int i = 0 ;
  i < N - K ;
  i ++ ) {
    if ( h2 [ i + K - 1 ] - h2 [ i ] < ans ) {
      ans = h2 [ i + K - 1 ] - h2 [ i ] ;
    }
  }
  System . out . println ( ans ) ;
  return h2 ;
}
