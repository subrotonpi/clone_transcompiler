public static void unite ( int n , int m ) {
  int [ ] s = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) s [ i ] = i ;
  int [ ] d = new int [ n + 1 ] ;
  /* root of the array */
  if ( s [ 0 ] == s [ 0 ] ) return ;
  int x = s [ 0 ] ;
  /* unite the array */
  int y = s [ 0 ] ;
  if ( x != y ) {
    if ( d [ x ] < d [ y ] ) {
      s [ x ] = y ;
      d [ y ] ++ ;
    }
    else {
      s [ y ] = x ;
      d [ x ] ++ ;
    }
  }
}
