public static int C = Integer . parseInt ( input ) {
  int [ ] ans = {
    0 , 0 , 0 }
    ;
    for ( int i = 0 ;
    i < C ;
    i ++ ) {
      List < Integer > item = Lists . newArrayList ( ) ;
      item . add ( i ) ;
      for ( int j = 0 ;
      j < 3 ;
      j ++ ) {
        ans [ j ] = Math . max ( ans [ j ] , item . get ( j ) ) ;
      }
    }
    return ans [ 0 ] * ans [ 1 ] * ans [ 2 ] ;
  }
  