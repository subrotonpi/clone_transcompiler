public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . readLine ( ) ) ;
  int B = Integer . parseInt ( input . readLine ( ) ) ;
  int K = Integer . parseInt ( input . readLine ( ) ) ;
  int P = 998244353 ;
  {
    final int x = 0 , lastx = 1 ;
    int y = 1 , lasty = 0 ;
    while ( b != 0 ) {
      final int q = a / b ;
      ( a = b ) = a % b ;
      ( x = lastx - q * x ) = x ;
      ( y = lasty - q * y ) = y ;
    }
    return lastx ;
  }
  {
    final int inv = egcd ( x , P ) . intValue ( ) ;
  }
  int Fact [ ] = new int [ N + 1 ] ;
  int Finv [ ] = new int [ N + 1 ] ;
  Fact [ 0 ] = 1 ;
  Finv [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    Fact [ i ] = ( i * Fact [ i - 1 ] ) % P ;
    Finv [ i ] = ( Finv [ i - 1 ] * inv ( i ) ) % P ;
  }
  int ans = 0 ;
  {
    final int tmp = ( Finv [ k ] * Finv [ N - k ] ) % P ;
    return ( Fact [ N ] * tmp ) % P ;
  }
  for ( int x = 0 ;
  x < N + 1 ;
  x ++ ) {
    final int y = ( K - x * A ) / B ;
    if ( x * A + y * B == K && 0 <= y && y <= N ) ans += ( NC ( x ) * NC ( y ) ) % P ;
  }
  System . out . println ( ans % P ) ;
  return ans ;
}
