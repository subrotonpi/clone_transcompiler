public static void input ( ) {
  int MOD = 10 * 9 + 7 ;
  int [ ] dp = {
    1 , 0 , 0 , 0 }
    ;
    for ( char s : S ) {
      switch ( s ) {
        case 'A' : dp [ 1 ] += dp [ 0 ] ;
        break ;
        case 'B' : dp [ 2 ] += dp [ 1 ] ;
        break ;
        case 'C' : dp [ 3 ] += dp [ 2 ] ;
        break ;
        case '?' : dp [ 3 ] *= 3 ;
        dp [ 3 ] += dp [ 2 ] ;
        dp [ 2 ] *= 3 ;
        dp [ 2 ] += dp [ 1 ] ;
        dp [ 1 ] *= 3 ;
        dp [ 1 ] += dp [ 0 ] ;
        dp [ 0 ] *= 3 ;
        break ;
      }
      for ( int i = 0 ;
      i < 4 ;
      i ++ ) {
        dp [ i ] %= MOD ;
      }
    }
    System . out . println ( dp [ 3 ] ) ;
  }
  