public static void input ( Scanner s ) {
  int p = 0 ;
  int m = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    switch ( S . charAt ( i ) ) {
      case '+' : p ++ ;
      break ;
      case '-' : m ++ ;
      break ;
    }
  }
  ArrayList < Integer > l = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    switch ( S . charAt ( i ) ) {
      case '+' : p -- ;
      break ;
      case '-' : m -- ;
      break ;
      default : l . add ( p - m ) ;
    }
  }
  Collections . sort ( l ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < l . size ( ) ;
  i ++ ) {
    if ( i <= l . size ( ) / 2 - 1 ) ans -= l . get ( i ) ;
    else ans += l . get ( i ) ;
  }
  System . out . println ( ans ) ;
}
