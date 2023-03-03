public static int solve ( int d , int k , int outer ) {
  if ( k <= 1 ) return d == 0 ? 10 * k : 0 ;
  int t = ( - d ) % 10 ;
  d -= t * 10 * ( k - 1 ) - t ;
  return ( 10 - t - outer ) * solve ( Math . abs ( d / 10 ) , k - 2 , 0 ) ;
}
