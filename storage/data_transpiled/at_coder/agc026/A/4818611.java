public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int l = 0 ;
  int r = 0 ;
  int ans = 0 ;
  while ( l < n ) {
    while ( r < n && a [ l ] == a [ r ] ) {
      r ++ ;
    }
    int k = r - l ;
    if ( k > 1 ) {
      ans += k / 2 ;
    }
    l = r ;
  }
  System . out . println ( ans ) ;
}
