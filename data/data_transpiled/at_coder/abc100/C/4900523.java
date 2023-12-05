public static void print ( int N ) {
  int [ ] As = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) As [ i ] = i ;
  int counter = 0 ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    while ( As [ i ] % 2 == 0 ) {
      As [ i ] /= 2 ;
      counter ++ ;
    }
  }
  System . out . println ( counter ) ;
}
