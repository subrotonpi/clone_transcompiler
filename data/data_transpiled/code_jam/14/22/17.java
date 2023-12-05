public static int [ ] [ ] DP ( int tc ) {
  int A = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int B = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int K = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int [ ] [ ] dp = new int [ 31 ] [ 8 ] ;
  for ( int i = 0 ;
  i < dp . length ;
  i ++ ) {
    dp [ i ] [ 0 ] = - 1 ;
  }
  /* DP(int pos, int a, int b, int k) */
  if ( pos < 0 ) {
    return 1 ;
  }
  if ( dp [ pos ] [ a * 4 + b * 2 + k ] == - 1 ) {
    dp [ pos ] [ a * 4 + b * 2 + k ] = 0 ;
    int bita = ( A & ( 1 << pos ) ) == 0 ? 0 : 1 ;
    int bitb = ( B & ( 1 << pos ) ) == 0 ? 0 : 1 ;
    int bitk = ( K & ( 1 << pos ) ) == 0 ? 0 : 1 ;
    for ( int xa = 0 ;
    xa < 2 ;
    xa ++ ) {
      for ( int xb = 0 ;
      xb < 2 ;
      xb ++ ) {
        if ( a == 0 && bita == 0 && xa == 1 ) continue ;
        if ( b == 0 && bitb == 0 && xb == 1 ) continue ;
        int xk = xa & xb ;
        if ( k == 0 && bitk == 0 && xk == 1 ) continue ;
        int na = xa < bita ? 1 : a ;
        int nb = xb < bitb ? 1 : b ;
        int nk = xk < bitk ? 1 : k ;
        dp [ pos ] [ a * 4 + b * 2 + k ] += DP ( pos - 1 , na , nb , nk ) ;
      }
    }
  }
  return dp [ pos ] [ a * 4 + b * 2 + k ] ;
}
