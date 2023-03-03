public static void turn ( ) {
  int x , y , w ;
  char [ ] [ ] c = new char [ 9 ] [ ] ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) c [ i ] = input . toCharArray ( ) ;
  x = Integer . parseInt ( x ) - 1 ;
  y = Integer . parseInt ( y ) - 1 ;
  StringBuffer ans = new StringBuffer ( ) ;
  int dx = 0 , dy = 0 ;
  if ( w . contains ( "R" ) ) dx = 1 ;
  if ( w . contains ( "L" ) ) dx = - 1 ;
  if ( w . contains ( "U" ) ) dy = - 1 ;
  if ( w . contains ( "D" ) ) dy = 1 ;
  /*turn();*/
  if ( x + dx < 0 || 8 < x + dx ) dx *= - 1 ;
  if ( y + dy < 0 || 8 < y + dy ) dy *= - 1 ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    char cij = c [ y ] [ x ] ;
    ans . append ( cij ) ;
    turn ( ) ;
    x += dx ;
    y += dy ;
  }
  System . out . println ( ans ) ;
}
