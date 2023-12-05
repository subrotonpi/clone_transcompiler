static final String [ ] args = new String [ ] {
  "Case #" + cnum + ": " + EE }
  ;
  {
    final int R = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int k = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int [ ] g = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    assert g . length == N ;
    final int [ ] [ ] E = new int [ N ] [ ] ;
    final int [ ] T = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final int [ ] gx = new int [ N ] ;
      g [ i ] = g [ i ] ;
      int [ ] sgx = gx ;
      for ( int j = 1 ;
      j < N ;
      j ++ ) {
        sgx [ j ] += sgx [ j - 1 ] ;
      }
      final int [ ] sgx2 = new int [ N ] ;
      for ( int j = 0 ;
      j < sgx . length ;
      j ++ ) {
        sgx2 [ j ] = sgx [ j ] ;
      }
      E [ i ] = sgx2 [ i ] - 1 ;
      T [ i ] = ( i + sgx2 . length ) % N ;
    }
    int [ ] EE = 0 ;
    int p = 0 ;
    while ( R > 0 ) {
      if ( ( R & 1 ) != 0 ) {
        EE += E [ p ] ;
        p = T [ p ] ;
      }
      E = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        E [ i ] = E [ i ] + E [ i ] ;
      }
      T = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        T [ i ] = T [ i ] ;
      }
      R /= 2 ;
    }
    System . out . println ( "Case #" + cnum + ": " + EE ) ;
  }
  