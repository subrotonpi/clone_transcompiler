public static void input ( Scanner s ) {
  LinkedList < Character > S = new LinkedList < Character > ( s ) ;
  boolean f = false ;
  int k = 1 ;
  boolean flag = false ;
  while ( S . size ( ) > 2 ) {
    if ( k == S . size ( ) - 1 ) {
      if ( flag ) {
        k = 1 ;
        flag = false ;
        continue ;
      }
      break ;
    }
    if ( S . get ( k - 1 ) != S . get ( k + 1 ) ) {
      S . remove ( k ) ;
      f = ! f ;
      flag = true ;
    }
    else {
      k ++ ;
    }
  }
  if ( f ) {
    System . out . println ( "First" ) ;
  }
  else {
    System . out . println ( "Second" ) ;
  }
}
