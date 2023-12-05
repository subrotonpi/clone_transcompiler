public static int n = Integer . parseInt ( input ) {
  int [ ] [ ] x = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) x [ i ] [ 0 ] = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] y = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int s = x [ i + 1 ] [ 0 ] ;
    int t = x [ i ] [ 1 ] ;
    int r = x [ i + 2 ] [ 0 ] ;
    int q = x [ i ] [ 1 ] ;
    int p = x [ i ] [ 2 ] ;
    int w = x [ i ] [ 3 ] ;
    int temp = s - q ;
    int abso = Math . abs ( t - p ) + Math . abs ( r - w ) ;
    if ( temp < abso || ( temp % 2 != abso % 2 ) ) {
      System . out . println ( "No" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "Yes" ) ;
  return y ;
}
