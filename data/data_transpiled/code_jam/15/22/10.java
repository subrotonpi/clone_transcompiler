static final int [ ] solve ( int [ ] [ ] args ) {
  int tc = Integer . parseInt ( args [ 0 ] [ 0 ] ) ;
  for ( int tmpTC = xrange ( tc ) ;
  tmpTC < tc ;
  tmpTC ++ ) {
    Arrays . fill ( args , ( ) -> {
      int R = Integer . parseInt ( args [ tmpTC ] [ 0 ] ) ;
      int C = Integer . parseInt ( args [ tmpTC ] [ 1 ] ) ;
      int NN = Integer . parseInt ( args [ tmpTC ] [ 2 ] ) ;
      int res = 0 ;
      if ( NN == 0 ) res = 0 ;
      else {
        for ( int bt = 0 ;
        bt <= 1 ;
        bt ++ ) {
          int N = NN ;
          int q = 0 , ns [ ] = new int [ 5 ] ;
          for ( int x : xrange ( R ) ) {
            for ( int y : xrange ( C ) ) {
              if ( ( x + y ) % 2 == bt ) q ++ ;
              else {
                int w = 4 ;
                if ( x == 0 ) w -- ;
                if ( x == R - 1 ) w -- ;
                if ( y == 0 ) w -- ;
                if ( y == C - 1 ) w -- ;
                ns [ w ] ++ ;
              }
            }
          }
          int tmp = 0 ;
          N -= q ;
          for ( int i = 0 ;
          i < ns . length ;
          i ++ ) {
            int n = ns [ i ] ;
            if ( 0 < N ) {
              tmp += i * Math . min ( N , n ) ;
              N -= n ;
            }
          }
          if ( res == 0 || tmp < res ) res = tmp ;
        }
      }
      System . out . println ( "Case #" + ( tmpTC + 1 ) + ": " + res ) ;
    }
  }
  return args ;
}
