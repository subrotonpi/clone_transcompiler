static public String spinningBlade ( int R , int C , int D , int [ ] [ ] ms ) throws IOException {
  final int len = Math . min ( R , C ) ;
  for ( int K = 3 ;
  K <= Math . min ( R , C ) ;
  K ++ ) {
    for ( int i = 0 ;
    i <= R - K ;
    i ++ ) {
      for ( int j = 0 ;
      j <= C - K ;
      j ++ ) {
        final int [ ] cm = {
          0 , 0 }
          ;
          int m = 0 ;
          for ( int x = 0 ;
          x <= K ;
          x ++ ) {
            for ( int y = 0 ;
            y <= K ;
            y ++ ) {
              final int a = ms [ y + j ] [ x + i ] ;
              cm [ 0 ] += x * a ;
              cm [ 1 ] += y * a ;
              m += a ;
            }
          }
          m -= ms [ j ] [ i ] ;
          final int a = ms [ j + K - 1 ] [ i ] ;
          cm [ 1 ] -= ( K - 1 ) * a ;
          m -= a ;
          a = ms [ j ] [ i + K - 1 ] ;
          cm [ 0 ] -= ( K - 1 ) * a ;
          cm [ 1 ] -= ( K - 1 ) * a ;
          m -= a ;
          if ( cm [ 0 ] == cm [ 1 ] == ( K - 1 ) * m / 2 ) return Integer . toString ( K ) ;
        }
      }
    }
    return "IMPOSSIBLE" ;
  }
  