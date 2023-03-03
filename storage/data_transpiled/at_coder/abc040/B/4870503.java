@ VisibleForTesting static int from ( int input ) {
  int n = Integer . parseInt ( input ) ;
  int ans = 100005 ;
  for ( int w = 1 ;
  w <= n ;
  w ++ ) {
    int h = Math . floor ( n / w ) ;
    int x = Math . abs ( w - h ) + ( n - w * h ) ;
    if ( x < ans ) {
      ans = x ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
