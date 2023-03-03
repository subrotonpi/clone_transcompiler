public static int getMoves ( int left , int num , int base ) {
  if ( left <= base && base <= left + num - 1 ) {
    return ( base - left ) * ( base - left + 1 ) / 2 + ( left + num - 1 - base ) * ( left + num - 1 - base + 1 ) / 2 ;
  }
  else if ( base < left ) {
    return ( left + num - 1 - base ) * ( left + num - 1 - base + 1 ) / 2 - ( left - base - 1 ) * ( left - base - 1 + 1 ) / 2 ;
  }
  else {
    return ( base - left ) * ( base - left + 1 ) / 2 - ( base - ( left + num ) ) * ( base - ( left + num ) + 1 ) / 2 ;
  }
  int r_pos = 0 ;
  int g_pos = 0 ;
  int b_pos = 0 ;
  int min_moves = 10 * 100 ;
  for ( g_pos = - 500 ;
  g_pos < 501 ;
  g_pos ++ ) {
    if ( ( r - 1 ) / 2 - 100 < g_pos ) r_pos = - ( ( r - 1 ) / 2 ) - 100 ;
    else r_pos = g_pos - r ;
    if ( - ( ( b - 1 ) / 2 ) + 100 > g_pos + g ) b_pos = - ( ( b - 1 ) / 2 ) + 100 ;
    else b_pos = g_pos + g ;
    int moves = 0 ;
    moves += getMoves ( r_pos , r , - 100 ) ;
    moves += getMoves ( g_pos , g , 0 ) ;
    moves += getMoves ( b_pos , b , 100 ) ;
    if ( moves < min_moves ) min_moves = moves ;
  }
  System . out . println ( min_moves ) ;
  return min_moves ;
}
