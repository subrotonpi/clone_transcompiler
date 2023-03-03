public static void print ( int n ) {
  char [ ] [ ] a = new char [ n ] [ 9 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = String . valueOf ( input . charAt ( i ) ) ;
  }
  int c = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < 9 ;
    j ++ ) {
      if ( a [ i ] [ j ] == 'x' ) {
        c ++ ;
      }
      if ( a [ i ] [ j ] == 'o' && a [ i + 1 ] [ j ] != 'o' ) {
        c ++ ;
      }
    }
  }
  System . out . println ( c ) ;
}
