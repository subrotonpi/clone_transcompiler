static final String [ ] [ ] read ( Reader reader ) throws IOException {
  final String ns = reader . readLine ( ) . replaceAll ( " " , "" ) ;
  final int ni = reader . nextInt ( ) ;
  final NumberReader nm = reader . nextInt ( ) ;
  final NumberReader nl = reader . nextInt ( ) ;
  final int h = nm . nextInt ( ) ;
  final int w = nm . nextInt ( ) ;
  final char [ ] [ ] a = new char [ h + 2 ] [ ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    a [ i ] = new char [ w + 1 ] ;
  }
  for ( int i = 0 ;
  i < w ;
  i ++ ) {
    a [ i ] [ 0 ] = '#' ;
  }
  a [ w + 1 ] [ 0 ] = '#' ;
  for ( int i = 0 ;
  i < w + 2 ;
  i ++ ) {
    a [ i ] [ 1 ] = '#' ;
  }
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    a [ i + 1 ] [ 0 ] = '#' ;
  }
  for ( int i = 0 ;
  i < w + 2 ;
  i ++ ) {
    a [ i + 1 ] [ 0 ] = '#' ;
  }
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    a [ i + 1 ] [ 1 ] = '#' ;
  }
  for ( int i = 0 ;
  i < w + 2 ;
  i ++ ) {
    a [ i + 1 ] [ 0 ] = '#' ;
  }
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    a [ i + 1 ] [ 1 ] = '#' ;
  }
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    a [ i + 1 ] [ 0 ] = '#' ;
  }
  for ( int i = 0 ;
  i < w ;
  i ++ ) {
    a [ i + 1 ] [ 1 ] = '#' ;
  }
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    a [ i + 1 ] [ 0 ] = '#' ;
  }
  for ( int i = 0 ;
  i < w ;
  i ++ ) {
    a [ i + 1 ] [ 1 ] = '#' ;
  }
  return a ;
}
