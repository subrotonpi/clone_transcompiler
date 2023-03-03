public static int [ ] getN ( ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  Arrays . sort ( A ) ;
  return A [ 0 ] ;
}
