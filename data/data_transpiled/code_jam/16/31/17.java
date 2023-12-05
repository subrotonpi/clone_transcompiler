public static int T = Integer . parseInt ( input ) {
  for ( int test = 1 ;
  test <= T ;
  test ++ ) {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] A = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    System . out . print ( "Case #" + test + ": " ) ;
    if ( N > 2 ) {
      while ( Arrays . binarySearch ( A , 2 ) > 0 ) {
        int best = - 1 ;
        int where = 0 ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          if ( A [ i ] > best ) {
            best = A [ i ] ;
            where = i ;
          }
        }
        System . out . print ( ( char ) ( 'A' + where ) ) ;
        A [ where ] -- ;
      }
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        if ( A [ i ] > 0 ) {
          System . out . print ( ( char ) ( 'A' + i ) ) ;
        }
      }
      System . out . println ( ) ;
    }
    else {
      for ( int i = 0 ;
      i < A [ 0 ] ;
      i ++ ) {
        System . out . print ( "AB " ) ;
      }
      System . out . println ( ) ;
    }
  }
  return T ;
}
