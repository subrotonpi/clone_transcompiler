public static int N = Integer . parseInt ( input ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    A [ i ] = A [ i ] ;
  }
  Arrays . sort ( A , Collections . reverseOrder ( ) ) ;
  do {
    int tmp = a [ 0 ] % a [ 1 ] ;
    if ( tmp == 0 ) {
      return tmp ;
    }
  }
  while ( tmp > 0 ) ;
  return tmp ;
}
