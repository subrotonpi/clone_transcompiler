static final int [ ] [ ] resize ( int [ ] [ ] src ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  src = new int [ N - 1 ] [ ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) src [ i ] = copyOf ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  final int MOD = 10 * 9 + 7 ;
  int [ ] [ ] es = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    es [ i ] = new int [ N ] ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    es [ i ] [ 0 ] = i ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    es [ i ] [ 0 ] = i ;
  }
  return mw ;
}
