public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] l = new int [ N ] ;
  l [ 0 ] = a [ 0 ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    l [ i ] = l [ i ] + a [ i + 1 ] ;
  }
  int ans = l [ K - 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans += l [ i + K ] - l [ i ] ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
