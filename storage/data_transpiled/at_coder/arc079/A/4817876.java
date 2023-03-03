public static int [ ] [ ] getAB ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] ab = new int [ M ] [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    ab [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] A = new int [ N ] ;
  int [ ] B = new int [ N + 1 ] ;
  for ( int a = 0 ;
  a < A . length ;
  a ++ ) {
    int b = ab [ a ] [ 0 ] ;
    if ( a == 1 ) A [ a ] = b ;
    if ( b == N ) B [ a ] = 1 ;
  }
  for ( int a = 0 ;
  a < A . length ;
  a ++ ) {
    if ( B [ a ] == 1 ) {
      System . out . println ( "POSSIBLE" ) ;
      break ;
    }
  }
  else {
    System . out . println ( "IMPOSSIBLE" ) ;
  }
  return A ;
}
