static final String [ ] [ ] a = new String [ 10 ] [ ] ;
for ( int i = 0 ;
i < 10 ;
i ++ ) {
  a [ i ] = new String [ 10 ] ;
}
{
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    a [ i ] [ i ] = input . next ( ) ;
  }
}
{
  for ( int dx = - 1 , dy = 0 ;
  dx < 10 ;
  dx ++ , dy = 1 ;
  dy ++ ) {
    if ( 0 <= x + dx && 0 <= y + dy && 0 <= x + dy && 0 <= x + dy ) {
      if ( a [ y + dy ] [ x + dx ] . equals ( "o" ) ) {
        a [ y + dy ] [ x + dx ] = "x" ;
        search ( a , x + dx , y + dy ) ;
      }
    }
  }
}
{
}
private boolean land ( String [ ] [ ] a ) {
}
}
