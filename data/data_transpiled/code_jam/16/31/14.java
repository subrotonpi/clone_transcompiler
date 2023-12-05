@ Sys public static String eachCase ( int N , int [ ] P ) {
  int max = - 1 , max2 = P [ 0 ] , argmax = 0 , argmax2 = 0 ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) {
    if ( max < P [ i ] ) {
      max2 = max ;
      max = P [ i ] ;
      argmax2 = argmax ;
      argmax = i ;
    }
    else if ( max2 < P [ i ] ) {
      max2 = P [ i ] ;
      argmax2 = i ;
    }
  }
  char maxParty = ( char ) ( argmax + 65 ) , max2Party = ( char ) ( argmax2 + 65 ) ;
  StringBuilder plan = new StringBuilder ( ) ;
  for ( int i : xrange ( ( max - max2 ) / 2 ) ) plan . append ( maxParty * 2 ) ;
  if ( ( max - max2 ) % 2 != 0 ) plan . append ( maxParty ) ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) {
    if ( i != argmax && i != argmax2 ) plan . append ( ( char ) ( i + 65 ) ) ;
  }
  for ( int i : xrange ( max2 ) ) plan . append ( maxParty + max2Party ) ;
  return plan . toString ( ) ;
}
