public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int [ ] S = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) S [ i ] = Integer . parseInt ( input ) ;
  int ans = 0 ;
  int res = 1 ;
  int l = 0 ;
  for ( int r = 0 ;
  r < n ;
  r ++ ) {
    res *= S [ r ] ;
    if ( res > k ) {
      res /= S [ l ] ;
      l ++ ;
    }
    ans = Math . max ( ans , r - l + 1 ) ;
  }
  if ( 0 == S [ 0 ] ) System . out . println ( n ) ;
  else System . out . println ( ans ) ;
}
