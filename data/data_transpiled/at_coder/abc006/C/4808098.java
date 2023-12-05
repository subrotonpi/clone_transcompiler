public static int hum ( int hum , int leg ) {
  int o , c ;
  if ( leg % 2 == 0 ) {
    o = 0 ;
  }
  else {
    o = 1 ;
    hum -- ;
    leg -= 3 ;
  }
  c = ( int ) ( ( leg - 2 * hum ) / 2 ) ;
  m = ( int ) ( hum - c ) ;
  if ( m < 0 || c < 0 ) {
    System . out . println ( "-1 -1 -1" ) ;
  }
  else {
    System . out . println ( m + " " + o + " " + c ) ;
  }
  return o ;
}
