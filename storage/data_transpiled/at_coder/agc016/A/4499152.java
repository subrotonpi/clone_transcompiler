public static double input ( ) {
  Set < Character > m = new HashSet < Character > ( ) ;
  m . add ( s ) ;
  if ( m . size ( ) == 1 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  double ans = Double . MAX_VALUE ;
  for ( Character k : m ) {
    int cnt = 0 ;
    String tt = s ;
    do {
      cnt ++ ;
      StringBuffer t = new StringBuffer ( ) ;
      for ( int i = 0 ;
      i < tt . length ( ) - 1 ;
      i ++ ) {
        if ( tt . charAt ( i ) == k || tt . charAt ( i + 1 ) == k ) {
          t . append ( k ) ;
        }
        else {
          t . append ( tt . charAt ( i + 1 ) ) ;
        }
      }
      tt = t . toString ( ) ;
    }
    while ( true ) ;
    if ( new HashSet < Character > ( tt ) . size ( ) == 1 ) {
      break ;
    }
  }
  ans = Math . min ( ans , cnt ) ;
  return ans ;
}
