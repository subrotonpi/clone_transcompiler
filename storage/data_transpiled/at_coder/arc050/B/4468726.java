public static int R = Integer . parseInt ( input ) {
  int x = input . nextInt ( ) , y = input . nextInt ( ) ;
  if ( R / x < B / y ) {
    R = B ;
    B = R ;
    x = y ;
    y = x ;
  }
  int pmin = R / x ;
  int pmax ;
  int point ;
  if ( B <= pmin ) {
    pmin = B ;
    pmax = B ;
  }
  else {
    pmax = pmin + ( B - pmin ) / y ;
    point = ( pmax + pmin ) / 2 ;
  }
  while ( pmin < pmax ) {
    if ( ( R - point ) / ( x - 1 ) + ( B - point ) / ( y - 1 ) >= point ) {
      pmin = point ;
      point = ( pmax + point + 1 ) / 2 ;
    }
    else {
      pmax = point - 1 ;
      point = ( pmin + point ) / 2 ;
    }
  }
  System . out . println ( pmin ) ;
  return pmax ;
}
