public static void print ( int n ) {
  int [ ] [ ] a = new int [ n + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] [ i ] = 0 ;
  }
  int np = ( n / 2 ) * 2 ;
  for ( int i = 0 ;
  np <= np / 2 ;
  i ++ ) {
    a [ i + 1 ] [ np - i ] = - 1 ;
  }
  System . out . println ( ( int ) ( n * ( n - 1 ) / 2 - ( n / 2 ) ) ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j <= n ;
    j ++ ) {
      if ( a [ i ] [ j ] == - 1 ) {
        continue ;
      }
      else {
        System . out . println ( i + " " + j ) ;
      }
    }
  }
}
