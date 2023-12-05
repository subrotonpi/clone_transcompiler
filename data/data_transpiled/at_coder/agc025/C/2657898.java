public static int N = Integer . parseInt ( input ) {
  int [ ] src = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) src [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] ls = new int [ N ] ;
  int [ ] rs = new int [ N ] ;
  for ( int l = 0 ;
  l < N ;
  l ++ ) {
    ls [ l ] = 0 ;
    rs [ l ] = 0 ;
  }
  int ans = 0 ;
  for ( int l = 0 ;
  l < N ;
  l ++ ) {
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( l <= r ) break ;
    ans += 2 * ( l - r ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
