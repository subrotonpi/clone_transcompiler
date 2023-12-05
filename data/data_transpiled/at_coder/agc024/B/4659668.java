public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] P = new int [ N ] ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) {
    P [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] T = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) {
    T [ i ] = P [ i ] ;
  }
  return T ;
}
