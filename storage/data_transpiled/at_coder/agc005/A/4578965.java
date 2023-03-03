@ InputFunction public static void input ( ) {
  @ SuppressWarnings ( "resource" ) LinkedList < Integer > lt = new LinkedList < Integer > ( ) ;
  int r = 0 ;
  int ans = 0 ;
  while ( r < X . length ( ) ) {
    if ( ( X . substring ( r , r + 2 ) . equals ( "ST" ) ) ) {
      ans += 2 ;
      r += 2 ;
      continue ;
    }
    else if ( ( lt . size ( ) > 0 ) && ( X . charAt ( lt . size ( ) - 1 ) + X . charAt ( r ) == 'ST' ) ) {
      ans += 2 ;
      lt . removeLast ( ) ;
      r ++ ;
      continue ;
    }
    if ( ( X . charAt ( r ) == 'S' ) ) {
      lt . addLast ( r ) ;
      r ++ ;
    }
    else {
      r ++ ;
      lt . clear ( ) ;
    }
  }
  System . out . println ( X . length ( ) - ans ) ;
}
