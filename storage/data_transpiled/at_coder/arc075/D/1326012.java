public static int solve ( int k , int d , int fl ) {
  if ( k <= 1 ) {
    if ( d == 0 ) {
      return 10 * k ;
    }
    return 0 ;
  }
  int x = ( - d ) % 10 ;
  int c = 9 - x + 1 - fl ;
  d -= 10 * ( k - 1 ) * x - x ;
  return c * solve ( k - 2 , Math . abs ( d ) / 10 , 0 ) ;
}
