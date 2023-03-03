public static void print ( int n ) {
  int [ ] s = Integer . parseInt ( input ( ) ) ;
  int [ ] p = new int [ 10 * 5 + 1 ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    p [ i ] = 0 ;
  }
  int r = 0 , ans = 0 ;
  for ( int l = 0 ;
  l < n ;
  l ++ ) {
    while ( r < n && p [ s [ r ] ] == 0 ) {
      p [ s [ r ] ] ++ ;
      r ++ ;
    }
    ans = Math . max ( ans , r - l ) ;
    if ( l == r ) r ++ ;
    else p [ s [ l ] ] -- ;
  }
  System . out . println ( ans ) ;
}
