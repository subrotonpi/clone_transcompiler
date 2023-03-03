, * n = Integer . parseInt ( 0 ) , * h = Integer . parseInt ( 0 ) ) {
  int m = 1 ;
  for ( int t = 0 ;
  t < n ;
  t ++ ) {
    int s = t - ( t > 0 ? 1 : 0 ) , u = t + ( t < n - 1 ? 1 : 0 ) ;
    if ( h [ s ] < h [ t ] > h [ u ] || t < 1 || t > n - 2 ) {
      while ( s > 0 && h [ s - 1 ] < h [ s ] ) s -- ;
      while ( u < n - 1 && h [ u + 1 ] < h [ u ] ) u ++ ;
    }
    m = Math . max ( m , u - s + 1 ) ;
  }
  System . out . println ( m ) ;
}
