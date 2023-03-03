public static int input ( ) {
  int counter = 0 ;
  long ans = 0 ;
  for ( int index = 0 ;
  index < S . length ( ) ;
  index ++ ) {
    if ( ( S . charAt ( index ) == 'W' ) ) {
      ans += index - counter ;
      counter ++ ;
    }
  }
  return ( int ) ans ;
}
