public static int mod ( int mod ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] x = new int [ n ] ;
  int [ ] y = new int [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int xl = 0 ;
  int xt = 0 ;
  int yl = 0 ;
  int yt = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( i == 0 ) {
      for ( int j = 1 ;
      j < n ;
      j ++ ) {
        xt += x [ j ] - x [ i ] ;
      }
      xl = xt ;
    }
    else {
      xt -= ( x [ i ] - x [ i - 1 ] ) * ( n - i ) ;
      xl = ( xl + xt ) % mod ;
    }
  }
  return xl ;
}
