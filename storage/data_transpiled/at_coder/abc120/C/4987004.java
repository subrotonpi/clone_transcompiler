public static void input ( ) {
  S = new LinkedList < > ( ) ;
  S . add ( input ) ;
  String prev = "" ;
  int index = 0 ;
  int ans = 0 ;
  while ( index < S . size ( ) ) {
    if ( prev . equals ( "" ) ) {
      prev = S . get ( index ) ;
      index = index + 1 ;
      continue ;
    }
    if ( S . get ( index ) != prev ) {
      S . remove ( index ) ;
      S . remove ( index - 1 ) ;
      ans = ans + 2 ;
      if ( S . size ( ) == 0 ) {
        break ;
      }
      index = index - 2 > 0 ? index - 2 : 0 ;
      prev = "" ;
    }
    else {
      prev = S . get ( index ) ;
      index = index + 1 ;
    }
  }
  System . out . println ( ans ) ;
}
