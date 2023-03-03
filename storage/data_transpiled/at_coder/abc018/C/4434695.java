static final Scanner in = new Scanner ( System . in ) {
  @ Override public int next ( ) {
    String in = System . in . nextLine ( ) ;
    int R = Integer . parseInt ( in ) ;
    int C = Integer . parseInt ( in ) ;
    int K = Integer . parseInt ( in ) ;
    int [ ] [ ] imo = new int [ R + 1 ] [ C + 1 ] ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      String s = in . nextLine ( ) ;
      for ( int j = 0 ;
      j < C ;
      j ++ ) {
        if ( ( s . charAt ( j ) == 'x' ) && ( s . charAt ( j ) == 'y' ) ) {
          for ( int k = 0 ;
          k < K ;
          k ++ ) {
            if ( ( i - k >= 0 ) && ( i + k < R ) ) {
              imo [ i - k ] [ Math . max ( 0 , j - K + k + 1 ) ] ++ ;
              imo [ i - k ] [ Math . min ( C , j + K - k ) ] -- ;
            }
            if ( ( i + k < R ) && ( i + k < R ) ) {
              imo [ i + k ] [ Math . max ( 0 , j - K + k + 1 ) ] ++ ;
              imo [ i + k ] [ Math . min ( C , j + K - k ) ] -- ;
            }
          }
        }
      }
    }
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      for ( int j = 1 ;
      j <= C ;
      j ++ ) {
        imo [ i ] [ j ] += imo [ i ] [ j - 1 ] ;
      }
    }
    int ans = 0 ;
    for ( int y = K - 1 ;
    y <= C - K ;
    y ++ ) {
      for ( int x = K - 1 ;
      x <= R - K ;
      x ++ ) {
        if ( ( imo [ x ] [ y ] == 0 ) && ( imo [ y ] [ x ] == 0 ) ) ans ++ ;
      }
    }
    System . out . println ( ans ) ;
    return ans ;
  }
}
