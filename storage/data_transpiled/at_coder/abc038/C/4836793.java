public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( String _ : input ( ) . split ( " " ) ) {
    a [ l ] = Integer . parseInt ( _ ) ;
  }
  int r = 0 ;
  int ans = 0 ;
  for ( int l = 0 ;
  l < n ;
  l ++ ) {
    while ( r < n - 1 && a [ r ] < a [ r + 1 ] ) {
      r ++ ;
    }
    ans += r - l + 1 ;
    if ( r == l ) r ++ ;
  }
  System . out . println ( ans ) ;
}
