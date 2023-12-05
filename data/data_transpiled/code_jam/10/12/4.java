static int minCost ( int at , int prev ) {
  final int cost ;
  if ( DP . containsKey ( new Integer ( at ) ) ) {
    return DP . get ( new Integer ( at ) ) ;
  }
  if ( at == N ) {
    return 0 ;
  }
  cost = minCost ( at + 1 , prev ) + D ;
  for ( int i = 0 ;
  i < 256 ;
  i ++ ) {
    if ( Math . abs ( i - prev ) <= M || prev == - 1 ) {
      cost = Math . min ( cost , minCost ( at + 1 , i ) + Math . abs ( i - A [ at ] ) ) ;
    }
    if ( Math . abs ( i - A [ at ] ) < Math . abs ( A [ at ] - prev ) && ( prev == - 1 || Math . abs ( i - prev ) <= M ) ) {
      cost = Math . min ( cost , minCost ( at , i ) + I ) ;
    }
  }
  DP . put ( new Integer ( at ) , cost ) ;
  return cost ;
}
