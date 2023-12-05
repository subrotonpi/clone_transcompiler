public static void print ( int n ) {
  int [ ] s = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) s [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ 10 * 5 + 1 ] ;
  int ans = 0 , r = 0 ;
  for ( int l = 0 ;
  l < n ;
  l ++ ) {
    while ( r < n && a [ s [ r ] ] == 0 ) {
      a [ s [ r ] ] ++ ;
      r ++ ;
    }
    ans = Math . max ( ans , r - l ) ;
    if ( r == l ) r ++ ;
    else a [ s [ l ] ] -- ;
  }
  System . out . println ( ans ) ;
}
