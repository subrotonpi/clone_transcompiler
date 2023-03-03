static final double iceil ( int p , int q ) throws IOException {
  assert p >= 0 ;
  assert q > 0 ;
  if ( p == 0 ) {
    return 0 ;
  }
  else {
    return ( p - 1 ) / q + 1 ;
  }
}
