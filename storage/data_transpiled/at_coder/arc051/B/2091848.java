public static int K = Integer . parseInt ( input ) {
  int [ ] f = new int [ 42 ] ;
  f [ 0 ] = 1 ;
  f [ 1 ] = 1 ;
  for ( int k = 2 ;
  k < 42 ;
  k ++ ) {
    f [ k ] = f [ k - 1 ] + f [ k - 2 ] ;
  }
  return f [ K + 1 ] + f [ K ] ;
}
