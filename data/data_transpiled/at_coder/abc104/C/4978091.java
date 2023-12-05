@ VisibleForTesting static double solve ( int D , int G ) {
  int [ ] p = new int [ D ] , c = new int [ D ] ;
  for ( int i = 0 ;
  i < D ;
  i ++ ) {
    int p_ = Integer . parseInt ( input . nextLine ( ) ) ;
    int c_ = Integer . parseInt ( input . nextLine ( ) ) ;
    p [ i ] = p_ ;
    c [ i ] = c_ ;
  }
  return Math . min ( G , p [ D - 1 ] ) ;
}
