public static void print ( int n ) {
  int [ ] a = new int [ 9 ] ;
  int b = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String x = input . next ( ) ;
    for ( int j = 0 ;
    j < 9 ;
    j ++ ) {
      if ( x . charAt ( j ) == 'o' ) {
        b += ( a [ j ] == 0 ) ? 1 : 0 ;
        a [ j ] = 1 ;
      }
      else {
        b += ( x . charAt ( j ) == 'x' ) ? 1 : 0 ;
        a [ j ] = 0 ;
      }
    }
  }
  System . out . println ( b ) ;
}
