public static boolean pos ( int x ) {
  if ( x == 0 ) {
    return Arrays . binarySearch ( jobs , x ) >= 0 ;
  }
  boolean worked = false ;
  for ( int i : xrange ( N ) ) {
    if ( workers [ i ] == 0 ) {
      workers [ i ] = 1 ;
      for ( int j : xrange ( N ) ) {
        if ( G [ i ] [ j ] == 1 && jobs [ j ] == 0 ) {
          worked = true ;
          jobs [ j ] = 1 ;
          if ( ! pos ( x - 1 ) ) return false ;
          jobs [ j ] = 0 ;
        }
      }
      workers [ i ] = 0 ;
    }
  }
  if ( ! worked ) return pos ( x - 1 ) ;
  return true ;
}
