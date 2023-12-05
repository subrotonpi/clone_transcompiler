static final boolean isIn ( InputStream in , int x , int y , int x , int y ) throws IOException {
  boolean DEBUG = false ;
  int [ ] parts = new int [ x * y ] ;
  int [ ] got = new int [ x * y ] ;
  for ( int i : xrange ( parts . length ) ) got [ i ] = types [ i ] . run ( parts [ i ] ) ;
  return got [ 0 ] ;
}
