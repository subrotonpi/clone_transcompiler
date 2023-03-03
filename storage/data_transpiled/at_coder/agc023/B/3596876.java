static final double [ ] S ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  double [ ] S = new double [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S = Math . roll ( S , 1 ) ;
    if ( ( S != S . length ) ) continue ;
    ans ++ ;
  }
  System . out . println ( ans * N ) ;
  return S ;
}
