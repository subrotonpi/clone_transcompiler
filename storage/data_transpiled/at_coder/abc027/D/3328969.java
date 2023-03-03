public static void input ( Scanner S ) {
  ArrayList < Integer > rightGain = new ArrayList < Integer > ( ) ;
  int g = 0 ;
  for ( int i = S . length ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    switch ( S . charAt ( i ) ) {
      case '+' : g ++ ;
      break ;
      case '-' : g -- ;
      break ;
      default : rightGain . add ( g ) ;
    }
  }
  int half = rightGain . size ( ) / 2 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < half ;
  i ++ ) {
    g = rightGain . get ( i ) ;
    if ( i < half ) g *= - 1 ;
    ans += g ;
  }
  System . out . println ( ans ) ;
}
