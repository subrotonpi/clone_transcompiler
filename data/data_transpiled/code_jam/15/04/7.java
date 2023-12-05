@ String richard = "RICHARD" ;
String gabriel = "GABRIEL" ;
int T = Integer . parseInt ( readLine ( ) ) ;
for ( int x : xrange ( 1 , T + 1 ) ) {
  int X = Integer . parseInt ( readLine ( ) ) ;
  int R = Integer . parseInt ( readLine ( ) ) ;
  int C = Integer . parseInt ( readLine ( ) ) ;
  int y = gabriel ;
  if ( X > 6 ) y = richard ;
  else if ( R * C % X != 0 ) y = richard ;
  else if ( X > max ( R , C ) ) y = richard ;
  else if ( ( X + 1 ) / 2 > min ( R , C ) ) y = richard ;
  else if ( X == 4 ) {
    if ( min ( R , C ) == 2 ) y = richard ;
  }
  else if ( X == 5 ) {
    if ( min ( R , C ) == 3 && max ( R , C ) < 10 ) y = richard ;
  }
  else if ( X == 6 ) {
    if ( min ( R , C ) == 3 ) y = richard ;
  }
  System . out . println ( "Case #" + x + ": " + y ) ;
}
