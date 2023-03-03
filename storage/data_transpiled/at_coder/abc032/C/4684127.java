public static void main ( String input ) {
  int n = Integer . parseInt ( input ) , k = Integer . parseInt ( input ) ;
  int [ ] s = new int [ n ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) s [ i ] = Integer . parseInt ( input ) ;
  if ( 0 == s [ 0 ] ) {
    System . out . println ( n ) ;
  }
  else {
    int r = 0 , ans = 0 , g = 1 ;
    for ( int l = 0 ;
    l < n ;
    l ++ ) {
      while ( r < n && g * s [ r ] <= k ) {
        g *= s [ r ] ;
        r ++ ;
      }
      ans = Math . max ( ans , r - l ) ;
      if ( r == l ) r ++ ;
      else g /= s [ l ] ;
    }
    System . out . println ( ans ) ;
  }
}
