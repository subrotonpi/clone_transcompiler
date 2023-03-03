public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] X = new int [ N ] [ 2 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    X [ i ] [ 0 ] = - 1 ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( a == 1 ) {
      if ( X [ b ] [ 1 ] > 0 ) {
        System . out . println ( "POSSIBLE" ) ;
        break ;
      }
      else {
        X [ b ] [ 0 ] = 1 ;
      }
    }
    if ( b == N ) {
      if ( X [ a ] [ 0 ] > 0 ) {
        System . out . println ( "POSSIBLE" ) ;
        break ;
      }
      else {
        X [ a ] [ 1 ] = 1 ;
      }
    }
  }
  return X [ 0 ] [ 0 ] ;
}
