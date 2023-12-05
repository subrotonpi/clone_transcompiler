public static int R = Integer . parseInt ( input ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  int MOD = 10 * 9 + 7 ;
  int DL = D + L ;
  /* comb the n and r */
  if ( n <= 0 || r < 0 || n < r ) return 0 ;
  int a = 1 , b = 1 ;
  for ( int i = n - r + 1 ;
  i <= n ;
  i ++ ) a *= i ;
  for ( int i = 2 ;
  i <= r ;
  i ++ ) b *= i ;
  /* comb the left and right */
  int L0 = comb ( X * Y , DL ) ;
  int L1 = comb ( ( X - 1 ) * Y , DL ) * 2 + comb ( X * ( Y - 1 ) , DL ) * 2 ;
  int L2 = comb ( ( X - 2 ) * Y , DL ) + comb ( X * ( Y - 2 ) , DL ) * 4 ;
  int L3 = comb ( ( X - 2 ) * Y , DL ) * 2 + comb ( X * Y , DL ) ;
  int L4 = X == Y == 1 ? 0 : comb ( ( X - 2 ) * Y , DL ) ;
  System . out . println ( ( R - X + 1 ) * ( C - Y + 1 ) * ( L0 - L1 + L2 - L3 + L4 ) * comb ( DL , D ) % MOD ) ;
  return L2 ;
}
