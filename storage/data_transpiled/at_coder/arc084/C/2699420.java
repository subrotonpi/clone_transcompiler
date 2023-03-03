public static int K = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( K % 2 == 0 ) {
    System . out . println ( Arrays . asList ( K / 2 ) + Arrays . asList ( K ) ) ;
  }
  else {
    int [ ] X = new int [ N / 2 ] ;
    X [ 0 ] = ( K + 1 ) / 2 ;
    for ( int i = 0 ;
    i < N / 2 ;
    i ++ ) {
      if ( X [ X . length - 1 ] == 1 ) {
        X [ X . length - 1 ] -- ;
      }
      else {
        X [ X . length - 1 ] -- ;
        X [ X . length - 1 ] = K ;
      }
    }
    System . out . println ( Arrays . asList ( X ) ) ;
  }
  return N ;
}
