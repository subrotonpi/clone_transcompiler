public static int n ( int k , int ... s ) {
  int ans = 0 ;
  int x = 1 ;
  int l = 0 ;
  for ( int r = 0 ;
  r < n ;
  r ++ ) {
    x *= s [ r ] ;
    if ( x > k ) {
      x /= s [ l ] ;
      l ++ ;
    }
    ans = Math . max ( ans , r - l + 1 ) ;
  }
  if ( 0 == s . length ) {
    System . out . println ( s . length ) ;
  }
  else {
    System . out . println ( ans ) ;
  }
  return ans ;
}
