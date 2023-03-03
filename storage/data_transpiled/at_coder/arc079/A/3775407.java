public static int [ ] [ ] getPoints ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ N + 1 ] ;
  int [ ] y = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( a == 1 ) x [ b ] = 1 ;
    if ( b == N ) y [ a ] = 1 ;
  }
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    if ( x [ i ] == 1 && y [ i ] == 1 ) {
      System . out . println ( "POSSIBLE" ) ;
      break ;
    }
  }
  else {
    System . out . println ( "IMPOSSIBLE" ) ;
  }
  return x ;
}
