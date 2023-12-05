static int solve ( int [ ] a ) {
  final int res = 0 ;
  for ( int t : xrange ( 1 , a . length ) ) {
    if ( a [ t - 1 ] <= t ) continue ;
    for ( int i : xrange ( t , a . length ) ) {
      if ( a [ i ] <= t ) {
        res += i - t + 1 ;
        final int saved = a [ i ] ;
        for ( int j : xrange ( i , t - 1 , - 1 ) ) a [ j ] = a [ j - 1 ] ;
        a [ t - 1 ] = saved ;
        break ;
      }
    }
  }
  return res ;
}
