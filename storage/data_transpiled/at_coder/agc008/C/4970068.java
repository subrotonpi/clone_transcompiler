public static int aI ( int aO , int aT , int aJ , int aL , int aS , int aZ ) {
  int R = ( ( aI % 2 + aJ % 2 + aL % 2 ) >= 2 ) ? Math . min ( aI , aJ , aL ) : 1 ;
  int ans = aO + 2 * ( ( aI - R ) / 2 ) + 2 * ( ( aJ - R ) / 2 ) + 2 * ( ( aL - R ) / 2 ) + 3 * R ;
  System . out . println ( ans ) ;
  return ans ;
}
