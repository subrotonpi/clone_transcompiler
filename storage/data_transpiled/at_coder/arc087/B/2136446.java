public static void input ( String s ) {
  String [ ] s = input . split ( "T" ) ;
  int x , y ;
  int len = s . length ;
  int [ ] dx = new int [ len ] ;
  int [ ] dy = new int [ len ] ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    dx [ i ] = s [ i ] ;
    dy [ i ] = s [ i ] ;
  }
  x = Math . abs ( x - dx [ 0 ] ) ;
  y = Math . abs ( y ) ;
  dx = new int [ len ] ;
  for ( int i = 1 ;
  i < len ;
  i ++ ) {
    dx [ i ] = s [ i ] ;
  }
  int px = 0 ;
  int py = 0 ;
  for ( int i = 0 ;
  i < dx . length ;
  i ++ ) {
    if ( px > x ) px -= dx [ i ] ;
    else px += dx [ i ] ;
  }
  for ( int i = 0 ;
  i < dy . length ;
  i ++ ) {
    if ( py > y ) py -= dy [ i ] ;
    else py += dy [ i ] ;
  }
  if ( px == x && py == y ) System . out . println ( "Yes" ) ;
  else System . out . println ( "No" ) ;
}
