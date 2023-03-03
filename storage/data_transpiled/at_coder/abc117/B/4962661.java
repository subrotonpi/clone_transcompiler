static final double [ ] range ( int N ) {
  int N = Integer . parseInt ( input ( ) ) ;
  double [ ] L = new double [ N ] ;
  for ( int s : input ( ) . split ( ) ) {
    L [ s ] = Integer . parseInt ( input ( ) ) ;
  }
  return L ;
}
