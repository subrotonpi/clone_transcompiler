public static int [ ] [ ] x ( int n , int y ) {
  int [ ] [ ] x = new int [ n + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < n + 1 - i ;
    j ++ ) {
      if ( y - 10000 * i - 5000 * j - 1000 * ( n - i - j ) == 0 ) {
        x = new int [ 3 ] [ 2 ] ;
        x [ 0 ] = i ;
        x [ 1 ] = j ;
        x [ 2 ] = n - i - j ;
        break ;
      }
      else {
      }
    }
  }
  if ( x [ 0 ] == 0 ) {
    System . out . println ( - 1 , - 1 , - 1 ) ;
  }
  else {
    System . out . println ( x [ 0 ] [ 0 ] + " " + x [ 1 ] [ 0 ] + " " + x [ 2 ] [ 0 ] ) ;
  }
  return x ;
}
