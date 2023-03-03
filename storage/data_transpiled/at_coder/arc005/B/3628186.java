public static void main ( String [ ] args ) {
  String x , y , w ;
  x = input . nextLine ( ) ;
  y = input . nextLine ( ) ;
  w = input . nextLine ( ) ;
  int x = Integer . parseInt ( x ) - 1 ;
  int y = Integer . parseInt ( y ) - 1 ;
  char [ ] [ ] c = new char [ 9 ] [ 9 ] ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) {
    c [ i ] = input . toCharArray ( ) ;
  }
  int dx = 0 ;
  int dy = 0 ;
  if ( w . contains ( "R" ) ) {
    dx = 1 ;
  }
  if ( w . contains ( "L" ) ) {
    dx = - 1 ;
  }
  if ( w . contains ( "U" ) ) {
    dy = - 1 ;
  }
  if ( w . contains ( "D" ) ) {
    dy = - 1 ;
  }
}
