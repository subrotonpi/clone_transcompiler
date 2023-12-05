public static int N ( int N , int D ) {
  int X , Y ;
  X = Integer . parseInt ( input . nextLine ( ) ) ;
  Y = Integer . parseInt ( input . nextLine ( ) ) ;
  X = Math . abs ( X ) ;
  Y = Math . abs ( Y ) ;
  if ( X % D != 0 || Y % D != 0 || ( N * D + X - Y ) % ( 2 * D ) != 0 || X + Y > N * D ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  /* fourcomb(n,k) */
  {
    int res = 1 ;
    for ( int i = 0 ;
    i < k ;
    i ++ ) {
      res *= ( n - i ) / ( k - i ) ;
      res /= 4 ;
    }
    return res ;
  }
  int ans = 0 ;
  for ( int x = X / D ;
  x < ( N * D + X - Y ) / ( 2 * D ) + 1 ;
  x ++ ) {
    int y = x - X / D ;
    int z = ( N * D + X + Y ) / ( 2 * D ) - x ;
    int w = z - Y / D ;
    ans += fourcomb ( N , x ) * fourcomb ( N - x , y ) * fourcomb ( N - x - y , z ) * 0.25 * w ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
