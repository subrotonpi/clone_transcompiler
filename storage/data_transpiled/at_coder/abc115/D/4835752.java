public static int N = Integer . parseInt ( input ) {
  int [ ] maisuu = new int [ N + 1 ] ;
  int [ ] patimaisuu = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    maisuu [ i ] = 2 * maisuu [ i - 1 ] + 3 ;
    patimaisuu [ i ] = 2 * patimaisuu [ i - 1 ] + 1 ;
  }
  /* Pati */
  if ( n == 0 ) {
    return 0 ;
  }
  else if ( l == 0 ) {
    return 1 ;
  }
  else if ( n == 1 ) {
    return 0 ;
  }
  else if ( 2 <= n && n <= maisuu [ l ] / 2 ) {
    return pati ( l - 1 , n - 1 ) ;
  }
  else {
    return pati ( l - 1 , n - maisuu [ l - 1 ] - 2 ) + 1 + patimaisuu [ l - 1 ] ;
  }
}
