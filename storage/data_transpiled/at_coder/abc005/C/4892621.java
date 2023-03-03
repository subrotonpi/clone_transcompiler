public static int T = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] B = new int [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) B [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N >= M ) {
    int i = 0 , j = 0 ;
    while ( i < M && j < N ) {
      if ( B [ i ] >= A [ j ] && B [ i ] <= A [ j ] + T ) {
        i ++ ;
        j ++ ;
      }
      else {
        j ++ ;
      }
    }
    if ( i == M ) {
      System . out . println ( "yes" ) ;
    }
    else if ( j == N ) {
      System . out . println ( "no" ) ;
    }
  }
  else {
    System . out . println ( "no" ) ;
  }
  return N ;
}
