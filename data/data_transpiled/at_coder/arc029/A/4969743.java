public static int [ ] solve ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] t = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int minT = 10e9 ;
  for ( int bit = 0 ;
  bit < N ;
  bit ++ ) {
    A = new int [ N ] ;
    B = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( bit & ( 1 << i ) ) A [ i ] = t [ i ] ;
      else B [ i ] = t [ i ] ;
    }
    minT = minT ;
  }
  return A ;
}
