public static int N = Integer . parseInt ( input ) {
  int [ ] nap = new int [ N ] ;
  nap [ 0 ] = 1 ;
  int [ ] X = new int [ 10000 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X [ i ] = 0 ;
  nap [ N ] = X ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int j = 1 ;
    j < 10002 ;
    j ++ ) {
      if ( nap [ nap . length - j ] == 1 ) nap [ nap . length - j + s ] = 1 ;
    }
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < 10001 ;
  i ++ ) {
    if ( nap [ i ] == 1 ) {
      if ( i % 10 != 0 ) ans = i ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
