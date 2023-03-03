public static void input ( Scanner in ) {
  int [ ] [ ] dp = new int [ in . nextInt ( ) + 1 ] [ 4 ] ;
  dp [ 0 ] [ 3 ] = 1 ;
  long mod = 1000000007 ;
  for ( int i = 1 ;
  i <= in . nextInt ( ) ;
  i ++ ) {
    switch ( in . nextInt ( ) ) {
      case 'A' : dp [ i ] [ 0 ] += dp [ i - 1 ] [ 0 ] + dp [ i - 1 ] [ 3 ] ;
      dp [ i ] [ 1 ] += dp [ i - 1 ] [ 1 ] ;
      dp [ i ] [ 2 ] += dp [ i - 1 ] [ 2 ] ;
      dp [ i ] [ 3 ] += dp [ i - 1 ] [ 3 ] ;
      break ;
      case 'B' : dp [ i ] [ 0 ] += dp [ i - 1 ] [ 0 ] ;
      dp [ i ] [ 1 ] += dp [ i - 1 ] [ 1 ] + dp [ i - 1 ] [ 0 ] ;
      dp [ i ] [ 2 ] += dp [ i - 1 ] [ 2 ] ;
      dp [ i ] [ 3 ] += dp [ i - 1 ] [ 3 ] ;
      break ;
      case 'C' : dp [ i ] [ 0 ] += dp [ i - 1 ] [ 0 ] ;
      dp [ i ] [ 1 ] += dp [ i - 1 ] [ 1 ] ;
      dp [ i ] [ 2 ] += dp [ i - 1 ] [ 2 ] + dp [ i - 1 ] [ 1 ] ;
      dp [ i ] [ 3 ] += dp [ i - 1 ] [ 3 ] ;
      break ;
      default : dp [ i ] [ 0 ] += dp [ i - 1 ] [ 0 ] * 3 + dp [ i - 1 ] [ 3 ] ;
      dp [ i ] [ 1 ] += dp [ i - 1 ] [ 1 ] * 3 + dp [ i - 1 ] [ 0 ] ;
      dp [ i ] [ 2 ] += dp [ i - 1 ] [ 2 ] * 3 + dp [ i - 1 ] [ 1 ] ;
      dp [ i ] [ 3 ] += dp [ i - 1 ] [ 3 ] * 3 ;
      break ;
    }
  }
  System . out . println ( dp [ in . nextInt ( ) ] [ 2 ] ) ;
}
