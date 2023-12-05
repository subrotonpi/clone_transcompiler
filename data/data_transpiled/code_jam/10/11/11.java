@ Sys public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( args [ 0 ] ) ;
  int k = Integer . parseInt ( args [ 1 ] ) ;
  StringBuilder b = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < xrange ;
  i ++ ) b . append ( new String ( args [ 2 ] ) ) . append ( "." ) ;
  {
    it ( s , dir ) ;
    while ( 0 <= s . x && s . y < n ) {
      it ( b . substring ( s . x , s . y ) . charAt ( s . y ) ) ;
      s = s . x + dir . x ;
      s = s . y + dir . y ;
    }
  }
  boolean [ ] blue = new boolean [ n ] , red = new boolean [ n ] ;
  {
    it ( b . substring ( 0 , s . x ) . charAt ( s . y ) ) ;
  }
  {
    int bluec = 0 ;
    int redc = 0 ;
    for ( int i = 0 ;
    i < it ( b . length ( ) ) ;
    i ++ ) {
      if ( b . charAt ( i ) == 'B' ) {
        bluec ++ ;
        if ( bluec >= k ) blue [ bluec ] = true ;
      }
      else bluec = 0 ;
      if ( b . charAt ( i ) == 'R' ) {
        redc ++ ;
        if ( redc >= k ) red [ redc ] = true ;
      }
      else redc = 0 ;
    }
  }
  for ( int i = xrange . size ( ) ;
  i < xrange . size ( ) ;
  i ++ ) {
    it ( b . charAt ( i ) ) ;
  }
  if ( red && blue ) {
    return "Both" ;
  }
  else if ( red ) {
    return "Red" ;
  }
  else if ( blue ) {
    return "Blue" ;
  }
  else {
    return "Neither" ;
  }
}
