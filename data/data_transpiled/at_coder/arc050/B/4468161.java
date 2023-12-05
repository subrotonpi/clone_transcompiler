public static int [ ] [ ] R = input . readInt ( ) {
  int x = input . readInt ( ) ;
  int y = input . readInt ( ) ;
  int pmax = ( R + B ) / ( Math . min ( x , y ) + 1 ) ;
  int pmin = 0 ;
  int point = ( pmax + pmin ) / 2 ;
  while ( true ) {
    if ( R >= point && B >= point && ( R - point ) / ( x - 1 ) + ( B - point ) / ( y - 1 ) >= point ) {
      pmin = point ;
      if ( pmin == pmax ) break ;
      point = ( pmax + point + 1 ) / 2 ;
    }
    else {
      pmax = point - 1 ;
      if ( pmin == pmax ) break ;
      point = ( pmin + point ) / 2 ;
    }
  }
  System . out . println ( pmin ) ;
  return null ;
}
