public static int [ ] [ ] solve ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    X [ i ] = A [ i ] + A [ i + 1 ] ;
  }
  int xi ;
  if ( ArrayUtils . isNotEmpty ( X ) ) {
    System . out . println ( "Possible" ) ;
    for ( int i = 0 ;
    i < X . length ;
    i ++ ) {
      if ( X [ i ] >= L ) {
        xi = i ;
        break ;
      }
    }
    for ( int i = 1 ;
    i < xi ;
    i ++ ) {
      System . out . println ( X [ i ] ) ;
    }
    for ( int i = xi + 1 ;
    i < N ;
    i ++ ) {
      System . out . println ( X [ i ] ) ;
    }
    System . out . println ( xi ) ;
  }
  else {
    System . out . println ( "Impossible" ) ;
  }
  return X ;
}
