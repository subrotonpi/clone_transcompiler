static final int [ ] [ ] readIntN ( ) {
  final int readInt = Integer . parseInt ( System . in ) ;
  final int readIntN = Integer . parseInt ( System . in ) ;
  final int n = readInt ( ) ;
  final int M = 10 * 9 + 7 ;
  final int [ ] [ ] dp = new int [ n + 1 ] [ 256 ] ;
  dp [ 0 ] [ 255 ] = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j4 = 0 ;
    j4 <= 64 ;
    j4 += 128 ) {
      for ( int j3 = 0 ;
      j3 <= 16 ;
      j3 += 32 ) {
        final int j43 = j4 + j3 ;
        for ( int j2 = 0 ;
        j2 <= 4 ;
        j2 += 12 ) {
          final int j432 = j43 + j2 ;
          for ( int j1 = 0 ;
          j1 < 4 ;
          j1 ++ ) {
            int j = j432 + j1 ;
            final int l321 = 4 * ( j3 + j2 + j1 ) ;
            for ( int l0 = 0 ;
            l0 < 4 ;
            l0 ++ ) {
              if ( ( 6 == ( j3 + 4 * j1 + l0 ) ) || ( 6 == ( j3 + j2 + l0 ) ) || ( 6 == ( 4 * j2 + 4 * j1 + l0 ) ) || ( 6 == ( 16 * j1 + j2 + l0 ) ) || ( 6 == ( 4 * j2 + 4 * l0 + j1 ) ) ) {
                continue ;
              }
              int l = l321 + l0 ;
              dp [ i + 1 ] [ l ] = ( dp [ i + 1 ] [ l ] + dp [ i ] [ j ] ) % M ;
            }
          }
        }
      }
    }
  }
  int ret = 0 ;
  for ( int v : dp [ n - 1 ] ) {
    ret = ( ret + v ) % M ;
  }
  System . out . println ( ret ) ;
  return dp ;
}
