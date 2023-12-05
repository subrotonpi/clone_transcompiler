static final int getRank ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = i ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( a [ i ] > a [ i ] ) ans += a [ i ] ;
    if ( a [ i ] < a [ i ] ) ans += a [ i ] - a [ i ] ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
