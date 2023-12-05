static private String getLine ( ) throws IOException {
  final String line ;
  final int [ ] part = new int [ 2 ] ;
  int a , b , p ;
  int i ;
  line = line . trim ( ) ;
  if ( line . length ( ) > 0 ) {
    line = line . substring ( 0 , line . length ( ) - 1 ) ;
  }
  return line ;
}
