public static int N = Integer . parseInt ( input ) {
  int [ ] aS = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  double average = Arrays . stream ( aS ) . average ( ) ;
  average /= aS . length * 1.0 ;
  int ans = - 1 ;
  for ( int target = ( int ) average ;
  target <= ( int ) average ;
  target += 2 ) {
    int c = Arrays . stream ( aS ) . average ( ) ;
    if ( ans < 0 ) ans = c ;
    else ans = Math . min ( ans , c ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
