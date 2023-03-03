public static void main ( String [ ] args ) {
  Arrays . stream ( input . split ( " " ) ) . forEach ( K -> {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] r = null ;
    if ( K == 1 ) {
      r = new int [ ( N + 1 ) / 2 ] ;
    }
    else if ( K % 2 == 0 ) {
      r = new int [ K / 2 ] ;
      r [ N - 1 ] = K ;
    }
    else {
      int t = N / 2 ;
      int x = ( int ) ( Math . log ( N * ( K - 1 ) + 1 ) - 1 ) ;
      while ( t < ( ( K * ( x + 1 ) - 1 ) / ( K - 1 ) + x ) / 2 ) {
        x -- ;
      }
      x ++ ;
      r = new int [ N - x ] ;
      r [ N - x ] = ( K * ( x + 1 ) - 1 ) / ( K - 1 ) + x ;
      t = ( ( K * ( x + 1 ) - 1 ) / ( K - 1 ) + x ) / 2 - t ;
      for ( int i = x ;
      i > 0 ;
      i -- ) {
        r [ N - i ] = 1 ;
        t -- ;
        for ( int j = 0 ;
        j < K - 1 ;
        j ++ ) {
          if ( t == 0 ) {
            break ;
          }
          if ( K * K - i - 1 <= t * ( K - 1 ) ) {
            r [ N - i ] ++ ;
            t -= ( K * K - i - 1 ) / ( K - 1 ) ;
          }
        }
        if ( t == 0 ) {
          break ;
        }
      }
      for ( int i = r . length - 1 ;
      i >= 0 ;
      i -- ) {
        if ( r [ i ] == 0 ) {
          r [ -- N - i ] = 1 ;
        }
        else {
          break ;
        }
      }
    }
    System . out . println ( Arrays . toString ( r ) ) ;
  }
  ) ;
}
