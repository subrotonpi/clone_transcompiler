public static void print ( int n , int t ) {
  int [ ] p = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) p [ i ] = i ;
  a = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( p [ i - 1 ] + t < p [ i ] ) {
      a += t ;
      s = p [ i ] ;
    }
    else {
      a += p [ i ] - p [ i - 1 ] ;
    }
  }
}
