public static int N ( String input ) {
  int k = Integer . parseInt ( input ) ;
  int [ ] B = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) B [ i ] = Integer . parseInt ( input ) - 1 ;
  int [ ] L = new int [ N ] ;
  a = 0 , l = 0 ;
  while ( k > 0 ) {
    k -- ;
    l ++ ;
    a = B [ a ] ;
  }
  return l ;
}
