* , S = map ( ord , s ) ) ) public static int [ ] solve ( int i ) {
  int MOD = 10 * 9 + 7 ;
  int base = 3 ;
  int L = S . length ;
  int [ ] data = new int [ L + 1 ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) data [ i + 1 ] = ( data [ i ] * base + S [ i ] ) % MOD ;
  /* get the value */
  int l = ( data [ r ] - data [ l ] * pw [ r - l ] ) % MOD ;
  int [ ] pw = new int [ L / 2 + 1 ] ;
  for ( int i = 0 ;
  i < L / 2 + 1 ;
  i ++ ) pw [ i ] = Math . pow ( base , i , MOD ) ;
  /* solve */
  int R = L - i ;
  if ( S [ i ] != S [ 0 ] || S [ i - 1 ] != S [ S . length - 1 ] ) return 0 ;
  int left = 1 ;
  int right = R ;
  while ( left + 1 < right ) {
    int mid = ( left + right ) / 2 ;
    if ( get ( 0 , mid ) == get ( i , i + mid ) ) left = mid ;
    else right = mid ;
  }
  int A = left ;
  int T = R - A ;
  if ( get ( i - T , i ) != get ( L - T , L ) ) return 0 ;
  left = T ;
  right = R ;
  while ( left + 1 < right ) {
    int mid = ( left + right ) / 2 ;
    if ( get ( i - mid , i ) == get ( L - mid , L ) ) left = mid ;
    else right = mid ;
  }
  int C = left ;
  return A + C - R + 1 ;
}
