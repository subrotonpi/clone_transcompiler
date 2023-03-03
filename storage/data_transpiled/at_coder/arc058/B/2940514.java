public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = 10 * 9 + 7 , S = H + W - 2 ;
  int [ ] factN = new int [ S + 1 ] ;
  int [ ] factInv = new int [ S + 1 ] ;
  for ( int i = 0 ;
  i < S ;
  i ++ ) factN [ i ] = 0 ;
  for ( int j = 0 ;
  j < S + 1 ;
  j ++ ) factInv [ j ] = 0 ;
  /* combination */
  if ( n == 0 && r == 0 ) {
    return 1 ;
  }
  else if ( n < r || n < 0 ) {
    return 0 ;
  }
  int res = factN [ n ] * factInv [ r ] % M ;
  /* main */
  factN [ 0 ] = factInv [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= S ;
  i ++ ) factN [ i ] = factN [ i - 1 ] * i % M ;
  factInv [ S ] = Math . pow ( factN [ S ] , M - 2 , M ) ;
  for ( int i = S - 1 ;
  i > 0 ;
  i -- ) factInv [ i ] = factInv [ i + 1 ] * ( i + 1 ) % M ;
  int com = 0 , bef = 0 ;
  for ( int i = 0 ;
  i < B ;
  i ++ ) {
    int c1 = combination ( H - A + i , H - A ) , c2 = combination ( S - H + A - i , A - 1 ) ;
    int tmp = ( c1 - bef ) * c2 % M ;
    bef += c1 - bef ;
    com -= tmp ;
    if ( com < 0 ) com += M ;
  }
  System . out . println ( com ) ;
  if ( __name__ . equals ( "main" ) ) {
    main ( ) ;
  }
  return M ;
}
