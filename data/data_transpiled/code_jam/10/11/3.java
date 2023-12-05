static public String [ ] rotate ( String [ ] a ) {
  final String [ ] b = new String [ a . length ] ;
  int n = a . length ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    String str = a [ i ] ;
    str = str . replace ( "." , "" ) ;
    str = str . substring ( 0 , str . length ( ) - 1 ) ;
    str += "." ;
    b [ i ] = str ;
  }
  return b ;
}
