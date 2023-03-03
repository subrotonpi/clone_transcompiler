public static int [ ] [ ] getDigits ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] csf = new int [ N ] [ ] ;
  int t = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    csf [ i ] = new int [ ] {
      Integer . parseInt ( input . nextLine ( ) ) }
      ;
    }
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      t = 0 ;
      for ( int j = i ;
      j < N - 1 ;
      j ++ ) {
        if ( t < csf [ j ] [ 1 ] ) t = csf [ j ] [ 1 ] ;
        if ( t % csf [ j ] [ 2 ] == 0 ) t += csf [ j ] [ 0 ] ;
        else {
          t += csf [ j ] [ 2 ] - t % csf [ j ] [ 2 ] ;
          t += csf [ j ] [ 0 ] ;
        }
      }
      System . out . println ( t ) ;
    }
    System . out . println ( 0 ) ;
    return csf ;
  }
  