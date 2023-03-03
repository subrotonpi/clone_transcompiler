public static void print ( int N ) {
  int [ ] A = Integer . parseInt ( input ( ) ) ;
  int [ ] B = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    B [ i ] = 0 ;
  }
  if ( N % 2 == 0 ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      B [ N / 2 + ( i / 2 + i % 2 ) * ( ( - 1 ) * ( i + 1 ) ) ] = A [ i ] ;
    }
  }
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    System . out . print ( B [ j ] + " " ) ;
  }
  System . out . println ( ) ;
}
