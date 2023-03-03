public static void main ( String input ) {
  int s = Integer . parseInt ( input ) ;
  Set < Integer > numset = new HashSet < Integer > ( ) ;
  for ( int i = 2 ;
  i < 1000001 ;
  i += 1 ) {
    if ( s % 2 == 0 ) {
      s = s / 2 ;
    }
    else {
      s = ( s * 3 ) + 1 ;
    }
    if ( new Integer ( s ) <= numset . size ( ) ) {
      System . out . println ( i ) ;
      break ;
    }
    else {
      numset . add ( s ) ;
    }
  }
}
