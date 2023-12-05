public static int input ( ) {
  int start = - 1 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( start < 0 && s . charAt ( i ) == 'A' ) {
      start = i ;
    }
    if ( s . charAt ( i ) == 'Z' ) {
      goal = i ;
    }
  }
  return ( goal - start + 1 ) ;
}
