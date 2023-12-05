public static void print ( int n ) {
  int [ ] s = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) s [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int r = 1 , ans = 0 ;
  for ( int l = 0 ;
  l < n ;
  l ++ ) {
    while ( r < n && ( r <= l || s [ r - 1 ] < s [ r ] ) ) r ++ ;
    ans += r - l ;
    if ( l == r ) r ++ ;
  }
  System . out . println ( ans ) ;
}
