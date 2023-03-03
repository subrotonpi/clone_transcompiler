public static int parseInt ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int mod = 10 * 9 + 7 ;
  int P = 10 * 5 ;
  int [ ] g1 = {
    1 , 1 }
    ;
    for ( int i = 2 ;
    i <= P ;
    i ++ ) {
      g1 [ i ] = ( g1 [ g1 . length - 1 ] * i ) % mod ;
    }
    switch ( Math . abs ( N - M ) ) {
      case 0 : System . out . println ( g1 [ N ] * g1 [ M ] * 2 % mod ) ;
      break ;
      case 1 : System . out . println ( g1 [ N ] * g1 [ M ] % mod ) ;
      break ;
      default : System . out . println ( 0 ) ;
      break ;
    }
    return ( int ) ( g1 [ M ] * g1 [ M ] ) ;
  }
  