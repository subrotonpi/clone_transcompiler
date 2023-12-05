public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] * A = Integer . parseInt ( input ) ;
  int MOD = 10 * 9 + 7 ;
  int [ ] S = new int [ N + 1 ] ;
  int r = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) S [ i ] = r = ( r + Math . pow ( i , MOD - 2 , MOD ) ) % MOD ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) ans += A [ i ] * ( S [ i + 1 ] + S [ N - i ] - 1 ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) ans = ans * i % MOD ;
  System . out . println ( ans ) ;
}
