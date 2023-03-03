public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int counter = 0 ;
  int i = 0 ;
  while ( i < N - 1 ) {
    if ( ( a [ i ] == a [ i + 1 ] ) && ( a [ i ] == a [ i + 1 ] ) ) {
      counter ++ ;
      i ++ ;
    }
    i ++ ;
  }
  System . out . println ( counter ) ;
}
