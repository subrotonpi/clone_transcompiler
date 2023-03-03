public static double go ( int left , int pos ) {
  if ( pos == m ) {
    int t = 0 ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      if ( s . substring ( 0 , i ) . equals ( s . substring ( pos - i , pos ) ) ) {
        t = i ;
      }
    }
    pos = t ;
  }
  if ( left == 0 ) {
    return 0 ;
  }
  if ( dp [ left ] [ pos ] != - 1 ) {
    return dp [ left ] [ pos ] ;
  }
  double res = 0 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    int c = ( let [ i ] - 'A' ) ;
    double npos = jump [ pos ] [ c ] ;
    double cur = 0.0 ;
    if ( npos == m ) {
      cur = 1.0 ;
    }
    cur = ( go ( left - 1 , npos ) + cur ) / k ;
    res += cur ;
  }
  dp [ left ] [ pos ] = res ;
  return res ;
}
