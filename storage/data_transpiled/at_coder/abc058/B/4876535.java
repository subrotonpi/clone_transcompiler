public static String [ ] readInput ( ) {
  String a = readString ( ) ;
  String b = readString ( ) ;
  String [ ] c = new String [ aa ] ;
  int aa = a . length ( ) ;
  int bb = b . length ( ) ;
  if ( aa == bb ) {
    for ( int i = 0 ;
    i < aa ;
    i ++ ) {
      String x = a . substring ( i ) ;
      String y = b . substring ( i ) ;
      c [ i ] = x ;
      c [ i ] = y ;
    }
  }
  else {
    String m = a . substring ( bb - 1 ) ;
    for ( int i = 0 ;
    i < aa ;
    i ++ ) {
      String x = a . substring ( i ) ;
      String y = b . substring ( i ) ;
      c [ i ] = x ;
      c [ i ] = y ;
    }
    c [ i ] = m ;
  }
  return c ;
}
