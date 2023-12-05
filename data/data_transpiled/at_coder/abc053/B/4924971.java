public static int input ( ) {
  int head = 0 ;
  int end = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == 'A' ) {
      head = i ;
      break ;
    }
  }
  for ( int i = S . length ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    if ( S . charAt ( i ) == 'Z' ) {
      end = i + 1 ;
      break ;
    }
  }
  System . out . println ( end - head ) ;
  return end ;
}
