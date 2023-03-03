private static int N ( int M ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  int [ ] B = new int [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = N ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    B [ i ] = M ;
  }
  int ai = 0 ;
  int bi = 0 ;
  int t = 0 ;
  int answer = 0 ;
  while ( ai < A . length && bi < B . length ) {
    if ( A [ ai ] < t ) {
      ai ++ ;
      continue ;
    }
    if ( B [ bi ] < A [ ai ] + X ) {
      bi ++ ;
      continue ;
    }
    answer ++ ;
    t = B [ bi ] + Y ;
  }
  System . out . println ( answer ) ;
  return answer ;
}
