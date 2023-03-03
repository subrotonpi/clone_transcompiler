public static int prepare ( int n , int MOD ) {
  int f = 1 ;
  int [ ] factorials = new int [ n + 1 ] ;
  for ( int m = 1 ;
  m <= n ;
  m ++ ) {
    f *= m ;
    f %= MOD ;
    factorials [ m ] = f ;
  }
  int inv = Math . pow ( f , MOD - 2 , MOD ) ;
  int [ ] inverses = new int [ n + 1 ] ;
  inverses [ n ] = inv ;
  for ( int m = n ;
  m > 1 ;
  m -- ) {
    inv *= m ;
    inv %= MOD ;
    inverses [ m - 1 ] = inv ;
  }
  return factorials [ n ] ;
}
