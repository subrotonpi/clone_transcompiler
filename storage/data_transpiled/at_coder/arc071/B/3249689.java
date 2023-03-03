@ VisibleForTesting static Iterable < Integer > accumulate ( int n , int m ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
  int [ ] xA = Lists . newArrayList ( ) ;
  for ( int p = 0 ;
  p < n ;
  ++ p ) {
    xA [ p ] = c - p ;
  }
  Arrays . sort ( xA ) ;
  int [ ] yA = Lists . newArrayList ( ) ;
  for ( int p = 0 ;
  p < m ;
  ++ p ) {
    yA [ p ] = c - p ;
  }
  int mod = 10 * 9 + 7 ;
  int x = 0 ;
  for ( int mul = n , x1 = 0 , x2 = xA [ n / 2 ] + 1 ;
  mul < x2 ;
  ++ mul , x1 += x2 ) {
    x = ( x + mul * ( x1 + x2 ) ) % mod ;
  }
  int ans = 0 ;
  for ( int mul = m , y1 = 0 , y2 = yA [ m / 2 ] + 1 ;
  mul < y2 ;
  ++ mul , y1 += y2 ) {
    ans = ( ans + mul * ( y1 + y2 ) * x ) % mod ;
  }
  System . out . println ( ans ) ;
  return x ;
}
