@ VisibleForTesting static String solve ( int x , int y ) throws IOException {
  StringBuilder directions = new StringBuilder ( ) ;
  if ( x > 0 ) {
    for ( int i = 0 ;
    i < x ;
    i ++ ) {
      directions . append ( "WE" ) ;
    }
  }
  else if ( x < 0 ) {
    for ( int i = 0 ;
    i < - x ;
    i ++ ) {
      directions . append ( "EW" ) ;
    }
  }
  if ( y > 0 ) {
    for ( int i = 0 ;
    i < y ;
    i ++ ) {
      directions . append ( "SN" ) ;
    }
  }
  else if ( y < 0 ) {
    for ( int i = 0 ;
    i < - y ;
    i ++ ) {
      directions . append ( "NS" ) ;
    }
  }
  return directions . toString ( ) ;
}
