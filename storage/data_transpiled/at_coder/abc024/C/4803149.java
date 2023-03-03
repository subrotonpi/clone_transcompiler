public static void main ( String input , int n , int d , int k ) {
  int [ ] [ ] s = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < d ;
  i ++ ) s [ i ] = new int [ n ] ;
  for ( int j = 0 ;
  j < k ;
  j ++ ) {
    int p = Integer . parseInt ( input ) ;
    int t = Integer . parseInt ( input ) ;
    for ( int i = 0 ;
    i < d ;
    i ++ ) {
      if ( s [ i ] [ 0 ] <= p && p <= s [ i ] [ 1 ] ) {
        if ( s [ i ] [ 0 ] <= t && t <= s [ i ] [ 1 ] ) break ;
        else if ( t <= s [ i ] [ 0 ] ) p = s [ i ] [ 0 ] ;
        else p = s [ i ] [ 1 ] ;
      }
    }
  }
  System . out . println ( i + 1 ) ;
}
