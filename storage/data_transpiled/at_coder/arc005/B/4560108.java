public static int f ( int i ) {
  if ( i < 0 ) {
    return - i ;
  }
  else if ( i > 8 ) {
    return 16 - i ;
  }
  else {
    return i ;
  }
  String x , y , W ;
  x = input . split ( " " ) [ 0 ] ;
  y = input . split ( " " ) [ 1 ] ;
  W = input . split ( " " ) [ 2 ] ;
  x = Integer . parseInt ( x ) - 1 ;
  y = Integer . parseInt ( y ) - 1 ;
  css = new char [ 9 ] ;
  for ( int i = 0 ;
  i < css . length ;
  i ++ ) css [ i ] = input . charAt ( i ) ;
  int dx ;
  int dy ;
  if ( W . contains ( "R" ) ) {
    dx = 1 ;
  }
  else if ( W . contains ( "L" ) ) {
    dx = - 1 ;
  }
  else {
    dx = 0 ;
  }
  if ( W . contains ( "D" ) ) {
    dy = 1 ;
  }
  else if ( W . contains ( "U" ) ) {
    dy = - 1 ;
  }
  else {
    dy = 0 ;
  }
  poss = new char [ 4 ] ;
  for ( int t = 0 ;
  t < 4 ;
  t ++ ) {
    poss [ t ] = new char [ t ] ;
  }
  anss = '' ;
  for ( int x = 0 ;
  x < poss . length ;
  x ++ ) anss [ y ] = css [ f ( y ) ] [ f ( x ) ] ;
  System . out . println ( anss ) ;
  return 0 ;
}
