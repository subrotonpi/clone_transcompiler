public static void print ( int r , int c , int d ) {
  int k = 0 ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    int [ ] a = new int [ c ] ;
    for ( int j = 0 ;
    j < c ;
    j ++ ) {
      int g = i + j ;
      if ( g <= d && ( d - g ) % 2 == 0 ) {
        k = Math . max ( a [ j ] , k ) ;
      }
    }
  }
  System . out . println ( k ) ;
}
