static final String getPath ( ) throws IOException {
  File inf = new File ( "C-small-attempt0.in" ) ;
  FileReader f_in = new FileReader ( inf ) ;
  FileWriter f_out = new FileWriter ( "out.txt" ) ;
  HashMap < Integer , Integer > dic = new HashMap < Integer , Integer > ( ) ;
  dic . put ( "0" , new Integer ( 0 ) ) ;
  int m = Integer . parseInt ( lin . substring ( 0 , 1 ) ) ;
  int n = Integer . parseInt ( lin . substring ( 1 , 1 ) ) ;
  HashMap < Integer , Integer > dict = new HashMap < Integer , Integer > ( ) ;
  int [ ] board = new int [ range ( 1 , T + 1 ) ] ;
  for ( int j = 0 ;
  j < range ( m , n ) ;
  j ++ ) {
    int cord = cros ( board , m , n ) ;
    if ( cord == ( - 1 , - 1 ) ) break ;
    for ( int x1 : xrange ( cord [ 0 ] , cord [ 2 ] + 1 ) ) for ( int y1 : xrange ( cord [ 1 ] , cord [ 3 ] + 1 ) ) board [ x1 ] [ y1 ] = - 1 ;
  }
  int side = cord [ 2 ] - cord [ 0 ] + 1 ;
  try {
    dict . put ( side , 1 ) ;
  }
  catch ( Exception e ) {
    dict . put ( side , 1 ) ;
  }
  System . out . println ( f_out . getAbsolutePath ( ) + "." + Arrays . toString ( dict . keys ( ) ) ) ;
  String [ ] ls = new String [ 2 ] ;
  for ( int l = 0 ;
  l < ls . length ;
  l ++ ) {
    ls [ l ] = ls [ l ] ;
  }
  for ( int l = 0 ;
  l < ls . length ;
  l ++ ) {
    ls [ l ] = ls [ l ] ;
  }
  return ls [ 0 ] ;
}
