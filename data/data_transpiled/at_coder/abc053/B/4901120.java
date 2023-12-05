public static String input ( ) {
  int [ ] index = new int [ 2 ] ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'A' ) {
      index [ 0 ] = i ;
      break ;
    }
  }
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'Z' ) {
      index [ 1 ] = i ;
      break ;
    }
  }
  int count = s . length ( ) ;
  return s . substring ( index [ 0 ] , index [ 1 ] ) ;
}
