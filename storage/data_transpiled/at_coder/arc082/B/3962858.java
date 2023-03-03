public static int [ ] getP ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] P = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] Q = P . clone ( ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( P [ i ] == Q [ i ] ) {
      count ++ ;
    }
  }
  return Q ;
}
