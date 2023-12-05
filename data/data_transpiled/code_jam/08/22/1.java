static final int ff ( int res [ ] , int x ) throws IOException {
  int r = x ;
  while ( res [ r ] >= 0 ) {
    r = res [ r ] ;
  }
  if ( res [ x ] >= 0 ) {
    res [ x ] = r ;
  }
  return r ;
}
