static final double [ ] [ ] resize ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  double [ ] [ ] e = new double [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) e [ i ] = resize ( e ) ;
  return e ;
}
