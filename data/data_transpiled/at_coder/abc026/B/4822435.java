@ VisibleForTesting static double pi ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] r = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    r [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( r ) ;
  double ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i % 2 == 0 ) ans += r [ i ] * r [ i ] ;
    else ans -= r [ i ] * r [ i ] ;
  }
  System . out . println ( abs ( ans ) * PI ) ;
  return ans ;
}
