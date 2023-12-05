public static int input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int P = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( A [ i ] % 2 == 1 ) {
      ODD ++ ;
    }
    else {
      EVE ++ ;
    }
  }
  /* CMB */
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int mod = 10 * 15 + 7 ;
  N = 10 * 5 ;
  int [ ] g1 = new int [ N + 1 ] ;
  int [ ] g2 = new int [ N + 1 ] ;
  int [ ] inverse = new int [ N + 1 ] ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    g1 [ i ] = ( g1 [ i - 1 ] * i ) % mod ;
    inverse [ i ] = ( - inverse [ mod % i ] * ( mod / i ) ) % mod ;
    g2 [ i ] = ( g2 [ i - 1 ] * inverse [ i - 1 ] ) % mod ;
  }
  int ans ;
  if ( P == 1 ) {
    int O = 0 ;
    int E = 1 ;
    for ( int i = 0 ;
    i < EVE ;
    i ++ ) {
      E += cmb ( EVE , i , mod ) ;
      E %= ( 10 * 10 * 15 + 7 ) ;
    }
    for ( int i = 0 ;
    i < ( ODD + 1 ) / 2 ;
    i ++ ) {
      O += cmb ( ODD , 1 + 2 * i , mod ) ;
    }
    ans = ( E * O ) % ( 10 * 10 * 15 + 7 ) ;
    System . out . println ( ans ) ;
  }
  else {
    int O = 0 ;
    int E = 1 ;
    for ( int i = 0 ;
    i < EVE ;
    i ++ ) {
      E += cmb ( EVE , i , mod ) ;
      E %= ( 10 * 10 * 15 + 7 ) ;
    }
    for ( int i = 0 ;
    i < ( ODD ) / 2 + 1 ;
    i ++ ) {
      O += cmb ( ODD , 2 * i , mod ) ;
    }
    ans = ( E * O ) % ( 10 * 10 + 7 ) ;
    System . out . println ( ans ) ;
  }
  return ans ;
}
