public static int MOD = 10 * 9 + 7 ;
int n = Integer . parseInt ( input ) ;
int [ ] x = {
  1 , 2 , 1 }
  ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int [ ] y = new int [ 3 ] ;
    y [ 0 ] = ( 3 * x [ 0 ] + x [ 1 ] * x [ 1 ] ) % MOD ;
    y [ 1 ] = ( x [ 1 ] * x [ 2 ] + x [ 1 ] * ( 2 * x [ 1 ] * x [ 2 ] - x [ 2 ] * x [ 2 ] ) ) % MOD ;
    y [ 2 ] = ( x [ 1 ] * x [ 2 ] + x [ 2 ] * ( 2 * x [ 1 ] * x [ 2 ] - x [ 2 ] * x [ 2 ] ) ) % MOD ;
    x = y ;
  }
  System . out . println ( x [ 0 ] ) ;
  return x [ 1 ] ;
}
