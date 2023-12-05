static final void solve ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a == b ) {
    System . out . println ( 1 ) ;
    return ;
  }
  int t = a ^ b ;
  int N = bitLength ( t ) ;
  a = a & ( 2 * N - 1 ) ;
  b = b & ( 2 * N - 1 ) ;
  int blen = bitLength ( b ) ;
  int sb = b & ( 2 * ( blen - 1 ) - 1 ) ;
  int sblen = bitLength ( sb ) ;
  int s = 2 * sblen - 1 ;
  int ymax = b | s ;
  int T = 2 * ( N - 1 ) ;
  int ans = T - a ;
  if ( ymax < T + a ) ans += ymax + 1 - a ;
  else ans += T ;
  System . out . println ( ans ) ;
}
