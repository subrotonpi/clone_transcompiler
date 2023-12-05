public static void print ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] S = new int [ 2 ] ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) S [ i ] = input . nextInt ( ) ;
  int [ ] dp = new int [ N + 1 ] ;
  dp [ 0 ] = 1 ;
  int mod = 10 * 9 + 7 ;
  int i = 0 ;
  int st = 0 ;
  while ( i < N ) {
    if ( S [ 0 ] [ i ] == S [ 1 ] [ i ] && st == 0 ) {
      dp [ i + 1 ] = dp [ i ] * 3 ;
      st = 1 ;
    }
    else if ( S [ 0 ] [ i ] == S [ 1 ] [ i ] && st == 1 ) dp [ i + 1 ] = dp [ i ] * 2 % mod ;
    else if ( S [ 0 ] [ i ] == S [ 1 ] [ i ] && st == 2 ) {
      dp [ i + 1 ] = dp [ i ] ;
      st = 1 ;
    }
    else if ( S [ 0 ] [ i ] != S [ 1 ] [ i ] && st == 0 ) {
      dp [ i + 2 ] = dp [ i ] * 6 ;
      st = 2 ;
    }
    else if ( S [ 0 ] [ i ] != S [ 1 ] [ i ] && st == 1 ) dp [ i + 2 ] = dp [ i ] * 2 % mod ;
    else if ( S [ 0 ] [ i ] == S [ 1 ] [ i ] ) i ++ ;
    else i += 2 ;
  }
  System . out . println ( dp [ N ] % mod ) ;
}
