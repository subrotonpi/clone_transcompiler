public static int findLongest ( int node ) {
  visited [ node ] = true ;
  if ( ! graph [ node ] . contains ( node ) ) return 1 ;
  int maxChild = 0 ;
  for ( int i : graph [ node ] ) {
    if ( visited [ i ] ) continue ;
    maxChild = Math . max ( maxChild , findLongest ( i ) ) ;
  }
  return maxChild + 1 ;
}
