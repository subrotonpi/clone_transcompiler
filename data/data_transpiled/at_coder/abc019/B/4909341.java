public static String [ ] Ss ( ) {
  String [ ] Ss = new String [ input . nextInt ( ) ] ;
  ArrayList < String > chars = new ArrayList < String > ( ) ;
  StringBuilder sb = new StringBuilder ( Ss [ 0 ] ) ;
  for ( int s = 1 ;
  s < Ss . length ;
  s ++ ) {
    if ( Ss [ s ] . equals ( sb ) ) {
    }
  }
  return chars . toArray ( ) ;
}
