@ VisibleForTesting static int [ ] [ ] solve ( ) {
  int Q = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] table = new int [ Q ] [ ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int A = Integer . parseInt ( input ( ) ) ;
    int B = Integer . parseInt ( input ( ) ) ;
    if ( A > B ) {
      table [ i ] [ B ] = A ;
    }
    else {
      table [ i ] [ A ] = B ;
    }
  }
  return table ;
}
