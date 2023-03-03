static final void solve ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a == b ) {
    System . out . println ( 1 ) ;
    return ;
  }
  int t = a ^ b ;
  int N = Integer . numberOfTrailingZeros ( t ) - 2 ;
  t = 1 << N ;
  a = a & ( t - 1 ) ;
  b = b & ( t - 1 ) ;
  int blen = Integer . numberOfTrailingZeros ( b ) - 2 ;
  int sb = b & ( 2 * ( blen - 1 ) - 1 ) ;
  int sblen ;
  if ( sb == 0 ) sblen = 0 ;
  else sblen = Integer . numberOfTrailingZeros ( sb ) - 2 ;
  int s = ( 1 << sblen ) - 1 ;
  int ymax = b | s ;
  int T = 1 << ( N - 1 ) ;
  int ans = T - a ;
  if ( ymax < T + a ) ans += ymax - T + 1 + T - a ;
  else ans += T ;
  System . out . println ( ans ) ;
}
